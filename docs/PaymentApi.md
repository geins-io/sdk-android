# PaymentApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryPaymentOptions**](PaymentApi.md#queryPaymentOptions) | **POST** /API/Payment/Query | Query payment options



## queryPaymentOptions

> List&lt;PaymentModelsPaymentOption&gt; queryPaymentOptions(query)

Query payment options

### Example

```java
// Import classes:
//import org.openapitools.client.api.PaymentApi;

PaymentApi apiInstance = new PaymentApi();
PaymentModelsPaymentOptionQuery query = new PaymentModelsPaymentOptionQuery(); // PaymentModelsPaymentOptionQuery | The payment query
try {
    List<PaymentModelsPaymentOption> result = apiInstance.queryPaymentOptions(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#queryPaymentOptions");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**PaymentModelsPaymentOptionQuery**](PaymentModelsPaymentOptionQuery.md)| The payment query |

### Return type

[**List&lt;PaymentModelsPaymentOption&gt;**](PaymentModelsPaymentOption.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

