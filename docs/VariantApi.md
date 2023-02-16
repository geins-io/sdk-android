# VariantApi

All URIs are relative to *https://mgmtapi.geins.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductToVariantGroup**](VariantApi.md#addProductToVariantGroup) | **PUT** /API/VariantGroup/{groupId}/{productId} | Adds a product to an existing group
[**addProductToVariantGroupByProductId**](VariantApi.md#addProductToVariantGroupByProductId) | **PUT** /API/Variant/{productId1}/{productId2} | Adds a product to an existing group
[**createVariantGroup**](VariantApi.md#createVariantGroup) | **POST** /API/VariantGroup | Create a new variant group
[**createVariantGroupWithProduct**](VariantApi.md#createVariantGroupWithProduct) | **POST** /API/Variant/{productId}/VariantGroup | Create a new group for the provided product id
[**deleteVariantGroup**](VariantApi.md#deleteVariantGroup) | **DELETE** /API/VariantGroup/{groupId} | Delete an entire variant group
[**deleteVariantGroupByProductId**](VariantApi.md#deleteVariantGroupByProductId) | **DELETE** /API/Variant/{productId}/VariantGroup | Delete an entire variant group
[**getVariantGroup**](VariantApi.md#getVariantGroup) | **GET** /API/VariantGroup/{groupId} | Get a specific variant group
[**getVariantGroupByProductId**](VariantApi.md#getVariantGroupByProductId) | **GET** /API/Variant/{productId}/VariantGroup | Get the variant group for the provided id
[**getVariantLabels**](VariantApi.md#getVariantLabels) | **GET** /API/Variant/Labels | Get all valid variant labels
[**removeProductFromVariantGroup**](VariantApi.md#removeProductFromVariantGroup) | **DELETE** /API/Variant/{productId} | Remove a product from its variant group
[**updateVariant**](VariantApi.md#updateVariant) | **PUT** /API/Variant/{productId} | Adds the variant details for the product with the provided ID
[**updateVariantGroup**](VariantApi.md#updateVariantGroup) | **PUT** /API/VariantGroup/{groupId} | Updates the settings of a group



## addProductToVariantGroup

> EnvelopeVariantModelsReadVariantGroup addProductToVariantGroup(groupId, productId, variant, productIdType, include)

Adds a product to an existing group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
Integer groupId = null; // Integer | The ID of the group to which a product should be added
String productId = null; // String | The ID of the product to be added to the target group.
List<VariantModelsWriteVariant> variant = Arrays.asList(new VariantModelsWriteVariant()); // List<VariantModelsWriteVariant> | The variant details.
Integer productIdType = null; // Integer | The type of product id provided.
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.addProductToVariantGroup(groupId, productId, variant, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#addProductToVariantGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**| The ID of the group to which a product should be added | [default to null]
 **productId** | **String**| The ID of the product to be added to the target group. | [default to null]
 **variant** | [**List&lt;VariantModelsWriteVariant&gt;**](VariantModelsWriteVariant.md)| The variant details. |
 **productIdType** | **Integer**| The type of product id provided. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## addProductToVariantGroupByProductId

> EnvelopeVariantModelsReadVariantGroup addProductToVariantGroupByProductId(productId1, productId2, productIdType, include)

Adds a product to an existing group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
String productId1 = null; // String | The ID of a product belonging to the target group.
String productId2 = null; // String | The ID of the product to be added to the target group.
Integer productIdType = null; // Integer | The type of product id provided.
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.addProductToVariantGroupByProductId(productId1, productId2, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#addProductToVariantGroupByProductId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId1** | **String**| The ID of a product belonging to the target group. | [default to null]
 **productId2** | **String**| The ID of the product to be added to the target group. | [default to null]
 **productIdType** | **Integer**| The type of product id provided. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## createVariantGroup

> EnvelopeVariantModelsReadVariantGroup createVariantGroup(variantGroup, include)

Create a new variant group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
VariantModelsWriteVariantGroup variantGroup = new VariantModelsWriteVariantGroup(); // VariantModelsWriteVariantGroup | The settings for the new group.
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.createVariantGroup(variantGroup, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#createVariantGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantGroup** | [**VariantModelsWriteVariantGroup**](VariantModelsWriteVariantGroup.md)| The settings for the new group. |
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createVariantGroupWithProduct

> EnvelopeVariantModelsReadVariantGroup createVariantGroupWithProduct(productId, variantGroup, productIdType, include)

Create a new group for the provided product id

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
String productId = null; // String | The id of the product, for which to create a group.
VariantModelsWriteVariantGroup variantGroup = new VariantModelsWriteVariantGroup(); // VariantModelsWriteVariantGroup | The settings for the new group.
Integer productIdType = null; // Integer | The type of product id provided.
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.createVariantGroupWithProduct(productId, variantGroup, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#createVariantGroupWithProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product, for which to create a group. | [default to null]
 **variantGroup** | [**VariantModelsWriteVariantGroup**](VariantModelsWriteVariantGroup.md)| The settings for the new group. |
 **productIdType** | **Integer**| The type of product id provided. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## deleteVariantGroup

> EnvelopeVariantModelsReadVariantGroup deleteVariantGroup(groupId)

Delete an entire variant group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
Integer groupId = null; // Integer | The ID of the group to delete
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.deleteVariantGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#deleteVariantGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**| The ID of the group to delete | [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## deleteVariantGroupByProductId

> Envelope deleteVariantGroupByProductId(productId, productIdType)

Delete an entire variant group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
String productId = null; // String | The id of a product that belongs to the group to remove.
Integer productIdType = null; // Integer | The type of product id provided.
try {
    Envelope result = apiInstance.deleteVariantGroupByProductId(productId, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#deleteVariantGroupByProductId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of a product that belongs to the group to remove. | [default to null]
 **productIdType** | **Integer**| The type of product id provided. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getVariantGroup

> EnvelopeVariantModelsReadVariantGroup getVariantGroup(groupId, include)

Get a specific variant group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
Integer groupId = null; // Integer | The ID of the group to get
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.getVariantGroup(groupId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#getVariantGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**| The ID of the group to get | [default to null]
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getVariantGroupByProductId

> EnvelopeVariantModelsReadVariantGroup getVariantGroupByProductId(productId, productIdType, include)

Get the variant group for the provided id

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
String productId = null; // String | The id of the product, for which to get the group.
Integer productIdType = null; // Integer | The type of id.
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.getVariantGroupByProductId(productId, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#getVariantGroupByProductId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product, for which to get the group. | [default to null]
 **productIdType** | **Integer**| The type of id. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getVariantLabels

> EnvelopeString getVariantLabels()

Get all valid variant labels

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
try {
    EnvelopeString result = apiInstance.getVariantLabels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#getVariantLabels");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EnvelopeString**](EnvelopeString.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## removeProductFromVariantGroup

> EnvelopeVariantModelsReadVariantGroup removeProductFromVariantGroup(productId, productIdType, include)

Remove a product from its variant group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
String productId = null; // String | The id of the product to remove from group.
Integer productIdType = null; // Integer | The type of product id provided.
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.removeProductFromVariantGroup(productId, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#removeProductFromVariantGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to remove from group. | [default to null]
 **productIdType** | **Integer**| The type of product id provided. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## updateVariant

> EnvelopeVariantModelsReadVariant updateVariant(productId, variant, productIdType)

Adds the variant details for the product with the provided ID

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
String productId = null; // String | The ID of the product for which to update the variant details.
List<VariantModelsWriteVariant> variant = Arrays.asList(new VariantModelsWriteVariant()); // List<VariantModelsWriteVariant> | The variant details.
Integer productIdType = null; // Integer | The type of product id provided.
try {
    EnvelopeVariantModelsReadVariant result = apiInstance.updateVariant(productId, variant, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#updateVariant");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The ID of the product for which to update the variant details. | [default to null]
 **variant** | [**List&lt;VariantModelsWriteVariant&gt;**](VariantModelsWriteVariant.md)| The variant details. |
 **productIdType** | **Integer**| The type of product id provided. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**EnvelopeVariantModelsReadVariant**](EnvelopeVariantModelsReadVariant.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateVariantGroup

> EnvelopeVariantModelsReadVariantGroup updateVariantGroup(groupId, variantGroup, include)

Updates the settings of a group

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariantApi;

VariantApi apiInstance = new VariantApi();
Integer groupId = null; // Integer | The ID of the group to update
VariantModelsWriteVariantGroup variantGroup = new VariantModelsWriteVariantGroup(); // VariantModelsWriteVariantGroup | The new settings for the group
String include = null; // String | Comma separated list of product child collections to also include with the variant group. Set to \"product\" to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeVariantModelsReadVariantGroup result = apiInstance.updateVariantGroup(groupId, variantGroup, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariantApi#updateVariantGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**| The ID of the group to update | [default to null]
 **variantGroup** | [**VariantModelsWriteVariantGroup**](VariantModelsWriteVariantGroup.md)| The new settings for the group |
 **include** | **String**| Comma separated list of product child collections to also include with the variant group. Set to \&quot;product\&quot; to only include basic product data and to null (skip) to not include any product data. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeVariantModelsReadVariantGroup**](EnvelopeVariantModelsReadVariantGroup.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

