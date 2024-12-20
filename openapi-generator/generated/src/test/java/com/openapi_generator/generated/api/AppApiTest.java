/*
 * Kintone REST API
 * This is an experimental
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openapi_generator.generated.api;

import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.model.AddAppRequest;
import com.openapi_generator.generated.model.AddAppResponse;
import com.openapi_generator.generated.model.DeployApp400Response;
import com.openapi_generator.generated.model.DeployAppRequest;
import com.openapi_generator.generated.model.GetAdminNotesQueryParameter;
import com.openapi_generator.generated.model.GetAppAdminNotesResponse;
import com.openapi_generator.generated.model.GetAppDeployStatusResponse;
import com.openapi_generator.generated.model.GetAppRequest;
import com.openapi_generator.generated.model.GetAppResponss;
import com.openapi_generator.generated.model.GetGeneralAppSettingsResponse;
import com.openapi_generator.generated.model.KV1PreviewAppFormFieldsJsonGet200Response;
import com.openapi_generator.generated.model.KintoneRestApiError;
import com.openapi_generator.generated.model.UpdateAppAdminNotesRequest;
import com.openapi_generator.generated.model.UpdateAppAdminNotesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppApi
 */
@Disabled
public class AppApiTest {

    private final AppApi api = new AppApi();

    /**
     * 動作テスト環境にアプリを作成する。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAppTest() throws ApiException {
        AddAppRequest addAppRequest = null;
        AddAppResponse response = api.addApp(addAppRequest);
        // TODO: test validations
    }

    /**
     * Deploy App Settings
     *
     * Deploys the settings of an app.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deployAppTest() throws ApiException {
        DeployAppRequest deployAppRequest = null;
        DeployAppRequest response = api.deployApp(deployAppRequest);
        // TODO: test validations
    }

    /**
     * Get App Admin Notes
     *
     * Gets notes for app administrators and their settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdminNotesTest() throws ApiException {
        GetAdminNotesQueryParameter query = null;
        GetAppAdminNotesResponse response = api.getAdminNotes(query);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdminNotesGuestTest() throws ApiException {
        Integer spaceID = null;
        GetAdminNotesQueryParameter query = null;
        GetAppAdminNotesResponse response = api.getAdminNotesGuest(spaceID, query);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdminNotesGuestPreviewTest() throws ApiException {
        Integer spaceID = null;
        GetAdminNotesQueryParameter query = null;
        GetAppAdminNotesResponse response = api.getAdminNotesGuestPreview(spaceID, query);
        // TODO: test validations
    }

    /**
     * Get App Admin Notes
     *
     * Gets notes for app administrators and their settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdminNotesPreviewTest() throws ApiException {
        GetAdminNotesQueryParameter query = null;
        GetAppAdminNotesResponse response = api.getAdminNotesPreview(query);
        // TODO: test validations
    }

    /**
     * 1件のアプリの情報を取得する。
     *
     * 1件のアプリの情報を取得する。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppTest() throws ApiException {
        String xHTTPMethodOverride = null;
        GetAppRequest getAppRequest = null;
        GetAppResponss response = api.getApp(xHTTPMethodOverride, getAppRequest);
        // TODO: test validations
    }

    /**
     * Get app deploy status
     *
     * Retrieves the deployment status of an app in Kintone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppDeployStatusTest() throws ApiException {
        List<String> apps = null;
        GetAppDeployStatusResponse response = api.getAppDeployStatus(apps);
        // TODO: test validations
    }

    /**
     * Get general app settings
     *
     * Retrieves the general settings of an app in Kintone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeneralAppSettingsTest() throws ApiException {
        String app = null;
        String lang = null;
        GetGeneralAppSettingsResponse response = api.getGeneralAppSettings(app, lang);
        // TODO: test validations
    }

    /**
     * Get Form Fields
     *
     * Retrieve the form fields of an app in Kintone
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kV1PreviewAppFormFieldsJsonGetTest() throws ApiException {
        Integer app = null;
        String lang = null;
        KV1PreviewAppFormFieldsJsonGet200Response response = api.kV1PreviewAppFormFieldsJsonGet(app, lang);
        // TODO: test validations
    }

    /**
     * Update App Admin Notes
     *
     * Update notes for app administrators and their settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAdminNotesTest() throws ApiException {
        UpdateAppAdminNotesRequest updateAppAdminNotesRequest = null;
        UpdateAppAdminNotesResponse response = api.updateAdminNotes(updateAppAdminNotesRequest);
        // TODO: test validations
    }

    /**
     * Update App Admin Notes For Preview
     *
     * Update notes for preview app administrators and their settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAdminNotesPreviewTest() throws ApiException {
        Integer spaceID = null;
        UpdateAppAdminNotesRequest updateAppAdminNotesRequest = null;
        UpdateAppAdminNotesResponse response = api.updateAdminNotesPreview(spaceID, updateAppAdminNotesRequest);
        // TODO: test validations
    }

}
