

# ProductModelsStockEnvelope

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Information about the outcome of the request. |  [optional]
**invalid** | [**List&lt;ProductModelsWriteProductItemStock&gt;**](ProductModelsWriteProductItemStock.md) | Supplied productItemStocks that failed validation. |  [optional]
**notFound** | [**List&lt;ProductModelsWriteProductItemStock&gt;**](ProductModelsWriteProductItemStock.md) | Supplied productItemStocks that were technically valid, but couldn&#39;t be found. |  [optional]
**updateCount** | **Integer** | Number of stock updates resulting from the request. |  [optional]




