# ApisApi

All URIs are relative to *https://sample.cybozu.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApi**](ApisApi.md#getApi) | **GET** /k/v1/apis/{apiId}.json |  |
| [**getApis**](ApisApi.md#getApis) | **GET** /k/v1/apis.json |  |


<a id="getApi"></a>
# **getApi**
> GetApi200Response getApi(apiId)



REST APIの一覧を取得する。

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.ApisApi;

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

    ApisApi apiInstance = new ApisApi(defaultClient);
    String apiId = "apiId_example"; // String | 
    try {
      GetApi200Response result = apiInstance.getApi(apiId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApisApi#getApi");
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
| **apiId** | **String**|  | |

### Return type

[**GetApi200Response**](GetApi200Response.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getApis"></a>
# **getApis**
> GetApis200Response getApis()



REST APIの一覧を取得する。

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.ApisApi;

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

    ApisApi apiInstance = new ApisApi(defaultClient);
    try {
      GetApis200Response result = apiInstance.getApis();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApisApi#getApis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetApis200Response**](GetApis200Response.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

