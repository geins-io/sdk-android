

# ShippingModelsShippingQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**siteId** | **Integer** | The site ID the delivery options belong to. Required. |  [optional]
**countryId** | **Integer** | The country ID where the order should be shipped to. |  [optional]
**shippingId** | **Integer** | Carismar Shipping Option ID |  [optional]
**deliveryOptionId** | [**UUID**](UUID.md) | Unifaun Delivery Option ID |  [optional]
**order** | [**OrderCheckoutOrder**](OrderCheckoutOrder.md) |  |  [optional]
**minimumFreeShippingLimit** | **Double** | The cart sum limit for free shipping - to be used for conditions in the delivery checkout portal |  [optional]




