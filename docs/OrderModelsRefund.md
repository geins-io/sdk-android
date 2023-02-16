

# OrderModelsRefund

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for this refund |  [optional]
**orderRowId** | **Integer** | Reference to the order row that has been refunded |  [optional]
**paymentDetailId** | **Integer** | Reference to the payment detail that has been refunded |  [optional]
**returnId** | **Integer** | Id number of the return. Can be used to group refunds. |  [optional]
**articleNumber** | **String** | Article number. If the refund is not bound to an order row this field contains an optional refund article number. |  [optional]
**createdAt** | [**Date**](Date.md) | Datetime when the refund was created |  [optional]
**total** | **Double** | Total amount refunded |  [optional]
**reasonCode** | **Integer** | Reason code for the refund |  [optional]
**reason** | **String** | Reason for refund |  [optional]
**toBalance** | **Boolean** | Shows if the refund was deposited to the customers balance |  [optional]
**vat** | **Double** | Vat percent in decimals for the refunded amount |  [optional]
**itemId** | **Integer** | Item ID (SKU). |  [optional]
**refundType** | **String** | Refund Type |  [optional]




