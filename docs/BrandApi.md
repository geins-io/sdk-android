# BrandApi

All URIs are relative to *https://mgmtapi.geins.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrand**](BrandApi.md#createBrand) | **POST** /API/Brand | Create a new brand
[**getBrandById**](BrandApi.md#getBrandById) | **GET** /API/Brand/{id} | Get a specific brand
[**queryBrands**](BrandApi.md#queryBrands) | **POST** /API/Brand/Query | Query brands
[**updateBrand**](BrandApi.md#updateBrand) | **PUT** /API/Brand/{id} | Updates a brand



## createBrand

> EnvelopeBrandModelsReadBrand createBrand(brand)

Create a new brand

### Example

```java
// Import classes:
//import org.openapitools.client.api.BrandApi;

BrandApi apiInstance = new BrandApi();
BrandModelsWriteBrand brand = new BrandModelsWriteBrand(); // BrandModelsWriteBrand | The brand to create.
try {
    EnvelopeBrandModelsReadBrand result = apiInstance.createBrand(brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#createBrand");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | [**BrandModelsWriteBrand**](BrandModelsWriteBrand.md)| The brand to create. |

### Return type

[**EnvelopeBrandModelsReadBrand**](EnvelopeBrandModelsReadBrand.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## getBrandById

> EnvelopeBrandModelsReadBrand getBrandById(id)

Get a specific brand

### Example

```java
// Import classes:
//import org.openapitools.client.api.BrandApi;

BrandApi apiInstance = new BrandApi();
Integer id = null; // Integer | The id of the brand to get.
try {
    EnvelopeBrandModelsReadBrand result = apiInstance.getBrandById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#getBrandById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the brand to get. | [default to null]

### Return type

[**EnvelopeBrandModelsReadBrand**](EnvelopeBrandModelsReadBrand.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## queryBrands

> List&lt;BrandModelsReadBrand&gt; queryBrands(query)

Query brands

### Example

```java
// Import classes:
//import org.openapitools.client.api.BrandApi;

BrandApi apiInstance = new BrandApi();
BrandModelsBrandQuery query = new BrandModelsBrandQuery(); // BrandModelsBrandQuery | The details of the query.
try {
    List<BrandModelsReadBrand> result = apiInstance.queryBrands(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#queryBrands");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**BrandModelsBrandQuery**](BrandModelsBrandQuery.md)| The details of the query. |

### Return type

[**List&lt;BrandModelsReadBrand&gt;**](BrandModelsReadBrand.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateBrand

> EnvelopeBrandModelsReadBrand updateBrand(id, brand)

Updates a brand

Leaving out a property will ensure no changes are made to that property.  Collection properties will delete and/or add as necessary to match the supplied data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BrandApi;

BrandApi apiInstance = new BrandApi();
Integer id = null; // Integer | The id of the brand to update.
BrandModelsWriteBrand brand = new BrandModelsWriteBrand(); // BrandModelsWriteBrand | The brand data to update.
try {
    EnvelopeBrandModelsReadBrand result = apiInstance.updateBrand(id, brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandApi#updateBrand");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the brand to update. | [default to null]
 **brand** | [**BrandModelsWriteBrand**](BrandModelsWriteBrand.md)| The brand data to update. |

### Return type

[**EnvelopeBrandModelsReadBrand**](EnvelopeBrandModelsReadBrand.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

