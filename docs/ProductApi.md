# ProductApi

All URIs are relative to *https://mgmtapi.geins.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAvailabilityMonitor**](ProductApi.md#addAvailabilityMonitor) | **POST** /API/Product/MonitorAvailability | Add a product availability monitor
[**addCategoryToProduct**](ProductApi.md#addCategoryToProduct) | **PUT** /API/Product/{productId}/Category | Adds a category relation to a product
[**addImageToProduct**](ProductApi.md#addImageToProduct) | **PUT** /API/Product/{productId}/Image/{imageName} | Adds an image relation to a product
[**addRelatedProductsToProduct**](ProductApi.md#addRelatedProductsToProduct) | **PUT** /API/Product/{productId}/Related | Add related products to a product
[**batchUpdateProductItems**](ProductApi.md#batchUpdateProductItems) | **PUT** /API/Product/Items | Updates product items in batch
[**batchUpdateStockValues**](ProductApi.md#batchUpdateStockValues) | **PUT** /API/Product/Stock | Update stock values for multiple product items
[**createProduct**](ProductApi.md#createProduct) | **POST** /API/Product | Create a new product
[**createProductItems**](ProductApi.md#createProductItems) | **POST** /API/Product/{productId}/Item | Create a new product item
[**getProductById**](ProductApi.md#getProductById) | **GET** /API/Product/{productId} | Get a specific product
[**getProductItemById**](ProductApi.md#getProductItemById) | **GET** /API/Product/Item/{itemId} | Get a specific product item
[**linkRelatedProductsByRelationId**](ProductApi.md#linkRelatedProductsByRelationId) | **PUT** /API/Product/{productId}/Related/{relationTypeId} | Add related products to a product using a fixed relation type
[**listAllProductItemsPaged**](ProductApi.md#listAllProductItemsPaged) | **GET** /API/Product/Items/{page} | Get all product items with pagination
[**listFeeds**](ProductApi.md#listFeeds) | **GET** /API/Product/Feeds | Gets a list of all feeds
[**listProductItems**](ProductApi.md#listProductItems) | **GET** /API/Product/Items | Get all product items
[**listProductRelationTypes**](ProductApi.md#listProductRelationTypes) | **GET** /API/Product/RelationTypes | Gets a list of product relation types
[**queryProducts**](ProductApi.md#queryProducts) | **POST** /API/Product/Query | Query products
[**queryProductsPaged**](ProductApi.md#queryProductsPaged) | **POST** /API/Product/Query/{page} | Query products with pagination
[**queryStock**](ProductApi.md#queryStock) | **POST** /API/Product/Stock/Query | Query stock
[**updateProduct**](ProductApi.md#updateProduct) | **PUT** /API/Product/{productId} | Updates a product
[**updateProductItem**](ProductApi.md#updateProductItem) | **PUT** /API/Product/Item/{itemId} | Updates a product item



## addAvailabilityMonitor

> Envelope addAvailabilityMonitor(model)

Add a product availability monitor

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductModelsMonitorSku model = new ProductModelsMonitorSku(); // ProductModelsMonitorSku | 
try {
    Envelope result = apiInstance.addAvailabilityMonitor(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addAvailabilityMonitor");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ProductModelsMonitorSku**](ProductModelsMonitorSku.md)|  |

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## addCategoryToProduct

> Envelope addCategoryToProduct(productId, productCategory, productIdType)

Adds a category relation to a product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the product to update.
ProductModelsProductCategory productCategory = new ProductModelsProductCategory(); // ProductModelsProductCategory | The category to relate the product to.
Integer productIdType = null; // Integer | The type of product id supplied in {productId}.
try {
    Envelope result = apiInstance.addCategoryToProduct(productId, productCategory, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addCategoryToProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to update. | [default to null]
 **productCategory** | [**ProductModelsProductCategory**](ProductModelsProductCategory.md)| The category to relate the product to. |
 **productIdType** | **Integer**| The type of product id supplied in {productId}. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## addImageToProduct

> Envelope addImageToProduct(productId, imageName, isPrimaryImage, productIdType)

Adds an image relation to a product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the product to update.
String imageName = null; // String | The name of the image to set to product.
Boolean isPrimaryImage = null; // Boolean | Specifies whether {imageName} should be set as the primary image of the product.
Integer productIdType = null; // Integer | The type of product id supplied in {productId}.
try {
    Envelope result = apiInstance.addImageToProduct(productId, imageName, isPrimaryImage, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addImageToProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to update. | [default to null]
 **imageName** | **String**| The name of the image to set to product. | [default to null]
 **isPrimaryImage** | **Boolean**| Specifies whether {imageName} should be set as the primary image of the product. | [optional] [default to null]
 **productIdType** | **Integer**| The type of product id supplied in {productId}. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## addRelatedProductsToProduct

> ProductModelsRelatedProductEnvelope addRelatedProductsToProduct(productId, relatedProducts, productIdType)

Add related products to a product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the main product to which the relations will be created
List<ProductModelsWriteRelatedProduct> relatedProducts = Arrays.asList(new ProductModelsWriteRelatedProduct()); // List<ProductModelsWriteRelatedProduct> | The list of related products to link with the main product.
Integer productIdType = null; // Integer | The type of product id for {productId} and supplied in {relatedProducts}.
try {
    ProductModelsRelatedProductEnvelope result = apiInstance.addRelatedProductsToProduct(productId, relatedProducts, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#addRelatedProductsToProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the main product to which the relations will be created | [default to null]
 **relatedProducts** | [**List&lt;ProductModelsWriteRelatedProduct&gt;**](ProductModelsWriteRelatedProduct.md)| The list of related products to link with the main product. |
 **productIdType** | **Integer**| The type of product id for {productId} and supplied in {relatedProducts}. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**ProductModelsRelatedProductEnvelope**](ProductModelsRelatedProductEnvelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## batchUpdateProductItems

> Envelope batchUpdateProductItems(productItems, productItemIdType)

Updates product items in batch

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
List<ProductModelsWriteProductItem> productItems = Arrays.asList(new ProductModelsWriteProductItem()); // List<ProductModelsWriteProductItem> | The product items to update
Integer productItemIdType = null; // Integer | The type of product item id
try {
    Envelope result = apiInstance.batchUpdateProductItems(productItems, productItemIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#batchUpdateProductItems");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productItems** | [**List&lt;ProductModelsWriteProductItem&gt;**](ProductModelsWriteProductItem.md)| The product items to update |
 **productItemIdType** | **Integer**| The type of product item id | [optional] [default to null] [enum: 0, 1, 2, 3, 4]

### Return type

[**Envelope**](Envelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## batchUpdateStockValues

> ProductModelsStockEnvelope batchUpdateStockValues(productItemStocks, productItemIdType)

Update stock values for multiple product items

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
List<ProductModelsWriteProductItemStock> productItemStocks = Arrays.asList(new ProductModelsWriteProductItemStock()); // List<ProductModelsWriteProductItemStock> | List of product item ids with new stock values.
Integer productItemIdType = null; // Integer | The type of product item id supplied in {productItemStocks}.
try {
    ProductModelsStockEnvelope result = apiInstance.batchUpdateStockValues(productItemStocks, productItemIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#batchUpdateStockValues");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productItemStocks** | [**List&lt;ProductModelsWriteProductItemStock&gt;**](ProductModelsWriteProductItemStock.md)| List of product item ids with new stock values. |
 **productItemIdType** | **Integer**| The type of product item id supplied in {productItemStocks}. | [optional] [default to null] [enum: 0, 1, 2, 3, 4]

### Return type

[**ProductModelsStockEnvelope**](ProductModelsStockEnvelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createProduct

> EnvelopeProductModelsReadProduct createProduct(product, include)

Create a new product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductModelsWriteProduct product = new ProductModelsWriteProduct(); // ProductModelsWriteProduct | The product to create.
String include = null; // String | Comma separated list of child-collections to also include with the created product. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeProductModelsReadProduct result = apiInstance.createProduct(product, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#createProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**ProductModelsWriteProduct**](ProductModelsWriteProduct.md)| The product to create. |
 **include** | **String**| Comma separated list of child-collections to also include with the created product. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeProductModelsReadProduct**](EnvelopeProductModelsReadProduct.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createProductItems

> EnvelopeProductModelsReadProductItem createProductItems(productId, productItem, productIdType)

Create a new product item

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the product to create an item on.
ProductModelsWriteProductItem productItem = new ProductModelsWriteProductItem(); // ProductModelsWriteProductItem | The product item to create.
Integer productIdType = null; // Integer | The type of product id supplied in {productId}.
try {
    EnvelopeProductModelsReadProductItem result = apiInstance.createProductItems(productId, productItem, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#createProductItems");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to create an item on. | [default to null]
 **productItem** | [**ProductModelsWriteProductItem**](ProductModelsWriteProductItem.md)| The product item to create. |
 **productIdType** | **Integer**| The type of product id supplied in {productId}. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**EnvelopeProductModelsReadProductItem**](EnvelopeProductModelsReadProductItem.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## getProductById

> EnvelopeProductModelsReadProduct getProductById(productId, productIdType, include)

Get a specific product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the product to get.
Integer productIdType = null; // Integer | The type of product id supplied in {productId}.
String include = null; // String | Comma separated list of child-collections to also include with the requested product. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeProductModelsReadProduct result = apiInstance.getProductById(productId, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProductById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to get. | [default to null]
 **productIdType** | **Integer**| The type of product id supplied in {productId}. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of child-collections to also include with the requested product. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeProductModelsReadProduct**](EnvelopeProductModelsReadProduct.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getProductItemById

> ProductProductItemEnvelope getProductItemById(itemId, productItemIdType)

Get a specific product item

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String itemId = null; // String | The id of the product item to get.
Integer productItemIdType = null; // Integer | The type of product item id supplied in {itemId}.
try {
    ProductProductItemEnvelope result = apiInstance.getProductItemById(itemId, productItemIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProductItemById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| The id of the product item to get. | [default to null]
 **productItemIdType** | **Integer**| The type of product item id supplied in {itemId}. | [optional] [default to null] [enum: 0, 1, 2, 3, 4]

### Return type

[**ProductProductItemEnvelope**](ProductProductItemEnvelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## linkRelatedProductsByRelationId

> ProductModelsRelatedProductEnvelope linkRelatedProductsByRelationId(productId, relationTypeId, relatedProducts, productIdType)

Add related products to a product using a fixed relation type

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the main product to which the relations will be created
Integer relationTypeId = null; // Integer | The relation type id that will apply to all related products in {relatedProducts}
List<ProductModelsWriteRelatedProduct> relatedProducts = Arrays.asList(new ProductModelsWriteRelatedProduct()); // List<ProductModelsWriteRelatedProduct> | The list of related products to link with the main product.
Integer productIdType = null; // Integer | The type of product id for {productId} and supplied in {relatedProducts}.
try {
    ProductModelsRelatedProductEnvelope result = apiInstance.linkRelatedProductsByRelationId(productId, relationTypeId, relatedProducts, productIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#linkRelatedProductsByRelationId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the main product to which the relations will be created | [default to null]
 **relationTypeId** | **Integer**| The relation type id that will apply to all related products in {relatedProducts} | [default to null]
 **relatedProducts** | [**List&lt;ProductModelsWriteRelatedProduct&gt;**](ProductModelsWriteRelatedProduct.md)| The list of related products to link with the main product. |
 **productIdType** | **Integer**| The type of product id for {productId} and supplied in {relatedProducts}. | [optional] [default to null] [enum: 0, 1, 2, 3]

### Return type

[**ProductModelsRelatedProductEnvelope**](ProductModelsRelatedProductEnvelope.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## listAllProductItemsPaged

> EnvelopeListProductModelsReadProductItem listAllProductItemsPaged(page)

Get all product items with pagination

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer page = null; // Integer | The page to fetch
try {
    EnvelopeListProductModelsReadProductItem result = apiInstance.listAllProductItemsPaged(page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listAllProductItemsPaged");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page to fetch | [default to null]

### Return type

[**EnvelopeListProductModelsReadProductItem**](EnvelopeListProductModelsReadProductItem.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## listFeeds

> EnvelopeListProductModelsReadFeed listFeeds()

Gets a list of all feeds

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
try {
    EnvelopeListProductModelsReadFeed result = apiInstance.listFeeds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listFeeds");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EnvelopeListProductModelsReadFeed**](EnvelopeListProductModelsReadFeed.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## listProductItems

> List&lt;ProductModelsReadProductItem&gt; listProductItems()

Get all product items

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
try {
    List<ProductModelsReadProductItem> result = apiInstance.listProductItems();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listProductItems");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ProductModelsReadProductItem&gt;**](ProductModelsReadProductItem.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## listProductRelationTypes

> EnvelopeListProductModelsReadRelationType listProductRelationTypes()

Gets a list of product relation types

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
try {
    EnvelopeListProductModelsReadRelationType result = apiInstance.listProductRelationTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listProductRelationTypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EnvelopeListProductModelsReadRelationType**](EnvelopeListProductModelsReadRelationType.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## queryProducts

> EnvelopeListProductModelsReadProduct queryProducts(query, include)

Query products

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductModelsProductQuery query = new ProductModelsProductQuery(); // ProductModelsProductQuery | The details of the query
String include = null; // String | Comma separated list of child-collections to also include with the queried products. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeListProductModelsReadProduct result = apiInstance.queryProducts(query, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#queryProducts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**ProductModelsProductQuery**](ProductModelsProductQuery.md)| The details of the query |
 **include** | **String**| Comma separated list of child-collections to also include with the queried products. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeListProductModelsReadProduct**](EnvelopeListProductModelsReadProduct.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## queryProductsPaged

> EnvelopeListProductModelsReadProduct queryProductsPaged(page, query, include)

Query products with pagination

The {Product.Models.ProductQuery.BatchId} property is mandatory when fetching a page other than the first page.  If no BatchId is provided for the first page, a new batch is created and the BatchId can be found in the {Envelope.PageResult} field.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer page = null; // Integer | The page to fetch. To start a new batched query it is mandatory to send in page=1
ProductModelsProductQuery query = new ProductModelsProductQuery(); // ProductModelsProductQuery | The details of the query
String include = null; // String | Comma separated list of child-collections to also include with the queried products. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeListProductModelsReadProduct result = apiInstance.queryProductsPaged(page, query, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#queryProductsPaged");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page to fetch. To start a new batched query it is mandatory to send in page&#x3D;1 | [default to null]
 **query** | [**ProductModelsProductQuery**](ProductModelsProductQuery.md)| The details of the query |
 **include** | **String**| Comma separated list of child-collections to also include with the queried products. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeListProductModelsReadProduct**](EnvelopeListProductModelsReadProduct.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## queryStock

> List&lt;ProductModelsReadProductItemStock&gt; queryStock(productItemIds)

Query stock

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
List<Integer> productItemIds = Arrays.asList(56); // List<Integer> | The details of the query.
try {
    List<ProductModelsReadProductItemStock> result = apiInstance.queryStock(productItemIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#queryStock");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productItemIds** | [**List&lt;Integer&gt;**](Integer.md)| The details of the query. |

### Return type

[**List&lt;ProductModelsReadProductItemStock&gt;**](ProductModelsReadProductItemStock.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateProduct

> EnvelopeProductModelsReadProduct updateProduct(productId, product, productIdType, include)

Updates a product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = null; // String | The id of the product to update.
ProductModelsWriteProduct product = new ProductModelsWriteProduct(); // ProductModelsWriteProduct | The product data to update.
Integer productIdType = null; // Integer | The type of product id supplied in {productId}.
String include = null; // String | Comma separated list of child-collections to also include with the updated product. See  {Product.Models.ProductIncludes} names for valid options.
try {
    EnvelopeProductModelsReadProduct result = apiInstance.updateProduct(productId, product, productIdType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to update. | [default to null]
 **product** | [**ProductModelsWriteProduct**](ProductModelsWriteProduct.md)| The product data to update. |
 **productIdType** | **Integer**| The type of product id supplied in {productId}. | [optional] [default to null] [enum: 0, 1, 2, 3]
 **include** | **String**| Comma separated list of child-collections to also include with the updated product. See  {Product.Models.ProductIncludes} names for valid options. | [optional] [default to null]

### Return type

[**EnvelopeProductModelsReadProduct**](EnvelopeProductModelsReadProduct.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateProductItem

> EnvelopeProductModelsReadProductItem updateProductItem(itemId, productItem, productItemIdType)

Updates a product item

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String itemId = null; // String | The id of the product item to update.
ProductModelsWriteProductItem productItem = new ProductModelsWriteProductItem(); // ProductModelsWriteProductItem | The product item data to update.
Integer productItemIdType = null; // Integer | The type of product item id supplied in {itemId}.
try {
    EnvelopeProductModelsReadProductItem result = apiInstance.updateProductItem(itemId, productItem, productItemIdType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#updateProductItem");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| The id of the product item to update. | [default to null]
 **productItem** | [**ProductModelsWriteProductItem**](ProductModelsWriteProductItem.md)| The product item data to update. |
 **productItemIdType** | **Integer**| The type of product item id supplied in {itemId}. | [optional] [default to null] [enum: 0, 1, 2, 3, 4]

### Return type

[**EnvelopeProductModelsReadProductItem**](EnvelopeProductModelsReadProductItem.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

