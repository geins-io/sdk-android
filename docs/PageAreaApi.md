# PageAreaApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateAPageArea**](PageAreaApi.md#createOrUpdateAPageArea) | **POST** /API/PageArea | Create or update a page area
[**createOrUpdatePageAreaFamily**](PageAreaApi.md#createOrUpdatePageAreaFamily) | **POST** /API/PageAreaFamily | Create or update a page area family
[**getPageArea**](PageAreaApi.md#getPageArea) | **GET** /API/PageArea/{name} | Get a specific page area
[**getPageAreaFamily**](PageAreaApi.md#getPageAreaFamily) | **GET** /API/PageAreaFamily/{familyId} | Get a specific page area family
[**listPageAreaFamilies**](PageAreaApi.md#listPageAreaFamilies) | **GET** /API/PageAreaFamily/List | Gets a list of all page area families, including nested data



## createOrUpdateAPageArea

> EnvelopePageAreaModelsReadPageArea createOrUpdateAPageArea(area)

Create or update a page area

### Example

```java
// Import classes:
//import org.openapitools.client.api.PageAreaApi;

PageAreaApi apiInstance = new PageAreaApi();
PageAreaModelsWritePageArea area = new PageAreaModelsWritePageArea(); // PageAreaModelsWritePageArea | The area model to create or update.
try {
    EnvelopePageAreaModelsReadPageArea result = apiInstance.createOrUpdateAPageArea(area);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageAreaApi#createOrUpdateAPageArea");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **area** | [**PageAreaModelsWritePageArea**](PageAreaModelsWritePageArea.md)| The area model to create or update. |

### Return type

[**EnvelopePageAreaModelsReadPageArea**](EnvelopePageAreaModelsReadPageArea.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createOrUpdatePageAreaFamily

> EnvelopePageAreaModelsReadPageAreaFamily createOrUpdatePageAreaFamily(family)

Create or update a page area family

### Example

```java
// Import classes:
//import org.openapitools.client.api.PageAreaApi;

PageAreaApi apiInstance = new PageAreaApi();
PageAreaModelsWritePageAreaFamily family = new PageAreaModelsWritePageAreaFamily(); // PageAreaModelsWritePageAreaFamily | The family model to create or update.
try {
    EnvelopePageAreaModelsReadPageAreaFamily result = apiInstance.createOrUpdatePageAreaFamily(family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageAreaApi#createOrUpdatePageAreaFamily");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **family** | [**PageAreaModelsWritePageAreaFamily**](PageAreaModelsWritePageAreaFamily.md)| The family model to create or update. |

### Return type

[**EnvelopePageAreaModelsReadPageAreaFamily**](EnvelopePageAreaModelsReadPageAreaFamily.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## getPageArea

> PageAreaModelsReadPageArea getPageArea(name)

Get a specific page area

### Example

```java
// Import classes:
//import org.openapitools.client.api.PageAreaApi;

PageAreaApi apiInstance = new PageAreaApi();
String name = null; // String | The name of the page area to get.
try {
    PageAreaModelsReadPageArea result = apiInstance.getPageArea(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageAreaApi#getPageArea");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the page area to get. | [default to null]

### Return type

[**PageAreaModelsReadPageArea**](PageAreaModelsReadPageArea.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getPageAreaFamily

> PageAreaModelsReadPageAreaFamily getPageAreaFamily(familyId)

Get a specific page area family

### Example

```java
// Import classes:
//import org.openapitools.client.api.PageAreaApi;

PageAreaApi apiInstance = new PageAreaApi();
Integer familyId = null; // Integer | The id of the page area family to get.
try {
    PageAreaModelsReadPageAreaFamily result = apiInstance.getPageAreaFamily(familyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageAreaApi#getPageAreaFamily");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **familyId** | **Integer**| The id of the page area family to get. | [default to null]

### Return type

[**PageAreaModelsReadPageAreaFamily**](PageAreaModelsReadPageAreaFamily.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## listPageAreaFamilies

> List&lt;PageAreaModelsReadPageAreaFamily&gt; listPageAreaFamilies()

Gets a list of all page area families, including nested data

### Example

```java
// Import classes:
//import org.openapitools.client.api.PageAreaApi;

PageAreaApi apiInstance = new PageAreaApi();
try {
    List<PageAreaModelsReadPageAreaFamily> result = apiInstance.listPageAreaFamilies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageAreaApi#listPageAreaFamilies");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;PageAreaModelsReadPageAreaFamily&gt;**](PageAreaModelsReadPageAreaFamily.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml

