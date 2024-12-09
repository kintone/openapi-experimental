import createClient from "openapi-fetch";
import type {paths} from "./generated/schema";

const main = async () => {
    const client = createClient<paths>({
        baseUrl: "http://localhost",
        headers: {
            "X-Cybozu-Authorization": "QWRtaW5pc3RyYXRvcjpjeWJvenU="
        },
    });
    // record.json
    const resp = await client.GET("/k/v1/record.json", {params: {query: {app: 2, id: "2"}}});

    console.log(resp.data!.record!.Updated_by.type);
    console.log(resp.data!.record!.Updated_by.value);

    // records.json
    const resp2 = await client.GET("/k/v1/records.json", {
        params: {
            query: {
                app: 2,
                // fields: ["文字列__1行_"],
                // query: '文字列__1行_ = "あああ"',
                totalCount: true,
            }
        }
    });

    console.log(resp2.data!.records![0]["文字列__1行_"].type);
    console.log(resp2.data!.records![0]["文字列__1行_"].value);

    const resp3 = await client.POST("/k/v1/record.json", {
        'body': {
            'app': 2,
            'record':  {
                "文字列__1行_": {
                    value: "123"
                }
            }
        }
    });
    console.log(resp3.data);

    const resp4 = await client.PUT("/k/v1/record.json", {
        'body': {
            'app': 2,
            'updateKey': {
                field: "文字列__1行_",
                value: "1234"
            },
            'record':  {
                "文字列__1行_": {
                    value: "111"
                }
            }
        }
    });
    console.log(resp4.data);

    const resp5 = await client.POST("/k/v1/records.json", {
        body: {
            app: 2,
            records: [
                {
                    "文字列__1行_": {
                        value: "a1233"
                    }
                },
                {
                    "文字列__1行_": {
                        value: "a4563"
                    }
                }
            ]
        }
    });
    console.log(resp5.data)

    const resp6 = await client.PUT("/k/v1/records.json", {
        body: {
            app: 2,
            records: [
                {
                    "id": 1,
                    record: {
                        "文字列__1行_": {
                            value: "abc"
                        },
                        "文字列__1行__0": {
                            value: "あああ"
                        }
                    }
                },
                {
                    "id": 2,
                    record: {
                        "文字列__1行_": {
                            value: "efg"
                        },
                        "文字列__1行__0": {
                            value: "いいい"
                        }
                    }
                },

            ]
        }
    });
    console.log(resp6.data!.records![0].revision)
}

main();
