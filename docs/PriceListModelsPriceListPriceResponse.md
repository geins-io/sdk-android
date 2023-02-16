

# PriceListModelsPriceListPriceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Information about the outcome of the request. |  [optional]
**invalid** | [**List&lt;PriceListModelsWritePriceListPrice&gt;**](PriceListModelsWritePriceListPrice.md) | Supplied PriceList prices that failed validation. |  [optional]
**notFound** | [**List&lt;PriceListModelsWritePriceListPrice&gt;**](PriceListModelsWritePriceListPrice.md) | Supplied PriceList prices that were technically valid, but couldn&#39;t be found. |  [optional]
**updateCount** | **Integer** | Number of price updates resulting from the request. |  [optional]




