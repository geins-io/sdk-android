# MarketApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketById**](MarketApi.md#getMarketById) | **GET** /API/Market/{marketId} | Get a specific market
[**listMarkets**](MarketApi.md#listMarkets) | **GET** /API/Market/List | Gets a list of all markets



## getMarketById

> EnvelopeMarketModelsMarket getMarketById(marketId, marketIdType)

Get a specific market

### Example

```java
// Import classes:
//import org.openapitools.client.api.MarketApi;

MarketApi apiInstance = new MarketApi();
String marketId = null; // String | The id of the market to get.
Integer marketIdType = null; // Integer | The type of market id supplied. See {Market.Models.MarketIdType} for valid options.
try {
    EnvelopeMarketModelsMarket result = apiInstance.getMarketById(marketId, marketIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketId** | **String**| The id of the market to get. | [default to null]
 **marketIdType** | **Integer**| The type of market id supplied. See {Market.Models.MarketIdType} for valid options. | [optional] [default to null] [enum: 0, 1]

### Return type

[**EnvelopeMarketModelsMarket**](EnvelopeMarketModelsMarket.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## listMarkets

> MarketModelsMarket listMarkets()

Gets a list of all markets

### Example

```java
// Import classes:
//import org.openapitools.client.api.MarketApi;

MarketApi apiInstance = new MarketApi();
try {
    MarketModelsMarket result = apiInstance.listMarkets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#listMarkets");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**MarketModelsMarket**](MarketModelsMarket.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

