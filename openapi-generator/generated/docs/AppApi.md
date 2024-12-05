# AppApi

All URIs are relative to *https://sample.cybozu.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addApp**](AppApi.md#addApp) | **POST** /k/v1/preview/app.json |  |
| [**deployApp**](AppApi.md#deployApp) | **POST** /k/v1/preview/app/deploy.json | Deploy App Settings |
| [**getAdminNotes**](AppApi.md#getAdminNotes) | **GET** /k/v1/app/adminNotes.json | Get App Admin Notes |
| [**getAdminNotesGuest**](AppApi.md#getAdminNotesGuest) | **GET** /guest/{SpaceID}/k/v1/app/adminNotes.json |  |
| [**getAdminNotesGuestPreview**](AppApi.md#getAdminNotesGuestPreview) | **GET** /guest/{SpaceID}/k/v1/preview/app/adminNotes.json |  |
| [**getAdminNotesPreview**](AppApi.md#getAdminNotesPreview) | **GET** /k/v1/preview/app/adminNotes.json | Get App Admin Notes |
| [**getApp**](AppApi.md#getApp) | **POST** /k/v1/app.json | 1件のアプリの情報を取得する。 |
| [**getAppDeployStatus**](AppApi.md#getAppDeployStatus) | **GET** /k/v1/preview/app/deploy.json | Get app deploy status |
| [**getGeneralAppSettings**](AppApi.md#getGeneralAppSettings) | **GET** /k/v1/app/settings.json | Get general app settings |
| [**kV1PreviewAppFormFieldsJsonGet**](AppApi.md#kV1PreviewAppFormFieldsJsonGet) | **GET** /k/v1/preview/app/form/fields.json | Get Form Fields |
| [**updateAdminNotes**](AppApi.md#updateAdminNotes) | **PUT** /k/v1/preview/app/adminNotes.json | Update App Admin Notes |
| [**updateAdminNotesPreview**](AppApi.md#updateAdminNotesPreview) | **PUT** /guest/{SpaceID}/k/v1/preview/app/adminNotes.json | Update App Admin Notes For Preview |


<a id="addApp"></a>
# **addApp**
> AddAppResponse addApp(addAppRequest)



動作テスト環境にアプリを作成する。

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    AddAppRequest addAppRequest = new AddAppRequest(); // AddAppRequest | response body
    try {
      AddAppResponse result = apiInstance.addApp(addAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#addApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addAppRequest** | [**AddAppRequest**](AddAppRequest.md)| response body | |

### Return type

[**AddAppResponse**](AddAppResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="deployApp"></a>
# **deployApp**
> DeployAppRequest deployApp(deployAppRequest)

Deploy App Settings

Deploys the settings of an app.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    DeployAppRequest deployAppRequest = new DeployAppRequest(); // DeployAppRequest | 
    try {
      DeployAppRequest result = apiInstance.deployApp(deployAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#deployApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deployAppRequest** | [**DeployAppRequest**](DeployAppRequest.md)|  | |

### Return type

[**DeployAppRequest**](DeployAppRequest.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a id="getAdminNotes"></a>
# **getAdminNotes**
> GetAppAdminNotesResponse getAdminNotes(query)

Get App Admin Notes

Gets notes for app administrators and their settings.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    GetAdminNotesQueryParameter query = new GetAdminNotesQueryParameter(); // GetAdminNotesQueryParameter | Get App Admin Notes Request
    try {
      GetAppAdminNotesResponse result = apiInstance.getAdminNotes(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAdminNotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | [**GetAdminNotesQueryParameter**](.md)| Get App Admin Notes Request | [optional] |

### Return type

[**GetAppAdminNotesResponse**](GetAppAdminNotesResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a id="getAdminNotesGuest"></a>
# **getAdminNotesGuest**
> GetAppAdminNotesResponse getAdminNotesGuest(spaceID, query)



### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    Integer spaceID = 56; // Integer | The Guest Space ID.
    GetAdminNotesQueryParameter query = new GetAdminNotesQueryParameter(); // GetAdminNotesQueryParameter | Get App Admin Notes Request
    try {
      GetAppAdminNotesResponse result = apiInstance.getAdminNotesGuest(spaceID, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAdminNotesGuest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **spaceID** | **Integer**| The Guest Space ID. | |
| **query** | [**GetAdminNotesQueryParameter**](.md)| Get App Admin Notes Request | [optional] |

### Return type

[**GetAppAdminNotesResponse**](GetAppAdminNotesResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a id="getAdminNotesGuestPreview"></a>
# **getAdminNotesGuestPreview**
> GetAppAdminNotesResponse getAdminNotesGuestPreview(spaceID, query)



### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    Integer spaceID = 56; // Integer | The Guest Space ID.
    GetAdminNotesQueryParameter query = new GetAdminNotesQueryParameter(); // GetAdminNotesQueryParameter | Get App Admin Notes Request
    try {
      GetAppAdminNotesResponse result = apiInstance.getAdminNotesGuestPreview(spaceID, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAdminNotesGuestPreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **spaceID** | **Integer**| The Guest Space ID. | |
| **query** | [**GetAdminNotesQueryParameter**](.md)| Get App Admin Notes Request | [optional] |

### Return type

[**GetAppAdminNotesResponse**](GetAppAdminNotesResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a id="getAdminNotesPreview"></a>
# **getAdminNotesPreview**
> GetAppAdminNotesResponse getAdminNotesPreview(query)

Get App Admin Notes

Gets notes for app administrators and their settings.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    GetAdminNotesQueryParameter query = new GetAdminNotesQueryParameter(); // GetAdminNotesQueryParameter | Get App Admin Notes Request
    try {
      GetAppAdminNotesResponse result = apiInstance.getAdminNotesPreview(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAdminNotesPreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | [**GetAdminNotesQueryParameter**](.md)| Get App Admin Notes Request | [optional] |

### Return type

[**GetAppAdminNotesResponse**](GetAppAdminNotesResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a id="getApp"></a>
# **getApp**
> GetAppResponss getApp(xHTTPMethodOverride, getAppRequest)

1件のアプリの情報を取得する。

1件のアプリの情報を取得する。

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    String xHTTPMethodOverride = "GET"; // String | メソッドをGETにする
    GetAppRequest getAppRequest = new GetAppRequest(); // GetAppRequest | GetApp Request Body
    try {
      GetAppResponss result = apiInstance.getApp(xHTTPMethodOverride, getAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xHTTPMethodOverride** | **String**| メソッドをGETにする | [optional] [default to GET] [enum: GET] |
| **getAppRequest** | [**GetAppRequest**](GetAppRequest.md)| GetApp Request Body | [optional] |

### Return type

[**GetAppResponss**](GetAppResponss.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAppDeployStatus"></a>
# **getAppDeployStatus**
> GetAppDeployStatusResponse getAppDeployStatus(apps)

Get app deploy status

Retrieves the deployment status of an app in Kintone.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    List<String> apps = Arrays.asList(); // List<String> | The IDs of the apps.
    try {
      GetAppDeployStatusResponse result = apiInstance.getAppDeployStatus(apps);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAppDeployStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apps** | [**List&lt;String&gt;**](String.md)| The IDs of the apps. | |

### Return type

[**GetAppDeployStatusResponse**](GetAppDeployStatusResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a id="getGeneralAppSettings"></a>
# **getGeneralAppSettings**
> GetGeneralAppSettingsResponse getGeneralAppSettings(app, lang)

Get general app settings

Retrieves the general settings of an app in Kintone.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    String app = "app_example"; // String | The ID of the app.
    String lang = "en"; // String | The language of the response.
    try {
      GetGeneralAppSettingsResponse result = apiInstance.getGeneralAppSettings(app, lang);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getGeneralAppSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **app** | **String**| The ID of the app. | |
| **lang** | **String**| The language of the response. | [optional] [enum: en, ja, zh, user, default] |

### Return type

[**GetGeneralAppSettingsResponse**](GetGeneralAppSettingsResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

<a id="kV1PreviewAppFormFieldsJsonGet"></a>
# **kV1PreviewAppFormFieldsJsonGet**
> KV1PreviewAppFormFieldsJsonGet200Response kV1PreviewAppFormFieldsJsonGet(app, lang)

Get Form Fields

Retrieve the form fields of an app in Kintone

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    Integer app = 56; // Integer | The App ID
    String lang = "default"; // String | The language setting for the response
    try {
      KV1PreviewAppFormFieldsJsonGet200Response result = apiInstance.kV1PreviewAppFormFieldsJsonGet(app, lang);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#kV1PreviewAppFormFieldsJsonGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **app** | **Integer**| The App ID | |
| **lang** | **String**| The language setting for the response | [optional] [enum: default, en, ja, zh, user] |

### Return type

[**KV1PreviewAppFormFieldsJsonGet200Response**](KV1PreviewAppFormFieldsJsonGet200Response.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

<a id="updateAdminNotes"></a>
# **updateAdminNotes**
> UpdateAppAdminNotesResponse updateAdminNotes(updateAppAdminNotesRequest)

Update App Admin Notes

Update notes for app administrators and their settings.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    UpdateAppAdminNotesRequest updateAppAdminNotesRequest = new UpdateAppAdminNotesRequest(); // UpdateAppAdminNotesRequest | response body
    try {
      UpdateAppAdminNotesResponse result = apiInstance.updateAdminNotes(updateAppAdminNotesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#updateAdminNotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateAppAdminNotesRequest** | [**UpdateAppAdminNotesRequest**](UpdateAppAdminNotesRequest.md)| response body | |

### Return type

[**UpdateAppAdminNotesResponse**](UpdateAppAdminNotesResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad Request |  -  |
| **405** | Bad Request |  -  |

<a id="updateAdminNotesPreview"></a>
# **updateAdminNotesPreview**
> UpdateAppAdminNotesResponse updateAdminNotesPreview(spaceID, updateAppAdminNotesRequest)

Update App Admin Notes For Preview

Update notes for preview app administrators and their settings.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sample.cybozu.com");
    
    // Configure API key authorization: SessionAuth
    ApiKeyAuth SessionAuth = (ApiKeyAuth) defaultClient.getAuthentication("SessionAuth");
    SessionAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SessionAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: ApiTokenAuth
    ApiKeyAuth ApiTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiTokenAuth");
    ApiTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiTokenAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: PasswordAuth
    ApiKeyAuth PasswordAuth = (ApiKeyAuth) defaultClient.getAuthentication("PasswordAuth");
    PasswordAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PasswordAuth.setApiKeyPrefix("Token");

    AppApi apiInstance = new AppApi(defaultClient);
    Integer spaceID = 56; // Integer | The Guest Space ID.
    UpdateAppAdminNotesRequest updateAppAdminNotesRequest = new UpdateAppAdminNotesRequest(); // UpdateAppAdminNotesRequest | response body
    try {
      UpdateAppAdminNotesResponse result = apiInstance.updateAdminNotesPreview(spaceID, updateAppAdminNotesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#updateAdminNotesPreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **spaceID** | **Integer**| The Guest Space ID. | |
| **updateAppAdminNotesRequest** | [**UpdateAppAdminNotesRequest**](UpdateAppAdminNotesRequest.md)| response body | |

### Return type

[**UpdateAppAdminNotesResponse**](UpdateAppAdminNotesResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

