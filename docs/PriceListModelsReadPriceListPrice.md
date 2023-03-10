

# PriceListModelsReadPriceListPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **Integer** | The id of the product that this price applies to. |  [optional]
**priceListId** | **Integer** | The id of the price list that this price is associated with. |  [optional]
**priceListName** | **String** | The name of the price list that this price is associated with. |  [optional]
**priceIncVat** | **Double** | The price, inc VAT, in the currency of the associated price list. |  [optional]
**priceExVat** | **Double** | The price, ex VAT, in the currency of the associated price list. |  [optional]
**vatRate** | **Double** | The Vat Rate |  [optional]
**country** | **String** | The 2-letter ISO country code for this price. |  [optional]
**currency** | **String** | The 3-letter ISO 4217 currency code for this price. |  [optional]
**staggeredCount** | **Integer** | Staggered count for this price. Defaults to 1. |  [optional]
**validFrom** | [**Date**](Date.md) | The date the price is valid from. |  [optional]
**validTo** | [**Date**](Date.md) | The date the price is valid to. |  [optional]




