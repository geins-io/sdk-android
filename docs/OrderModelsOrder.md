

# OrderModelsOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique identifier for this order. |  [optional]
**externalId** | **String** | The unique external identifier for this order. |  [optional]
**personalId** | **String** | The social security number, or organisational number of the customer. |  [optional]
**customerId** | **Integer** | The unique identifier of the customer placing this order. |  [optional]
**customerTypeId** | **Integer** | Customer type. Usually 1 for private customers and 2 for companies. This field is customer specific |  [optional]
**createdAt** | [**Date**](Date.md) | Datetime when the order was created. |  [optional]
**updatedAt** | [**Date**](Date.md) | Datetime when the order was last updated. |  [optional]
**completedAt** | [**Date**](Date.md) | The DateTime when the order was completed (delivered, payed). |  [optional]
**status** | **String** | The order status. Possbile values: cancelled, on-hold, inactive, refunded, partial,  pending-payment, out-of-stock, backorder, completed, pending. |  [optional]
**currency** | **String** | ISO Currency code. |  [optional]
**currencyRate** | **Double** | The Currency Rate to SEK. |  [optional]
**marketId** | **Integer** | The unique identifier for the market this order originates from. |  [optional]
**marketName** | **String** | The market name. Usually this is the equal to the site name. |  [optional]
**language** | **String** | Two-letter Language code. |  [optional]
**orderTotal** | **Double** | Order total. |  [optional]
**expectedSum** | **Double** | Expected total sum to be paid after discount and balance.   &lt;para&gt;The value is usually taken directly from the payment provider and represents the actual reserved amount.&lt;/para&gt;&lt;para&gt;If this differs from OrderTotal, actions should be taken to ensure they match. This usually happens due to rounding.&lt;/para&gt; |  [optional]
**vATTotal** | **Double** | Order VAT total. |  [optional]
**orderValueIncVat** | **Double** | Order value inc vat after discount but before balance |  [optional]
**orderValueExVat** | **Double** | Order value ex vat after discount but before balance |  [optional]
**itemValueIncVat** | **Double** | Item value inc vat excluding fees and discount |  [optional]
**itemValueExVat** | **Double** | Item value ex vat excluding fees and discount |  [optional]
**discount** | **Double** | Total discount inc vat. |  [optional]
**discountExVat** | **Double** | Total discount ex vat. |  [optional]
**fromBalance** | **Double** | The amount which was withdrawn from the customers balance inc vat. |  [optional]
**shippingFee** | **Double** | Shipping fee inc vat. |  [optional]
**shippingFeeExVat** | **Double** | Shipping fee ex vat. |  [optional]
**paymentFee** | **Double** | Payment fee inc vat. |  [optional]
**paymentFeeExVat** | **Double** | Payment fee ex vat. |  [optional]
**message** | **String** | Order message. Can contain instructions from customer or added details about the order. |  [optional]
**orderMessages** | **List&lt;String&gt;** | Internal order messages. Can contain internal details about the order. |  [optional]
**paymentDetails** | [**List&lt;OrderModelsPaymentDetail&gt;**](OrderModelsPaymentDetail.md) | List of payment details &lt;seealso cref&#x3D;\&quot;T:Order.Models.PaymentDetail\&quot; /&gt;. |  [optional]
**shippingDetails** | [**List&lt;OrderModelsShippingDetail&gt;**](OrderModelsShippingDetail.md) | List of shipping details &lt;seealso cref&#x3D;\&quot;T:Order.Models.ShippingDetail\&quot; /&gt;. |  [optional]
**shippingAddress** | [**OrderModelsAddress**](OrderModelsAddress.md) |  |  [optional]
**billingAddress** | [**OrderModelsAddress**](OrderModelsAddress.md) |  |  [optional]
**rows** | [**List&lt;OrderModelsOrderRow&gt;**](OrderModelsOrderRow.md) | List of order rows |  [optional]
**refunds** | [**List&lt;OrderModelsRefund&gt;**](OrderModelsRefund.md) | List of order refunds &lt;seealso cref&#x3D;\&quot;T:Order.Models.Refund\&quot; /&gt;. |  [optional]
**ip** | **String** | Customer IP-number. |  [optional]
**userAgent** | **String** | Customer User Agent. |  [optional]
**serviceLocation** | **String** | Chosen service location. |  [optional]
**campaignCode** | **String** | Campaign code applied to the order. |  [optional]
**campaignCodeId** | **Integer** | The internal id of the applied campaign code. |  [optional]
**percent** | **Integer** | General percent discount applied to the order. |  [optional]
**desiredDeliveryDate** | [**Date**](Date.md) | The desired delivery date of the order. |  [optional]
**gender** | **Boolean** | The gender of the customer. True &#x3D; male, False &#x3D; female, null &#x3D; unknown. |  [optional]
**cartId** | **Integer** | The unique identifier for the cart from which this order originates. |  [optional]
**sessionId** | **String** | The session id for the from which this order originates. |  [optional]
**externalOrderStatus** | [**ExternalOrderStatusEnum**](#ExternalOrderStatusEnum) |  |  [optional]
**campaignIds** | **List&lt;String&gt;** | The ids for the campaigns applied to this order (not rows) |  [optional]
**campaignNames** | **List&lt;String&gt;** | The names for the campaigns applied to this order (not rows) |  [optional]
**metaData** | **Map&lt;String, String&gt;** | The order meta data to store additional information about the order. Eg. customer specific shipping data to include for nShift checkout (former UDC) shipments |  [optional]
**publicId** | [**UUID**](UUID.md) | The public id of this order. |  [optional]


## Enum: ExternalOrderStatusEnum

Name | Value
---- | -----




