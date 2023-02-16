

# ProductModelsProductQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedAfter** | [**Date**](Date.md) | Limits query to products updated after the specified date. |  [optional]
**productIds** | **List&lt;Integer&gt;** | Limits query to only include the supplied product ids. |  [optional]
**articleNumbers** | **List&lt;String&gt;** | Limits query to only include products with supplied article numbers. |  [optional]
**onlySellable** | **Boolean** | Limits query to only include products that are available for purchase |  [optional]
**feedId** | **Integer** | Limits query to only include products contained in the specified feed. |  [optional]
**batchId** | [**UUID**](UUID.md) | Used to fetch products where the result set is split into batches |  [optional]




