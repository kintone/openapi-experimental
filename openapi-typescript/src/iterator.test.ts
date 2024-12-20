import createClient from "openapi-fetch";
import type { paths } from "./generated/schema"; // generated by openapi-typescript
import { iterator } from "./iterator";

const main = async () => {
  const client = createClient<paths>({
    baseUrl: "http://localhost",
    headers: {
      "X-Cybozu-Authorization": "QWRtaW5pc3RyYXRvcjpjeWJvenU=",
    },
  });

  // アプリ作成
  const apps: { app: string }[] = [];
  for (let i = 0; i < 10; i++) {
    const addAppResp = await client.POST("/k/v1/preview/app.json", {
      body: { name: `my app ${i}` },
    });
    apps.push({ app: addAppResp.data!.app! });
  }
  // デプロイ
  const deployAppResp = await client.POST("/k/v1/preview/app/deploy.json", {
    body: { apps: apps },
  });

  const appIdList = apps.map((a) => a.app);

  // デプロイ確認
  const deployCheckIterator = iterator(client).GET(
    "/k/v1/preview/app/deploy.json",
    (init) => init,
    (_init, resp) => {
      if (!resp) return true;
      for (const status of resp?.data!.apps!) {
        if (
          apps.some((a) => a.app === status.app) &&
          status.status === "PROCESSING"
        ) {
          return true;
        }
      }
      return false;
    },
    {
      params: {
        query: { apps: appIdList },
      },
    }
  );
  deploy_check: while (true) {
    const result = await deployCheckIterator.next();
    if (result.done) break deploy_check;
    console.log("deploying...");
    await new Promise((resolve) => setTimeout(resolve, 500));
  }

  // アプリ一覧取得
  const getAppsIterator = iterator(client).GET(
    "/k/v1/apps.json",
    (previousInit, previousresp) => {
      if (!previousresp) return previousInit;
      const prevOffset = previousInit.params.query.offset;
      const limit = previousInit.params.query.limit;
      return {
        ...previousInit,
        params: {
          ...previousInit?.params,
          query: {
            ...previousInit?.params?.query,
            offset: prevOffset + limit,
          },
        },
      };
    },
    (init, resp) => {
      if (!resp) return true;
      return resp.data!.apps!.length >= init.params.query.limit;
    },
    {
      params: {
        query: {
          ids: appIdList,
          offset: 0,
          limit: 3,
        },
      },
    }
  );
  const allResp = [];
  for await (const resp of getAppsIterator) {
    console.log(resp.data);
    allResp.push(...resp.data!.apps!);
  }
  console.log(allResp.length);
};

main();
