# ProductParameterApi

All URIs are relative to *https://mgmtapi.geins.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchReplaceProductParameterValues**](ProductParameterApi.md#batchReplaceProductParameterValues) | **POST** /API/ProductParameter/Values | Replace multiple product parameter values
[**batchUpdateProductParameterValues**](ProductParameterApi.md#batchUpdateProductParameterValues) | **PUT** /API/ProductParameter/Values | Update multiple product parameter values
[**createOrUpdateProductParameterValue**](ProductParameterApi.md#createOrUpdateProductParameterValue) | **POST** /API/ProductParameter/Value | Create or update a new product parameter value
[**createProductParameter**](ProductParameterApi.md#createProductParameter) | **POST** /API/ProductParameter | Create a new product parameter
[**createProductParameterGroup**](ProductParameterApi.md#createProductParameterGroup) | **POST** /API/ProductParameter/Group | Create a new product parameter group
[**createProductParameterPredefinedValue**](ProductParameterApi.md#createProductParameterPredefinedValue) | **POST** /API/ProductParameter/PredefinedValue | Create a new predefined value for a product parameter
[**getProductParameterById**](ProductParameterApi.md#getProductParameterById) | **GET** /API/ProductParameter/{id} | Get a specific product parameter
[**getProductParameterGroupById**](ProductParameterApi.md#getProductParameterGroupById) | **GET** /API/ProductParameter/Group/{id} | Get a specific product parameter group
[**getProductParameterPredefinedValue**](ProductParameterApi.md#getProductParameterPredefinedValue) | **GET** /API/ProductParameter/PredefinedValue/{id} | Get a specific predefined value for a product parameter
[**getProductParameterValue**](ProductParameterApi.md#getProductParameterValue) | **GET** /API/ProductParameter/Value/{id} | Get a specific product parameter value
[**updateProductParameter**](ProductParameterApi.md#updateProductParameter) | **PUT** /API/ProductParameter/{id} | Updates a product parameter
[**updateProductParameterGroup**](ProductParameterApi.md#updateProductParameterGroup) | **PUT** /API/ProductParameter/Group/{id} | Update a product parameter group



## batchReplaceProductParameterValues

> Envelope batchReplaceProductParameterValues(productParameterBatch)

Replace multiple product parameter values

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
ProductParameterModelsWriteProductParameterValueBatch productParameterBatch = new ProductParameterModelsWriteProductParameterValueBatch(); // ProductParameterModelsWriteProductParameterValueBatch | The product parameter values to replace.
try {
    Envelope result = apiInstance.batchReplaceProductParameterValues(productParameterBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#batchReplaceProductParameterValues");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productParameterBatch** | [**ProductParameterModelsWriteProductParameterValueBatch**](ProductParameterModelsWriteProductParameterValueBatch.md)| The product parameter values to replace. |

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## batchUpdateProductParameterValues

> Envelope batchUpdateProductParameterValues(productParameterBatch)

Update multiple product parameter values

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
ProductParameterModelsWriteProductParameterValueBatch productParameterBatch = new ProductParameterModelsWriteProductParameterValueBatch(); // ProductParameterModelsWriteProductParameterValueBatch | The product parameter values update.
try {
    Envelope result = apiInstance.batchUpdateProductParameterValues(productParameterBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#batchUpdateProductParameterValues");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productParameterBatch** | [**ProductParameterModelsWriteProductParameterValueBatch**](ProductParameterModelsWriteProductParameterValueBatch.md)| The product parameter values update. |

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createOrUpdateProductParameterValue

> EnvelopeProductParameterModelsReadProductParameterValue createOrUpdateProductParameterValue(productParameterValue)

Create or update a new product parameter value

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
ProductParameterModelsWriteProductParameterValue productParameterValue = new ProductParameterModelsWriteProductParameterValue(); // ProductParameterModelsWriteProductParameterValue | The product parameter value to create or update.
try {
    EnvelopeProductParameterModelsReadProductParameterValue result = apiInstance.createOrUpdateProductParameterValue(productParameterValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#createOrUpdateProductParameterValue");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productParameterValue** | [**ProductParameterModelsWriteProductParameterValue**](ProductParameterModelsWriteProductParameterValue.md)| The product parameter value to create or update. |

### Return type

[**EnvelopeProductParameterModelsReadProductParameterValue**](EnvelopeProductParameterModelsReadProductParameterValue.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createProductParameter

> EnvelopeProductParameterModelsReadProductParameter createProductParameter(productParameter)

Create a new product parameter

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
ProductParameterModelsWriteProductParameter productParameter = new ProductParameterModelsWriteProductParameter(); // ProductParameterModelsWriteProductParameter | The product parameter to create.
try {
    EnvelopeProductParameterModelsReadProductParameter result = apiInstance.createProductParameter(productParameter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#createProductParameter");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productParameter** | [**ProductParameterModelsWriteProductParameter**](ProductParameterModelsWriteProductParameter.md)| The product parameter to create. |

### Return type

[**EnvelopeProductParameterModelsReadProductParameter**](EnvelopeProductParameterModelsReadProductParameter.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createProductParameterGroup

> EnvelopeProductParameterModelsReadProductParameterGroup createProductParameterGroup(productParameterGroup)

Create a new product parameter group

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
ProductParameterModelsWriteProductParameterGroup productParameterGroup = new ProductParameterModelsWriteProductParameterGroup(); // ProductParameterModelsWriteProductParameterGroup | The product parameter group to create.
try {
    EnvelopeProductParameterModelsReadProductParameterGroup result = apiInstance.createProductParameterGroup(productParameterGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#createProductParameterGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productParameterGroup** | [**ProductParameterModelsWriteProductParameterGroup**](ProductParameterModelsWriteProductParameterGroup.md)| The product parameter group to create. |

### Return type

[**EnvelopeProductParameterModelsReadProductParameterGroup**](EnvelopeProductParameterModelsReadProductParameterGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createProductParameterPredefinedValue

> EnvelopeProductParameterModelsReadProductParameterPredefinedValue createProductParameterPredefinedValue(productParameterPredefinedValue)

Create a new predefined value for a product parameter

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
ProductParameterModelsWriteProductParameterPredefinedValue productParameterPredefinedValue = new ProductParameterModelsWriteProductParameterPredefinedValue(); // ProductParameterModelsWriteProductParameterPredefinedValue | The predefined value to create.
try {
    EnvelopeProductParameterModelsReadProductParameterPredefinedValue result = apiInstance.createProductParameterPredefinedValue(productParameterPredefinedValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#createProductParameterPredefinedValue");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productParameterPredefinedValue** | [**ProductParameterModelsWriteProductParameterPredefinedValue**](ProductParameterModelsWriteProductParameterPredefinedValue.md)| The predefined value to create. |

### Return type

[**EnvelopeProductParameterModelsReadProductParameterPredefinedValue**](EnvelopeProductParameterModelsReadProductParameterPredefinedValue.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## getProductParameterById

> EnvelopeProductParameterModelsReadProductParameter getProductParameterById(id)

Get a specific product parameter

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
Integer id = null; // Integer | The id of the product parameter to get.
try {
    EnvelopeProductParameterModelsReadProductParameter result = apiInstance.getProductParameterById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#getProductParameterById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the product parameter to get. | [default to null]

### Return type

[**EnvelopeProductParameterModelsReadProductParameter**](EnvelopeProductParameterModelsReadProductParameter.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getProductParameterGroupById

> EnvelopeProductParameterModelsReadProductParameterGroup getProductParameterGroupById(id)

Get a specific product parameter group

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
Integer id = null; // Integer | The id of the product parameter group to get.
try {
    EnvelopeProductParameterModelsReadProductParameterGroup result = apiInstance.getProductParameterGroupById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#getProductParameterGroupById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the product parameter group to get. | [default to null]

### Return type

[**EnvelopeProductParameterModelsReadProductParameterGroup**](EnvelopeProductParameterModelsReadProductParameterGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getProductParameterPredefinedValue

> EnvelopeProductParameterModelsReadProductParameterValue getProductParameterPredefinedValue(id)

Get a specific predefined value for a product parameter

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
Integer id = null; // Integer | The id of the predefined value to get.
try {
    EnvelopeProductParameterModelsReadProductParameterValue result = apiInstance.getProductParameterPredefinedValue(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#getProductParameterPredefinedValue");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the predefined value to get. | [default to null]

### Return type

[**EnvelopeProductParameterModelsReadProductParameterValue**](EnvelopeProductParameterModelsReadProductParameterValue.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getProductParameterValue

> EnvelopeProductParameterModelsReadProductParameterValue getProductParameterValue(id, predefinedValueId)

Get a specific product parameter value

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
Integer id = null; // Integer | The id of the product parameter value to get.
String predefinedValueId = null; // String | The predefined value id of the product parameter value to get. Only applicable for {ProductParameter.Models.ProductParameterType.Multi}.
try {
    EnvelopeProductParameterModelsReadProductParameterValue result = apiInstance.getProductParameterValue(id, predefinedValueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#getProductParameterValue");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the product parameter value to get. | [default to null]
 **predefinedValueId** | **String**| The predefined value id of the product parameter value to get. Only applicable for {ProductParameter.Models.ProductParameterType.Multi}. | [optional] [default to null]

### Return type

[**EnvelopeProductParameterModelsReadProductParameterValue**](EnvelopeProductParameterModelsReadProductParameterValue.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## updateProductParameter

> EnvelopeProductParameterModelsReadProductParameter updateProductParameter(id, productParameter)

Updates a product parameter

Leaving out a property will ensure no changes are made to that property. Collection properties will delete and/or add as necessary to match the supplied data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
Integer id = null; // Integer | The id of the product parameter to update.
ProductParameterModelsWriteProductParameter productParameter = new ProductParameterModelsWriteProductParameter(); // ProductParameterModelsWriteProductParameter | The product parameter data to update.
try {
    EnvelopeProductParameterModelsReadProductParameter result = apiInstance.updateProductParameter(id, productParameter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#updateProductParameter");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the product parameter to update. | [default to null]
 **productParameter** | [**ProductParameterModelsWriteProductParameter**](ProductParameterModelsWriteProductParameter.md)| The product parameter data to update. |

### Return type

[**EnvelopeProductParameterModelsReadProductParameter**](EnvelopeProductParameterModelsReadProductParameter.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateProductParameterGroup

> EnvelopeProductParameterModelsReadProductParameterGroup updateProductParameterGroup(id, productParameterGroup)

Update a product parameter group

Leaving out a property will ensure no changes are made to that property. Collection properties will delete and/or add as necessary to match the supplied data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductParameterApi;

ProductParameterApi apiInstance = new ProductParameterApi();
Integer id = null; // Integer | The id of the product parameter group to update.
ProductParameterModelsWriteProductParameterGroup productParameterGroup = new ProductParameterModelsWriteProductParameterGroup(); // ProductParameterModelsWriteProductParameterGroup | The product parameter group data to update.
try {
    EnvelopeProductParameterModelsReadProductParameterGroup result = apiInstance.updateProductParameterGroup(id, productParameterGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductParameterApi#updateProductParameterGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the product parameter group to update. | [default to null]
 **productParameterGroup** | [**ProductParameterModelsWriteProductParameterGroup**](ProductParameterModelsWriteProductParameterGroup.md)| The product parameter group data to update. |

### Return type

[**EnvelopeProductParameterModelsReadProductParameterGroup**](EnvelopeProductParameterModelsReadProductParameterGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

