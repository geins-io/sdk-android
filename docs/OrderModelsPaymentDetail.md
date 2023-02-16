

# OrderModelsPaymentDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for this payment detail. Exception: For some payment options this field can be 0. These orders only have one payment detail. |  [optional]
**paymentId** | **Integer** | Payment method id |  [optional]
**name** | **String** | The name of the payment method |  [optional]
**displayName** | **String** | The display name of the payment method |  [optional]
**transactionId** | **String** | The transaction id (external reference). |  [optional]
**secondaryTransactionId** | **String** | The secondary transaction id, if any (external reference). |  [optional]
**reservationNumber** | **String** | The reservation number. This field is not available for all payment methods. |  [optional]
**reservationDate** | [**Date**](Date.md) | Reservation date |  [optional]
**paymentDate** | [**Date**](Date.md) | Payment date |  [optional]
**total** | **Double** | Total |  [optional]
**payed** | **Boolean** | Shows if the order is paid using this payment method |  [optional]
**paymentFee** | **Double** | The payment fee |  [optional]
**shippingFee** | **Double** | The shipping fee |  [optional]
**paymentOption** | **String** | The name of the payment option, if any.  This doesn&#39;t have to be the same as the payment name. Eg \&quot;Direct bank payment\&quot;, \&quot;Card\&quot;, \&quot;Invoice\&quot; etc. |  [optional]




