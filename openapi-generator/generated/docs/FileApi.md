# FileApi

All URIs are relative to *https://sample.cybozu.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadFile**](FileApi.md#downloadFile) | **GET** /k/v1/file.json | Download a file |
| [**uploadFile**](FileApi.md#uploadFile) | **POST** /k/v1/file.json | Upload a file |


<a id="downloadFile"></a>
# **downloadFile**
> File downloadFile(fileKey)

Download a file

Downloads a file from Kintone.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.FileApi;

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

    FileApi apiInstance = new FileApi(defaultClient);
    String fileKey = "fileKey_example"; // String | The key of the file to download.
    try {
      File result = apiInstance.downloadFile(fileKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#downloadFile");
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
| **fileKey** | **String**| The key of the file to download. | |

### Return type

[**File**](File.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | File not found |  -  |
| **500** | Internal server error |  -  |

<a id="uploadFile"></a>
# **uploadFile**
> UploadFileResponse uploadFile(_file)

Upload a file

Uploads a file to Kintone.

### Example
```java
// Import classes:
import com.openapi_generator.generated.ApiClient;
import com.openapi_generator.generated.ApiException;
import com.openapi_generator.generated.Configuration;
import com.openapi_generator.generated.auth.*;
import com.openapi_generator.generated.models.*;
import com.openapi_generator.generated.api.FileApi;

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

    FileApi apiInstance = new FileApi(defaultClient);
    File _file = new File("/path/to/file"); // File | The file to upload.
    try {
      UploadFileResponse result = apiInstance.uploadFile(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#uploadFile");
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
| **_file** | **File**| The file to upload. | |

### Return type

[**UploadFileResponse**](UploadFileResponse.md)

### Authorization

[SessionAuth](../README.md#SessionAuth), [ApiTokenAuth](../README.md#ApiTokenAuth), [PasswordAuth](../README.md#PasswordAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal server error |  -  |

