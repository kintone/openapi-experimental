import { dump } from "js-yaml";
import * as fs from "node:fs/promises";

const buildDir = "generated";
fs.mkdir(buildDir, { recursive: true });

type Api = { link: string };

type Schema = {
  properties?: Schema;
  type: string;
  items?: { $ref: string };
  format?: string;
  enum?: string[];
  maxLength?: number;
  minLength?: number;
  required: string[];
};

type Deteal = {
  apiPath: string;
  httpMethod: string;
  referencedJsonSchema?: { [key in string]: Schema };
  requestJsonSchema: { [key in string]: Schema } | Schema;
  responseJsonSchema: { [key in string]: Schema } | Schema;
};

type ApiListJson = {
  apis: { [key in string]: Api };
  details: { [key in string]: Deteal };
};

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

function deepDelete(obj: any, keyToDelete: string) {
  for (const key in obj) {
    if (key === keyToDelete) {
      delete obj[key];
    } else if (typeof obj[key] === "object") {
      deepDelete(obj[key], keyToDelete);
    }
  }
}

function refFormat(obj: any, pathHandler: (ref: string) => string) {
  for (const key in obj) {
    if (key === "$ref") {
      const newref = pathHandler(obj[key]);
      obj[key] = newref;
    } else if (typeof obj[key] === "object") {
      refFormat(obj[key], pathHandler);
    }
  }
}

async function main(listJson: string) {
  const list = JSON.parse(
    await fs.readFile(listJson, { encoding: "utf8" })
  ) as ApiListJson;
  deepDelete(list, "format");

  const keys = Object.keys(list.apis);

  const paths: any = {};
  for (const key of keys) {
    const detail = list.details[key];

    const path = `/k/v1/${detail.apiPath}`;
    if (!(path in paths)) {
      paths[path] = {};
    }
    if (detail.httpMethod.toLocaleLowerCase() in paths[path]) {
      throw Error(
        `duplicate method: key = ${key}, path = ${path} method: ${detail.httpMethod}`
      );
    }
    refFormat(detail.requestJsonSchema, (ref) => `${key}/${ref}.yaml`);
    refFormat(detail.responseJsonSchema, (ref) => `${key}/${ref}.yaml`);
    paths[path][detail.httpMethod.toLocaleLowerCase()] = {
      requestBody: {
        content: {
          "application/json": {
            schema: detail.requestJsonSchema,
          },
        },
      },
      responses: {
        "200": {
          content: {
            "application/json": {
              schema: detail.responseJsonSchema,
            },
          },
        },
      },
    };
    if (
      detail.referencedJsonSchema &&
      Object.keys(detail.referencedJsonSchema).length !== 0
    ) {
      const dir = `${buildDir}/${key}`;
      await fs.mkdir(dir, { recursive: true });
      for (const [name, value] of Object.entries(detail.referencedJsonSchema)) {
        refFormat(value, (ref) => `${ref}.yaml`);
        await fs.writeFile(`${dir}/${name}.yaml`, dump(value));
      }
    }
  }
  const result = {
    ...meta,
    paths,
    components: {
      securitySchemes
    }
  };
  await fs.writeFile(`${buildDir}/api.yaml`, dump(result));
}

const listJsonFile = process.argv[2]

main(listJsonFile);
