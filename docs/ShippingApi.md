# ShippingApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createParcelGroup**](ShippingApi.md#createParcelGroup) | **POST** /API/Shipping/ParcelGroup | Create a new parcel group
[**queryShippingOptions**](ShippingApi.md#queryShippingOptions) | **POST** /API/Shipping/Query | Query shipping options



## createParcelGroup

> EnvelopeInt createParcelGroup(parcelGroupOptions)

Create a new parcel group

### Example

```java
// Import classes:
//import org.openapitools.client.api.ShippingApi;

ShippingApi apiInstance = new ShippingApi();
ShippingModelsParcelGroupOptions parcelGroupOptions = new ShippingModelsParcelGroupOptions(); // ShippingModelsParcelGroupOptions | Options for the new parcel group.
try {
    EnvelopeInt result = apiInstance.createParcelGroup(parcelGroupOptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingApi#createParcelGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parcelGroupOptions** | [**ShippingModelsParcelGroupOptions**](ShippingModelsParcelGroupOptions.md)| Options for the new parcel group. |

### Return type

[**EnvelopeInt**](EnvelopeInt.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## queryShippingOptions

> List&lt;ShippingModelsShippingOption&gt; queryShippingOptions(shippingQuery)

Query shipping options

No response envelope.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ShippingApi;

ShippingApi apiInstance = new ShippingApi();
ShippingModelsShippingQuery shippingQuery = new ShippingModelsShippingQuery(); // ShippingModelsShippingQuery | The query to filter shipping options by.
try {
    List<ShippingModelsShippingOption> result = apiInstance.queryShippingOptions(shippingQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingApi#queryShippingOptions");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shippingQuery** | [**ShippingModelsShippingQuery**](ShippingModelsShippingQuery.md)| The query to filter shipping options by. |

### Return type

[**List&lt;ShippingModelsShippingOption&gt;**](ShippingModelsShippingOption.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

