/**
 * This file was auto-generated by openapi-typescript.
 * Do not make direct changes to the file.
 */

export interface paths {
    "/k/v1/app.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** @description 1件のアプリの情報を取得する。 */
        post: operations["getApp"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/preview/app.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get?: never;
        put?: never;
        /** @description 動作テスト環境にアプリを作成する。 */
        post: operations["addApp"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/app/settings.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Get general app settings
         * @description Retrieves the general settings of an app in Kintone.
         */
        get: operations["getGeneralAppSettings"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/preview/app/deploy.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Get app deploy status
         * @description Retrieves the deployment status of an app in Kintone.
         */
        get: operations["getAppDeployStatus"];
        put?: never;
        /**
         * Deploy App Settings
         * @description Deploys the settings of an app.
         */
        post: operations["deployApp"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/apis.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** @description REST APIの一覧を取得する。 */
        get: operations["getApis"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/apis/{apiId}.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** @description REST APIの一覧を取得する。 */
        get: operations["getApi"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/app/adminNotes.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Get App Admin Notes
         * @description Gets notes for app administrators and their settings.
         */
        get: operations["getAdminNotes"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/guest/{SpaceID}/k/v1/app/adminNotes.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get: operations["getAdminNotesGuest"];
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/preview/app/adminNotes.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Get App Admin Notes
         * @description Gets notes for app administrators and their settings.
         */
        get: operations["getAdminNotesPreview"];
        /**
         * Update App Admin Notes
         * @description Update notes for app administrators and their settings.
         */
        put: operations["updateAdminNotes"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/guest/{SpaceID}/k/v1/preview/app/adminNotes.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        get: operations["getAdminNotesGuestPreview"];
        /**
         * Update App Admin Notes For Preview
         * @description Update notes for preview app administrators and their settings.
         */
        put: operations["updateAdminNotesPreview"];
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/k/v1/file.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Download a file
         * @description Downloads a file from Kintone.
         */
        get: operations["downloadFile"];
        put?: never;
        /**
         * Upload a file
         * @description Uploads a file to Kintone.
         */
        post: operations["uploadFile"];
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
    "/app/form/fields.json": {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /**
         * Get Form Fields
         * @description Retrieve the form fields of an app in Kintone
         */
        get: {
            parameters: {
                query: {
                    /** @description The App ID */
                    app: number;
                    /** @description The language setting for the response */
                    lang?: "default" | "en" | "ja" | "zh" | "user";
                };
                header?: never;
                path?: never;
                cookie?: never;
            };
            requestBody?: never;
            responses: {
                /** @description Successful response */
                200: {
                    headers: {
                        [name: string]: unknown;
                    };
                    content: {
                        "application/json": {
                            revision?: string;
                            properties?: components["schemas"]["FieldProperties"];
                        };
                    };
                };
                /** @description Bad request */
                400: {
                    headers: {
                        [name: string]: unknown;
                    };
                    content?: never;
                };
                /** @description Not found */
                404: {
                    headers: {
                        [name: string]: unknown;
                    };
                    content?: never;
                };
                /** @description Internal server error */
                500: {
                    headers: {
                        [name: string]: unknown;
                    };
                    content?: never;
                };
            };
        };
        put?: never;
        post?: never;
        delete?: never;
        options?: never;
        head?: never;
        patch?: never;
        trace?: never;
    };
}
export type webhooks = Record<string, never>;
export interface components {
    schemas: {
        /**
         * App Admin Notes
         * @description App Admin Notes
         */
        AdminNotes: {
            content?: string;
            includeInTemplateAndDuplicates?: boolean;
        };
        GetAppAdminNotesRequest: {
            /** @description The App ID. */
            app?: string;
        };
        GetAppAdminNotesResponse: components["schemas"]["AdminNotes"] & {
            revision?: string;
        };
        UpdateAppAdminNotesRequest: components["schemas"]["AdminNotes"] & {
            app?: string;
            revision?: string;
        };
        UpdateAppAdminNotesResponse: {
            revision?: string;
        };
        AddAppRequest: {
            /** @description The name of the app. */
            name: string;
            /** @description The ID of the space where the app will be created. */
            space?: number;
            /** @description The ID of the thread where the app will be created. */
            thread?: number;
        };
        AddAppResponse: {
            /** @description The ID of the created app. */
            app?: string;
            /** @description The revision number of the app. */
            revision?: string;
        };
        DeployAppSettingsRequest: {
            apps: {
                /** @description The ID of the app. */
                app?: string;
                /** @description The revision number of the app. */
                revision?: string;
            }[];
        };
        DeployAppSettingsResponse: {
            apps?: {
                /** @description The ID of the app. */
                app?: string;
                /** @description The deployment status of the app. */
                status?: string;
            }[];
        };
        GetGeneralAppSettingsResponse: {
            /** @description The name of the app. */
            name?: string;
            /** @description The description of the app. */
            description?: string;
            icon?: {
                /** @description The type of the icon. */
                type?: string;
                /** @description The key of the icon. */
                key?: string;
            };
            /** @description The theme of the app. */
            theme?: string;
            /** @description The revision number of the app. */
            revision?: string;
        };
        GetAppDeployStatusResponse: {
            apps?: {
                /** @description The ID of the app. */
                app?: string;
                /**
                 * @description The deployment status of the app.
                 * @enum {string}
                 */
                status?: "PROCESSING" | "SUCCESS" | "FAIL" | "CANCEL";
            }[];
        };
        UploadFileRequest: {
            /**
             * Format: binary
             * @description The file to upload.
             */
            file: string;
        };
        UploadFileResponse: {
            /** @description The key of the uploaded file. */
            fileKey?: string;
        };
        FieldProperties: {
            [key: string]: {
                type?: string;
                code?: string;
                label?: string;
                noLabel?: boolean;
                required?: boolean;
                unique?: boolean;
                maxValue?: string;
                minValue?: string;
                maxLength?: string;
                minLength?: string;
                defaultValue?: string;
                defaultNowValue?: boolean;
                align?: string;
                expression?: string;
                hideExpression?: boolean;
                digit?: boolean;
                thumbnailSize?: string;
                protocol?: string;
                format?: string;
                displayScale?: string;
                unit?: string;
                unitPosition?: string;
                entities?: {
                    code?: string;
                    type?: string;
                }[];
                referenceTSable?: {
                    relatedApp?: {
                        app?: string;
                        code?: string;
                    };
                    condition?: {
                        field?: string;
                        relatedField?: string;
                    };
                    filterCond?: string;
                    displayFields?: unknown[];
                    sort?: string;
                    size?: string;
                };
                lookup?: {
                    relatedApp?: {
                        app?: string;
                        code?: string;
                    };
                    relatedKeyField?: string;
                    fieldMappings?: {
                        field?: string;
                        relatedField?: string;
                    }[];
                    lookupPickerFields?: unknown[];
                    filterCond?: string;
                    sort?: string;
                };
                openGroup?: boolean;
                fields?: components["schemas"]["FieldProperties"];
                enabled?: boolean;
                options?: {
                    [key: string]: {
                        label?: string;
                        index?: number;
                    };
                };
            };
        };
        KintoeRestApiError: {
            /**
             * @description The ID of the error.
             * @example 123
             */
            id?: string;
            /**
             * @description The code of the error, to specify the type of error it is.
             * @example GA01
             */
            code?: string;
            /**
             * @description The HTTP status of the response.
             * @example 400
             */
            status?: number;
            /** @description The HTTP headers of the response. */
            headers?: Record<string, never>;
            /**
             * @description The error message.
             * @example The error message.
             */
            message?: string;
            /** @description The index of the failed request when executing bulkRequest and one of the requests fails. This value is undefined otherwise. */
            bulkRequestIndex?: number | Record<string, never>;
        };
    };
    responses: never;
    parameters: {
        /** @description The Guest Space ID. */
        SpaceID: number;
    };
    requestBodies: never;
    headers: never;
    pathItems: never;
}
export type $defs = Record<string, never>;
export interface operations {
    getApp: {
        parameters: {
            query?: never;
            header?: {
                /** @description メソッドをGETにする */
                "X-HTTP-Method-Override"?: "GET";
            };
            path?: never;
            cookie?: never;
        };
        requestBody?: {
            content: {
                /** @example {
                 *       "id": "123"
                 *     } */
                "application/json": {
                    id: string;
                };
            };
        };
        responses: {
            /** @description Success */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        appId?: string;
                        code?: string;
                        name?: string;
                        description?: string;
                        spaceId?: string;
                        threadId?: string;
                        createdAt?: string;
                        creator?: {
                            code?: string;
                            name?: string;
                        };
                        modifiedAt?: string;
                        modifier?: {
                            code?: string;
                            name?: string;
                        };
                    };
                };
            };
            /** @description Bad Request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["KintoeRestApiError"];
                };
            };
            /** @description Internal Server Error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["KintoeRestApiError"];
                };
            };
        };
    };
    addApp: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** @description response body */
        requestBody: {
            content: {
                "application/json": components["schemas"]["AddAppRequest"];
            };
        };
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["AddAppResponse"];
                };
            };
            /** @description Bad Request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Internal Server Error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    getGeneralAppSettings: {
        parameters: {
            query: {
                /** @description The ID of the app. */
                app: string;
                /** @description The language of the response. */
                lang?: "en" | "ja" | "zh" | "user" | "default";
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Successful response */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GetGeneralAppSettingsResponse"];
                };
            };
            /** @description Bad request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Unauthorized */
            401: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Internal server error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    getAppDeployStatus: {
        parameters: {
            query: {
                /** @description The IDs of the apps. */
                apps: string[];
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Successful response */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GetAppDeployStatusResponse"];
                };
            };
            /** @description Bad request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Unauthorized */
            401: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Internal server error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    deployApp: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "application/json": {
                    apps?: {
                        app?: string;
                        revision?: string;
                    }[];
                };
            };
        };
        responses: {
            /** @description Successful response */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        apps?: {
                            app?: string;
                            revision?: string;
                        }[];
                    };
                };
            };
            /** @description Bad request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        message?: string;
                    };
                };
            };
            /** @description Unauthorized */
            401: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        message?: string;
                    };
                };
            };
            /** @description Internal server error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        message?: string;
                    };
                };
            };
        };
    };
    getApis: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Success */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        baseUrl?: string;
                        apis?: {
                            [key: string]: {
                                link?: string;
                            };
                        };
                    };
                };
            };
        };
    };
    getApi: {
        parameters: {
            query?: never;
            header?: never;
            path: {
                apiId: string;
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Success */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": {
                        id?: string;
                        baseUrl?: string;
                        path?: string;
                        httpMethod?: string;
                        request?: {
                            [key: string]: unknown;
                        };
                        response?: {
                            [key: string]: unknown;
                        };
                        schemas?: {
                            [key: string]: unknown;
                        };
                    };
                };
            };
        };
    };
    getAdminNotes: {
        parameters: {
            query?: {
                query?: components["schemas"]["GetAppAdminNotesRequest"];
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GetAppAdminNotesResponse"];
                };
            };
        };
    };
    getAdminNotesGuest: {
        parameters: {
            query?: {
                query?: components["schemas"]["GetAppAdminNotesRequest"];
            };
            header?: never;
            path: {
                /** @description The Guest Space ID. */
                SpaceID: components["parameters"]["SpaceID"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GetAppAdminNotesResponse"];
                };
            };
        };
    };
    getAdminNotesPreview: {
        parameters: {
            query?: {
                query?: components["schemas"]["GetAppAdminNotesRequest"];
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GetAppAdminNotesResponse"];
                };
            };
        };
    };
    updateAdminNotes: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** @description response body */
        requestBody: {
            content: {
                "application/json": components["schemas"]["UpdateAppAdminNotesRequest"];
            };
        };
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["UpdateAppAdminNotesResponse"];
                };
            };
            /** @description Bad Request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["KintoeRestApiError"];
                };
            };
            /** @description Bad Request */
            405: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["KintoeRestApiError"];
                };
            };
        };
    };
    getAdminNotesGuestPreview: {
        parameters: {
            query?: {
                query?: components["schemas"]["GetAppAdminNotesRequest"];
            };
            header?: never;
            path: {
                /** @description The Guest Space ID. */
                SpaceID: components["parameters"]["SpaceID"];
            };
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["GetAppAdminNotesResponse"];
                };
            };
        };
    };
    updateAdminNotesPreview: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        /** @description response body */
        requestBody: {
            content: {
                "application/json": components["schemas"]["UpdateAppAdminNotesRequest"];
            };
        };
        responses: {
            /** @description successful operation */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["UpdateAppAdminNotesResponse"];
                };
            };
        };
    };
    downloadFile: {
        parameters: {
            query: {
                /** @description The key of the file to download. */
                fileKey: string;
            };
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody?: never;
        responses: {
            /** @description Successful response */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/octet-stream": string;
                };
            };
            /** @description Bad request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Unauthorized */
            401: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description File not found */
            404: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Internal server error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
    uploadFile: {
        parameters: {
            query?: never;
            header?: never;
            path?: never;
            cookie?: never;
        };
        requestBody: {
            content: {
                "multipart/form-data": components["schemas"]["UploadFileRequest"];
            };
        };
        responses: {
            /** @description Successful response */
            200: {
                headers: {
                    [name: string]: unknown;
                };
                content: {
                    "application/json": components["schemas"]["UploadFileResponse"];
                };
            };
            /** @description Bad request */
            400: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Unauthorized */
            401: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
            /** @description Internal server error */
            500: {
                headers: {
                    [name: string]: unknown;
                };
                content?: never;
            };
        };
    };
}
