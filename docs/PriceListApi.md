# PriceListApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPriceLists**](PriceListApi.md#listPriceLists) | **GET** /API/PriceList/List | Get all price list definitions
[**updatePricelistPrices**](PriceListApi.md#updatePricelistPrices) | **PUT** /API/PriceList/Price | Updates price list prices



## listPriceLists

> List&lt;PriceListModelsPriceList&gt; listPriceLists()

Get all price list definitions

- Prices on campaign price lists (id: xxxxxx2) can not be updated. Any such entries will be ignored.  - ID for Ordinary, Sale and Campaign price lists starts from 1000000.   The ID is calculated by this formula, Market ID * 1000000 + Type of price list (Ordinary&#x3D;0, Sale&#x3D;1, Capaign&#x3D;2)  So :  Ordinary price list for market with ID 1 has ID &#x3D; 1000000  Sale price list for market with ID 1 has ID &#x3D; 1000001  Campaign price list for market with ID 1 has ID &#x3D; 1000002  Ordinary price list for market with ID 2 has ID &#x3D; 2000000  And so on ...

### Example

```java
// Import classes:
//import org.openapitools.client.api.PriceListApi;

PriceListApi apiInstance = new PriceListApi();
try {
    List<PriceListModelsPriceList> result = apiInstance.listPriceLists();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceListApi#listPriceLists");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;PriceListModelsPriceList&gt;**](PriceListModelsPriceList.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## updatePricelistPrices

> PriceListModelsPriceListPriceResponse updatePricelistPrices(priceListPrices, productIdType, pricesIncVat)

Updates price list prices

- Prices on campaign price lists (id: xxxxxx2) can not be updated. Any such entries will be ignored.  - ID for Ordinary, Sale and Campaign price lists starts from 1000000.   The ID is calculated by this formula, Market ID * 1000000 + Type of price list (Ordinary&#x3D;0, Sale&#x3D;1, Capaign&#x3D;2)  So :  Ordinary price list for market with ID 1 has ID &#x3D; 1000000  Sale price list for market with ID 1 has ID &#x3D; 1000001  Campaign price list for market with ID 1 has ID &#x3D; 1000002  Ordinary price list for market with ID 2 has ID &#x3D; 2000000  And so on ...

### Example

```java
// Import classes:
//import org.openapitools.client.api.PriceListApi;

PriceListApi apiInstance = new PriceListApi();
List<PriceListModelsWritePriceListPrice> priceListPrices = Arrays.asList(new PriceListModelsWritePriceListPrice()); // List<PriceListModelsWritePriceListPrice> | List of new price list prices.
Integer productIdType = null; // Integer | The type of product id supplied in {priceListPrices}
Boolean pricesIncVat = null; // Boolean | Set to true if prices in {priceListPrices} includes VAT. Leave blank or set to false if they exclude VAT.
try {
    PriceListModelsPriceListPriceResponse result = apiInstance.updatePricelistPrices(priceListPrices, productIdType, pricesIncVat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceListApi#updatePricelistPrices");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceListPrices** | [**List&lt;PriceListModelsWritePriceListPrice&gt;**](PriceListModelsWritePriceListPrice.md)| List of new price list prices. |
 **productIdType** | **Integer**| The type of product id supplied in {priceListPrices} | [optional] [default to null] [enum: 0, 1, 2, 3]
 **pricesIncVat** | **Boolean**| Set to true if prices in {priceListPrices} includes VAT. Leave blank or set to false if they exclude VAT. | [optional] [default to null]

### Return type

[**PriceListModelsPriceListPriceResponse**](PriceListModelsPriceListPriceResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

