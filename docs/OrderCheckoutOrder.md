

# OrderCheckoutOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** |  |  [optional]
**externalOrderId** | **String** |  |  [optional]
**cartId** | **String** |  |  [optional]
**sessionId** | **String** |  |  [optional]
**siteId** | **Integer** |  |  [optional]
**currency** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**message** | **String** |  |  [optional]
**internalMessage** | **String** |  |  [optional]
**locale** | **String** |  |  [optional]
**rows** | [**List&lt;OrderCheckoutOrderRow&gt;**](OrderCheckoutOrderRow.md) |  |  [optional]
**campaignId** | **Integer** |  |  [optional]
**campaignCode** | **String** |  |  [optional]
**campaignName** | **String** |  |  [optional]
**campaignIds** | **List&lt;String&gt;** |  |  [optional]
**campaignNames** | **List&lt;String&gt;** |  |  [optional]
**customerId** | **Integer** |  |  [optional]
**customerTypeId** | **Integer** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**dateOfBirth** | [**Date**](Date.md) |  |  [optional]
**personalId** | **String** |  |  [optional]
**userAgent** | **String** |  |  [optional]
**metaData** | **Map&lt;String, String&gt;** |  |  [optional]
**paymentId** | **Integer** |  |  [optional]
**transactionId** | **String** |  |  [optional]
**secondaryTransactionId** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**organizationNumber** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**address1** | **String** |  |  [optional]
**address2** | **String** |  |  [optional]
**zip** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**region** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**mobilePhone** | **String** |  |  [optional]
**careOf** | **String** |  |  [optional]
**shippingId** | **Integer** |  |  [optional]
**shippingCountry** | **String** |  |  [optional]
**shippingCompany** | **String** |  |  [optional]
**shippingOrganizationNumber** | **String** |  |  [optional]
**shippingFirstName** | **String** |  |  [optional]
**shippingLastName** | **String** |  |  [optional]
**shippingEmail** | **String** |  |  [optional]
**shippingAddress1** | **String** |  |  [optional]
**shippingAddress2** | **String** |  |  [optional]
**shippingZip** | **String** |  |  [optional]
**shippingCity** | **String** |  |  [optional]
**shippingRegion** | **String** |  |  [optional]
**shippingPhone** | **String** |  |  [optional]
**shippingMobilePhone** | **String** |  |  [optional]
**shippingCareOf** | **String** |  |  [optional]
**pickupPoint** | **String** |  |  [optional]
**desiredDeliveryDate** | [**Date**](Date.md) |  |  [optional]
**freightClass** | [**OrderFreightClass**](OrderFreightClass.md) |  |  [optional]
**sum** | **Double** |  |  [optional] [readonly]
**expectedSum** | **Double** |  |  [optional]
**orderValueIncVat** | **Double** |  |  [optional] [readonly]
**orderValueExVat** | **Double** |  |  [optional] [readonly]
**itemValueIncVat** | **Double** |  |  [optional] [readonly]
**itemValueExVat** | **Double** |  |  [optional] [readonly]
**discountIncVat** | **Double** |  |  [optional]
**discountExVat** | **Double** |  |  [optional]
**percentDiscount** | **Integer** |  |  [optional]
**balance** | **Double** |  |  [optional]
**shippingFeeIncVat** | **Double** |  |  [optional]
**shippingFeeExVat** | **Double** |  |  [optional]
**paymentFeeIncVat** | **Double** |  |  [optional]
**paymentFeeExVat** | **Double** |  |  [optional]


## Enum: GenderEnum

Name | Value
---- | -----




