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
    // const resp = await client.GET("/k/v1/record.json", {params: {query: {app: 2, id: "2"}}});
    //
    // console.log(resp.data!.record!.Updated_by.type);
    // console.log(resp.data!.record!.Updated_by.value);
    //
    // // records.json
    // const resp2 = await client.GET("/k/v1/records.json", {
    //     params: {
    //         query: {
    //             app: 2,
    //             // fields: ["文字列__1行_"],
    //             // query: '文字列__1行_ = "あああ"',
    //             totalCount: true,
    //         }
    //     }
    // });
    //
    // console.log(resp2.data!.records![0]["文字列__1行_"].type);
    // console.log(resp2.data!.records![0]["文字列__1行_"].value);
    //
    // const resp3 = await client.POST("/k/v1/record.json", {
    //     'body': {
    //         'app': 2,
    //         'record':  {
    //             "文字列__1行_": {
    //                 value: "123"
    //             }
    //         }
    //     }
    // });
    // console.log(resp3.data);
    //
    // const resp4 = await client.PUT("/k/v1/record.json", {
    //     'body': {
    //         'app': 2,
    //         'updateKey': {
    //             field: "文字列__1行_",
    //             value: "1234"
    //         },
    //         'record':  {
    //             "文字列__1行_": {
    //                 value: "111"
    //             }
    //         }
    //     }
    // });
    // console.log(resp4.data);
    //
    // const resp5 = await client.POST("/k/v1/records.json", {
    //     body: {
    //         app: 2,
    //         records: [
    //             {
    //                 "文字列__1行_": {
    //                     value: "a1233"
    //                 }
    //             },
    //             {
    //                 "文字列__1行_": {
    //                     value: "a4563"
    //                 }
    //             }
    //         ]
    //     }
    // });
    // console.log(resp5.data)
    //
    // const resp6 = await client.PUT("/k/v1/records.json", {
    //     body: {
    //         app: 2,
    //         records: [
    //             {
    //                 "id": 1,
    //                 record: {
    //                     "文字列__1行_": {
    //                         value: "abc"
    //                     },
    //                     "文字列__1行__0": {
    //                         value: "あああ"
    //                     }
    //                 }
    //             },
    //             {
    //                 "id": 2,
    //                 record: {
    //                     "文字列__1行_": {
    //                         value: "efg"
    //                     },
    //                     "文字列__1行__0": {
    //                         value: "いいい"
    //                     }
    //                 }
    //             },
    //
    //         ]
    //     }
    // });
    // console.log(resp6.data!.records![0].revision)
    //
    // const resp7 = await client.DELETE("/k/v1/records.json", {
    //     body: {
    //         app: 2,
    //         ids: [1, 2]
    //     }
    // });
    //
    // console.log(resp7.data)

    // const { data, error } = await client.POST("/k/v1/records/cursor.json", {
    //     body: {
    //         app: 2,
    //     }
    // });
    //
    // console.log(data!.id);
    // console.log(error);

    // const { data, error } = await client.GET("/k/v1/records/cursor.json", {
    //     params: {
    //         query: {
    //             id: "600e2669-601e-443b-9cc0-152faee1e1ec",
    //         }
    //     }
    // });
    //
    // console.log(data);
    // console.log(error);

    // const { data, error } = await client.DELETE("/k/v1/records/cursor.json", {
    //     params: {
    //         query: {
    //             id: "1ccb4f8b-aff4-49e0-aa27-c7aa59c7d0e4",
    //         }
    //     }
    // });

    // const { data, error } = await client.GET("/k/v1/record/comments.json", {
    //     params: {
    //         query: {
    //             app: 2,
    //             record: 8
    //         }
    //     }
    // });

    // const { data, error } = await client.POST("/k/v1/record/comment.json", {
    //     body: {
    //         app: 2,
    //         record: 8,
    //         comment: {
    //             text: "test"
    //         }
    //     }
    // });

    // const { data, error } = await client.DELETE("/k/v1/record/comment.json", {
    //     params: {
    //         query: {
    //             app: 2,
    //             record: 8,
    //             comment: 3
    //         }
    //     }
    // });

    // const { data, error } = await client.PUT("/k/v1/record/assignees.json", {
    //     body: {
    //         app: 2,
    //         id: 8,
    //         assignees: ['Administrator']
    //     }
    // });

    // const { data, error } = await client.PUT("/k/v1/record/status.json", {
    //     body: {
    //         app: 2,
    //         id: 8,
    //         action: "処理開始",
    //         assignees: ['Administrator']
    //     }
    // });

    // const { data, error } = await client.PUT("/k/v1/records/status.json", {
    //     body: {
    //         app: 2,
    //         records: [{
    //             id: 6,
    //             action: "処理開始",
    //             assignees: ['Administrator']
    //         }, {
    //             id: 7,
    //             action: "処理開始",
    //             assignees: ['Administrator']
    //
    //         }]
    //     }
    // });
    // const { data, error } = await client.GET("/k/v1/records/acl/evaluate.json", {
    //     params: {
    //         query: {
    //             app: 2,
    //             ids: [7, 8],
    //         }
    //     }
    // });

    const { data, error } = await client.POST("/k/v1/bulkRequest.json", {
        body: {
            requests: [
                {
                    method: "POST",
                    api: "/k/v1/record.json",
                    payload: {
                        app: 2,
                        record: {
                            "文字列__1行_": {
                                value: "f1233"
                            }
                        }
                    }
                },
                {
                    method: "POST",
                    api: "/k/v1/record.json",
                    payload: {
                        app: 2,
                        record: {
                            "文字列__1行_": {
                                value: "c4563"
                            }
                        }
                    }
                }
            ]
        }
    });

    console.log(data);
    console.log(error);
}

main();
