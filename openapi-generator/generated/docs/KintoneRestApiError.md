

# KintoneRestApiError

The error response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the error. |  [optional] |
|**code** | **String** | The code of the error, to specify the type of error it is. |  [optional] |
|**status** | **BigDecimal** | The HTTP status of the response. |  [optional] |
|**headers** | **Object** | The HTTP headers of the response. |  [optional] |
|**message** | **String** | The error message. |  [optional] |
|**bulkRequestIndex** | **BigDecimal** | The index of the failed request when executing bulkRequest and one of the requests fails. This value is undefined otherwise. |  [optional] |



