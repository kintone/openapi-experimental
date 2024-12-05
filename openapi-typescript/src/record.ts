import createClient from "openapi-fetch";
import type {paths} from "./generated/schema";

const main = async () => {
    const client = createClient<paths>({
        baseUrl: "http://localhost",
        headers: {
            "X-Cybozu-Authorization": "QWRtaW5pc3RyYXRvcjpjeWJvenU="
        },
    });
    //
    const resp = await client.GET("/k/v1/record.json", {params: {query: {app: 2, id: "2"}}});
    console.log(resp.data)
}

main();
