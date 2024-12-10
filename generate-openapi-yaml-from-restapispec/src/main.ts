import { dump } from "js-yaml";
import * as fs from "node:fs/promises";
import { formatType, Records, RequestParam, ResponseParam } from "./records";
import { OpenAPiSpec, Schema } from "./openapi";

const buildDir = "generated";
fs.mkdir(buildDir, { recursive: true });

const meta = {
  openapi: "3.1.0",
  servers: [{ url: "https://sample.cybozu.com" }],
  info: {
    version: "1.0.0",
    title: "Kintone REST API",
    description: "This is an experimental",
  },
};

const securitySchemes = {
  PasswordAuth: {
    type: "apiKey",
    in: "header",
    name: "X-Cybozu-Authorization",
    description: "パスワード認証",
  },
  ApiTokenAuth: {
    type: "apiKey",
    in: "header",
    name: "X-Cybozu-API-Token",
    description: "APIトークン",
  },
  SessionAuth: {
    type: "apiKey",
    in: "cookie",
    name: "SESSIONID",
    description: "セッションID",
  },
};

const main = async (listJson: string) => {
  const records = JSON.parse(
    await fs.readFile(listJson, { encoding: "utf8" })
  ) as Records;
  const result: OpenAPiSpec = {
    paths: {},
  };
  for (const record of records.records) {
    const path = record.パス.value;
    if (!path) {
      console.log(`empty path: id = ${record.レコード番号.value}`);
      continue;
    }
    const method = record.HTTPメソッド.value.toLocaleLowerCase();
    if (!(path in result.paths)) {
      result.paths[path] = {};
    }
    if (method in result.paths[path]) {
      console.log(`duplicate method: path = ${path} method: ${method}`);
      continue;
    }
    console.log(path);

    result.paths[path][method] = {
      description: record.概要.value,
      requestBody: {
        content: {
          "application/json": {
            schema: {
              type: "object",
              properties: requestToSchema(record.リクエストパラメータ.value),
            },
          },
        },
      },
      responses: {
        "200": {
          content: {
            "application/json": {
              schema: {
                type: "object",
                properties: responseToSchema(record.レスポンスパラメータ.value),
              },
            },
          },
        },
      },
    };
  }
  const output = {
    ...result,
    ...meta,
    components: {
      securitySchemes,
    },
  };
  await fs.writeFile(`${buildDir}/api.yaml`, dump(output));
};

const requestToSchema = (
  requestParams: RequestParam[]
): {
  [key in string]: Schema;
} => {
  let properties: { [key in string]: CreatePathResult<RequestParam> } =
    {} as any;
  for (const param of requestParams) {
    const field = param.value.リクエストパラメータ名.value;
    properties = createPath(properties, field, param);
  }
  return createRequestSchemaMap(properties);
};

const createRequestSchemaMap = (properties: {
  [key in string]: CreatePathResult<RequestParam>;
}): { [key in string]: Schema } => {
  const result: { [key in string]: Schema } = {};
  for (const [key, prop] of Object.entries(properties)) {
    result[key] = createRequestSchema(prop);
  }
  return result;
};

const createRequestSchema = (prop: CreatePathResult<RequestParam>): Schema => {
  let schema: Schema;
  if (prop.param) {
    schema = {
      type: formatType(prop.param.value.リクエストパラメータ型.value),
      description: prop.param.value.リクエストパラメータ説明.value,
    };
  } else {
    schema = {
      type: "object",
    };
  }
  if (schema.type === "array") {
    if (prop.param.value.リクエストArrayの要素の型.value === "Object") {
      if (prop.properties) {
        schema.items = {
          type: "object",
          properties: createRequestSchemaMap(prop.properties),
        };
      } else {
        schema.items = {
          type: "object",
        };
      }
    }
    schema.items = {
      type: prop.param.value.リクエストArrayの要素の型.value!,
    };
  }
  if (schema.type === "object") {
    if (prop.properties) {
      schema.properties = createRequestSchemaMap(prop.properties);
    }
  }
  return schema;
};

const responseToSchema = (
  params: ResponseParam[]
): {
  [key in string]: Schema;
} => {
  let properties: { [key in string]: CreatePathResult<ResponseParam> } =
    {} as any;
  for (const param of params) {
    const field = param.value.レスポンスパラメータ名.value;
    properties = createPath(properties, field, param);
  }
  return createResponseSchemaMap(properties);
};

const createResponseSchemaMap = (properties: {
  [key in string]: CreatePathResult<ResponseParam>;
}): { [key in string]: Schema } => {
  const result: { [key in string]: Schema } = {};
  for (const [key, prop] of Object.entries(properties)) {
    result[key] = createResponseSchema(prop);
  }
  return result;
};

const createResponseSchema = (
  prop: CreatePathResult<ResponseParam>
): Schema => {
  let schema: Schema;
  if (prop.param) {
    schema = {
      type: formatType(prop.param.value.レスポンスパラメータ型.value),
      description: prop.param.value.レスポンスパラメータ説明.value,
    };
  } else {
    schema = {
      type: "object",
    };
  }
  if (schema.type === "array") {
    if (prop.param.value.レスポンスArrayの要素の型.value === "Object") {
      if (prop.properties) {
        schema.items = {
          type: "object",
          properties: createResponseSchemaMap(prop.properties),
        };
      } else {
        schema.items = {
          type: "object",
        };
      }
    }
  }
  if (schema.type === "object") {
    if (prop.properties) {
      schema.properties = createResponseSchemaMap(prop.properties);
    }
  }
  return schema;
};

type CreatePathResult<T> = {
  param: T;
  properties?: { [key in string]: CreatePathResult<T> };
};

const createPath = <T>(
  obj: { [key in string]: any },
  path: string,
  value: T
): { [key in string]: CreatePathResult<T> } => {
  let current: { [key in string]: any } = obj;
  let paths = path
    .replace(".[]", "")
    .split(".")
    .map((v) => v.replace("[]", ""));
  let last = paths.pop();
  while (paths.length > 0) {
    let head: string, tail: string[];
    if (paths.length === 1) {
      head = paths[0];
      tail = [];
    } else {
      [head, ...tail] = paths;
    }
    paths = tail;
    if (!(head in current)) {
      current[head] = {};
    }
    if (!("properties" in current[head])) {
      current[head]["properties"] = {};
    }
    current = current[head]["properties"];
  }
  current[last!] = { param: value };
  return obj;
};

const listJsonFile = process.argv[2];

main(listJsonFile);
