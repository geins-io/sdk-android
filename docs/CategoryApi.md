# CategoryApi

All URIs are relative to *https://mgmtapi.geins.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategory**](CategoryApi.md#createCategory) | **POST** /API/Category | Create a new category
[**getCategoryById**](CategoryApi.md#getCategoryById) | **GET** /API/Category/{id} | Get a specific category
[**queryCategories**](CategoryApi.md#queryCategories) | **POST** /API/Category/Query | Query categories
[**updateCategory**](CategoryApi.md#updateCategory) | **PUT** /API/Category/{id} | Update a category



## createCategory

> EnvelopeCategoryModelsReadCategory createCategory(category)

Create a new category

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
CategoryModelsWriteCategory category = new CategoryModelsWriteCategory(); // CategoryModelsWriteCategory | The category to create.
try {
    EnvelopeCategoryModelsReadCategory result = apiInstance.createCategory(category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#createCategory");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | [**CategoryModelsWriteCategory**](CategoryModelsWriteCategory.md)| The category to create. |

### Return type

[**EnvelopeCategoryModelsReadCategory**](EnvelopeCategoryModelsReadCategory.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## getCategoryById

> EnvelopeCategoryModelsReadCategory getCategoryById(id)

Get a specific category

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
Integer id = null; // Integer | The id of the category to get.
try {
    EnvelopeCategoryModelsReadCategory result = apiInstance.getCategoryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#getCategoryById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the category to get. | [default to null]

### Return type

[**EnvelopeCategoryModelsReadCategory**](EnvelopeCategoryModelsReadCategory.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## queryCategories

> List&lt;CategoryModelsReadCategory&gt; queryCategories(query)

Query categories

No response envelope.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
CategoryModelsCategoryQuery query = new CategoryModelsCategoryQuery(); // CategoryModelsCategoryQuery | The query to filter categories by.
try {
    List<CategoryModelsReadCategory> result = apiInstance.queryCategories(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#queryCategories");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**CategoryModelsCategoryQuery**](CategoryModelsCategoryQuery.md)| The query to filter categories by. |

### Return type

[**List&lt;CategoryModelsReadCategory&gt;**](CategoryModelsReadCategory.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateCategory

> EnvelopeCategoryModelsReadCategory updateCategory(id, category)

Update a category

Leaving out a property will ensure no changes are made to that property. Collection properties will delete and/or add as necessary to match the supplied data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
Integer id = null; // Integer | The id of the category to update.
CategoryModelsWriteCategory category = new CategoryModelsWriteCategory(); // CategoryModelsWriteCategory | The category data to update.
try {
    EnvelopeCategoryModelsReadCategory result = apiInstance.updateCategory(id, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#updateCategory");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the category to update. | [default to null]
 **category** | [**CategoryModelsWriteCategory**](CategoryModelsWriteCategory.md)| The category data to update. |

### Return type

[**EnvelopeCategoryModelsReadCategory**](EnvelopeCategoryModelsReadCategory.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

