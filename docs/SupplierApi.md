# SupplierApi

All URIs are relative to *https://mgmtapi.geins.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSupplier**](SupplierApi.md#createSupplier) | **POST** /API/Supplier | Create a new supplier
[**getSupplierById**](SupplierApi.md#getSupplierById) | **GET** /API/Supplier/{id} | Get a specific supplier
[**querySuppliers**](SupplierApi.md#querySuppliers) | **POST** /API/Supplier/Query | Query suppliers
[**updateSupplier**](SupplierApi.md#updateSupplier) | **PUT** /API/Supplier/{id} | Updates a supplier



## createSupplier

> EnvelopeSupplierModelsReadSupplier createSupplier(supplier)

Create a new supplier

### Example

```java
// Import classes:
//import org.openapitools.client.api.SupplierApi;

SupplierApi apiInstance = new SupplierApi();
SupplierModelsWriteSupplier supplier = new SupplierModelsWriteSupplier(); // SupplierModelsWriteSupplier | The supplier to create.
try {
    EnvelopeSupplierModelsReadSupplier result = apiInstance.createSupplier(supplier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierApi#createSupplier");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplier** | [**SupplierModelsWriteSupplier**](SupplierModelsWriteSupplier.md)| The supplier to create. |

### Return type

[**EnvelopeSupplierModelsReadSupplier**](EnvelopeSupplierModelsReadSupplier.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## getSupplierById

> EnvelopeSupplierModelsReadSupplier getSupplierById(id)

Get a specific supplier

### Example

```java
// Import classes:
//import org.openapitools.client.api.SupplierApi;

SupplierApi apiInstance = new SupplierApi();
Integer id = null; // Integer | The id of the supplier to get.
try {
    EnvelopeSupplierModelsReadSupplier result = apiInstance.getSupplierById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierApi#getSupplierById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the supplier to get. | [default to null]

### Return type

[**EnvelopeSupplierModelsReadSupplier**](EnvelopeSupplierModelsReadSupplier.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## querySuppliers

> List&lt;SupplierModelsReadSupplier&gt; querySuppliers(query)

Query suppliers

### Example

```java
// Import classes:
//import org.openapitools.client.api.SupplierApi;

SupplierApi apiInstance = new SupplierApi();
SupplierModelsSupplierQuery query = new SupplierModelsSupplierQuery(); // SupplierModelsSupplierQuery | The details of the query
try {
    List<SupplierModelsReadSupplier> result = apiInstance.querySuppliers(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierApi#querySuppliers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**SupplierModelsSupplierQuery**](SupplierModelsSupplierQuery.md)| The details of the query |

### Return type

[**List&lt;SupplierModelsReadSupplier&gt;**](SupplierModelsReadSupplier.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateSupplier

> EnvelopeSupplierModelsReadSupplier updateSupplier(id, supplier)

Updates a supplier

Leaving out a property will ensure no changes are made to that property.  Collection properties will delete and/or add as necessary to match the supplied data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SupplierApi;

SupplierApi apiInstance = new SupplierApi();
Integer id = null; // Integer | The id of the supplier to update.
SupplierModelsWriteSupplier supplier = new SupplierModelsWriteSupplier(); // SupplierModelsWriteSupplier | The supplier data to update.
try {
    EnvelopeSupplierModelsReadSupplier result = apiInstance.updateSupplier(id, supplier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierApi#updateSupplier");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the supplier to update. | [default to null]
 **supplier** | [**SupplierModelsWriteSupplier**](SupplierModelsWriteSupplier.md)| The supplier data to update. |

### Return type

[**EnvelopeSupplierModelsReadSupplier**](EnvelopeSupplierModelsReadSupplier.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

