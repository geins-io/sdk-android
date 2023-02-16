

# OrderModelsOrderQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updated** | [**Date**](Date.md) | Given a date, only orders updated after the provided date will be returned. |  [optional]
**statusList** | **String** | Comma separated list of statuses to filter on. |  [optional]
**marketId** | **Integer** | Id of a market. |  [optional]
**paymentName** | **String** | Name of a payment method |  [optional]
**parcelGroupId** | **Integer** | Id of a parcel group. |  [optional]
**customerId** | **Integer** | The ID of a customer |  [optional]
**email** | **String** | The email of a customer |  [optional]
**include** | **String** | Comma separated list of child-collections to also include in the query result. |  [optional]
**externalOrderStatus** | **Integer** | This status can be used by external systems to change the status of an order. Such as failed or done. |  [optional]
**combineProductContainerRows** | **Boolean** | If true, will combine all order rows that are part of a container into a single container row. |  [optional]
**packingLocationId** | **Integer** | The packing place to get orders from. |  [optional]




