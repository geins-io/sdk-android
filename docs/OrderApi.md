# OrderApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCommentToOrder**](OrderApi.md#addCommentToOrder) | **POST** /API/Order/{id}/Comment | Adds a comment to the order
[**createOrder**](OrderApi.md#createOrder) | **POST** /API/Order | Post a new order
[**createOrderId**](OrderApi.md#createOrderId) | **POST** /API/Order/Id | Create a new order id
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /API/Order/{id} | Deletes or deactivates an order
[**getCaptureById**](OrderApi.md#getCaptureById) | **GET** /API/Order/Capture/{captureId} | Get Capture by Id
[**getOrderById**](OrderApi.md#getOrderById) | **GET** /API/Order/{id}/{include} | Get an instance of a order
[**getOrderStatuses**](OrderApi.md#getOrderStatuses) | **GET** /API/Order/Statuses | Get a list of available order statuses
[**getRefundById**](OrderApi.md#getRefundById) | **GET** /API/Order/Refund/{refundId} | Get Refund by Id
[**partialUpdateOfOrder**](OrderApi.md#partialUpdateOfOrder) | **PATCH** /API/Order/{id} | Partial update of an order
[**queryOrders**](OrderApi.md#queryOrders) | **POST** /API/Order/Query | Query the order repository
[**setCaptureAsProcessed**](OrderApi.md#setCaptureAsProcessed) | **POST** /API/Order/Capture/SetAsProcessed | Set a capture as processed (&#x3D; captured)
[**setPaymentAsPayed**](OrderApi.md#setPaymentAsPayed) | **POST** /API/Order/PaymentDetail/{paymentDetailId}/SetAsPayed | Set Payment Detail as payed
[**setRefundAsProcessed**](OrderApi.md#setRefundAsProcessed) | **POST** /API/Order/Refund/SetAsProcessed | Set a refund as processed (&#x3D; settled)
[**updateOrderStatus**](OrderApi.md#updateOrderStatus) | **POST** /API/Order/{id}/Status/{status}/{transactionId}/{secondaryTransactionId} | Update order status
[**updateTransactionData**](OrderApi.md#updateTransactionData) | **POST** /API/Order/{id}/TransactionData | Updates transaction data on an order
[**validateOrder**](OrderApi.md#validateOrder) | **POST** /API/Order/ValidateCreation | Validates order data for order creation.



## addCommentToOrder

> Object addCommentToOrder(id, orderComment)

Adds a comment to the order

This add to (not replace) any previous comments.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer id = null; // Integer | Order ID.
APIOrderOrderComment orderComment = new APIOrderOrderComment(); // APIOrderOrderComment | The comment
try {
    Object result = apiInstance.addCommentToOrder(id, orderComment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addCommentToOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order ID. | [default to null]
 **orderComment** | [**APIOrderOrderComment**](APIOrderOrderComment.md)| The comment |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createOrder

> EnvelopeInt createOrder(order)

Post a new order

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderModelsOrder order = new OrderModelsOrder(); // OrderModelsOrder | The order object.
try {
    EnvelopeInt result = apiInstance.createOrder(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**OrderModelsOrder**](OrderModelsOrder.md)| The order object. |

### Return type

[**EnvelopeInt**](EnvelopeInt.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## createOrderId

> EnvelopeInt createOrderId()

Create a new order id

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
try {
    EnvelopeInt result = apiInstance.createOrderId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrderId");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EnvelopeInt**](EnvelopeInt.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## deleteOrder

> Object deleteOrder(id, operation)

Deletes or deactivates an order

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer id = null; // Integer | The ID of the order to delete.
Integer operation = null; // Integer | The method of deletion desired.
try {
    Object result = apiInstance.deleteOrder(id, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the order to delete. | [default to null]
 **operation** | **Integer**| The method of deletion desired. | [default to null] [enum: 0, 1, 2]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getCaptureById

> OrderCapture getCaptureById(captureId)

Get Capture by Id

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
UUID captureId = null; // UUID | Capture ID.
try {
    OrderCapture result = apiInstance.getCaptureById(captureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getCaptureById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **captureId** | **UUID**| Capture ID. | [default to null]

### Return type

[**OrderCapture**](OrderCapture.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getOrderById

> OrderModelsOrder getOrderById(id, include, combineProductContainerRows)

Get an instance of a order

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer id = null; // Integer | The ID of the order to get.
String include = null; // String | A comma separated string of what related collections to include with this result set. The  possible values are: rows, paymentdetails, shippingdetails and refunds.
Boolean combineProductContainerRows = null; // Boolean | If true, will combine all order rows that are part of a container into a single container row.
try {
    OrderModelsOrder result = apiInstance.getOrderById(id, include, combineProductContainerRows);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the order to get. | [default to null]
 **include** | **String**| A comma separated string of what related collections to include with this result set. The  possible values are: rows, paymentdetails, shippingdetails and refunds. | [default to null]
 **combineProductContainerRows** | **Boolean**| If true, will combine all order rows that are part of a container into a single container row. | [optional] [default to null]

### Return type

[**OrderModelsOrder**](OrderModelsOrder.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getOrderStatuses

> List&lt;OrderModelsOrderStatus&gt; getOrderStatuses()

Get a list of available order statuses

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
try {
    List<OrderModelsOrderStatus> result = apiInstance.getOrderStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderStatuses");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;OrderModelsOrderStatus&gt;**](OrderModelsOrderStatus.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getRefundById

> OrderRefund getRefundById(refundId)

Get Refund by Id

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
UUID refundId = null; // UUID | Refund ID.
try {
    OrderRefund result = apiInstance.getRefundById(refundId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getRefundById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refundId** | **UUID**| Refund ID. | [default to null]

### Return type

[**OrderRefund**](OrderRefund.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## partialUpdateOfOrder

> Object partialUpdateOfOrder(id, order)

Partial update of an order

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer id = null; // Integer | The orderId of the order to update
OrderModelsOrderUpdate order = new OrderModelsOrderUpdate(); // OrderModelsOrderUpdate | The order object containing the properties that should be updated.
try {
    Object result = apiInstance.partialUpdateOfOrder(id, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#partialUpdateOfOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The orderId of the order to update | [default to null]
 **order** | [**OrderModelsOrderUpdate**](OrderModelsOrderUpdate.md)| The order object containing the properties that should be updated. |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## queryOrders

> List&lt;OrderModelsOrder&gt; queryOrders(query)

Query the order repository

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderModelsOrderQuery query = new OrderModelsOrderQuery(); // OrderModelsOrderQuery | The details of the query.
try {
    List<OrderModelsOrder> result = apiInstance.queryOrders(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#queryOrders");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**OrderModelsOrderQuery**](OrderModelsOrderQuery.md)| The details of the query. |

### Return type

[**List&lt;OrderModelsOrder&gt;**](OrderModelsOrder.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## setCaptureAsProcessed

> Object setCaptureAsProcessed(processedCapture)

Set a capture as processed (&#x3D; captured)

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderProcessedCapture processedCapture = new OrderProcessedCapture(); // OrderProcessedCapture | Contains CaptureId and optional metadata about capture.
try {
    Object result = apiInstance.setCaptureAsProcessed(processedCapture);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#setCaptureAsProcessed");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processedCapture** | [**OrderProcessedCapture**](OrderProcessedCapture.md)| Contains CaptureId and optional metadata about capture. |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## setPaymentAsPayed

> Object setPaymentAsPayed(paymentDetailId)

Set Payment Detail as payed

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer paymentDetailId = null; // Integer | Payment Detail ID.
try {
    Object result = apiInstance.setPaymentAsPayed(paymentDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#setPaymentAsPayed");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDetailId** | **Integer**| Payment Detail ID. | [default to null]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## setRefundAsProcessed

> Object setRefundAsProcessed(processedRefund)

Set a refund as processed (&#x3D; settled)

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderProcessedRefund processedRefund = new OrderProcessedRefund(); // OrderProcessedRefund | Contains RefundId and optional metadata about refund.
try {
    Object result = apiInstance.setRefundAsProcessed(processedRefund);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#setRefundAsProcessed");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processedRefund** | [**OrderProcessedRefund**](OrderProcessedRefund.md)| Contains RefundId and optional metadata about refund. |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateOrderStatus

> Object updateOrderStatus(id, status, transactionId, secondaryTransactionId)

Update order status

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer id = null; // Integer | Order ID.
Integer status = null; // Integer | Order status. These statuses can be set: cancelled, on-hold, inactive, out-of-stock,  backorder, completed, pending.
String transactionId = null; // String | A transaction id can be set here if status is set to pending.
String secondaryTransactionId = null; // String | A secondary transaction id, if any, can be set here if status is set to pending.
try {
    Object result = apiInstance.updateOrderStatus(id, status, transactionId, secondaryTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrderStatus");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order ID. | [default to null]
 **status** | **Integer**| Order status. These statuses can be set: cancelled, on-hold, inactive, out-of-stock,  backorder, completed, pending. | [default to null] [enum: 0, 1, 2, 3, 4, 5, 6, 7]
 **transactionId** | **String**| A transaction id can be set here if status is set to pending. | [default to null]
 **secondaryTransactionId** | **String**| A secondary transaction id, if any, can be set here if status is set to pending. | [default to null]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## updateTransactionData

> Object updateTransactionData(id, transactionData)

Updates transaction data on an order

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer id = null; // Integer | Order ID.
APIOrderTransactionData transactionData = new APIOrderTransactionData(); // APIOrderTransactionData | The transaction data
try {
    Object result = apiInstance.updateTransactionData(id, transactionData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateTransactionData");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order ID. | [default to null]
 **transactionData** | [**APIOrderTransactionData**](APIOrderTransactionData.md)| The transaction data |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## validateOrder

> Object validateOrder(request)

Validates order data for order creation.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderValidateOrderCreationRequest request = new OrderValidateOrderCreationRequest(); // OrderValidateOrderCreationRequest | The order data to validate.
try {
    Object result = apiInstance.validateOrder(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#validateOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**OrderValidateOrderCreationRequest**](OrderValidateOrderCreationRequest.md)| The order data to validate. |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

