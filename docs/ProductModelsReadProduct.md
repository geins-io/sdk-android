

# ProductModelsReadProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **Integer** | The unique identifier for the product. |  [optional]
**articleNumber** | **String** | The article number of the product. |  [optional]
**names** | [**List&lt;SharedModelsLocalizableContent&gt;**](SharedModelsLocalizableContent.md) | The localized names of the product. |  [optional]
**dateCreated** | [**Date**](Date.md) | The date the product was created. |  [optional]
**dateUpdated** | [**Date**](Date.md) | The date the product was last updated. |  [optional]
**active** | **Boolean** | The current state of the product. |  [optional]
**purchasePrice** | **Double** | The purchase price in the currency defined in {Product.Models.Read.Product.PurchasePriceCurrency}. |  [optional]
**purchasePriceCurrency** | **String** | The 3-letter ISO 4217 currency code for the amount given in {Product.Models.Read.Product.PurchasePrice}. |  [optional]
**shortTexts** | [**List&lt;SharedModelsLocalizableContent&gt;**](SharedModelsLocalizableContent.md) | Localized short texts for the product. |  [optional]
**longTexts** | [**List&lt;SharedModelsLocalizableContent&gt;**](SharedModelsLocalizableContent.md) | Localized long texts for the product. |  [optional]
**techTexts** | [**List&lt;SharedModelsLocalizableContent&gt;**](SharedModelsLocalizableContent.md) | Localized tech texts for the product. |  [optional]
**items** | [**List&lt;ProductModelsReadProductItem&gt;**](ProductModelsReadProductItem.md) | The items belonging to the product. |  [optional]
**prices** | [**List&lt;PriceListModelsReadPriceListPrice&gt;**](PriceListModelsReadPriceListPrice.md) | The current prices of the product. |  [optional]
**categories** | [**List&lt;CategoryModelsReadCategory&gt;**](CategoryModelsReadCategory.md) | The categories the product belongs to. |  [optional]
**images** | [**List&lt;ProductModelsReadImage&gt;**](ProductModelsReadImage.md) | The images for the product |  [optional]
**brandId** | **Integer** | The brand id of the product. |  [optional]
**brandName** | **String** | The brand name of the product. |  [optional]
**supplierId** | **Integer** | The supplier id of the product. |  [optional]
**supplierName** | **String** | The supplier name of the product. |  [optional]
**parameterValues** | [**List&lt;ProductParameterModelsReadProductParameterValue&gt;**](ProductParameterModelsReadProductParameterValue.md) | The parameter values associated with the product. |  [optional]
**variants** | [**List&lt;VariantModelsReadVariant&gt;**](VariantModelsReadVariant.md) | The variants for this product. |  [optional]
**markets** | [**List&lt;MarketModelsMarket&gt;**](MarketModelsMarket.md) | The markets for this product |  [optional]
**vat** | **Double** | The vat percent for this product. Eg) 0.25 meaning 25% VAT. |  [optional]
**primaryImage** | **String** | The filename of this products primary image. |  [optional]
**freightClassId** | **Integer** | ID of freight class |  [optional]
**intrastatCode** | **String** | Intrastat code of the product |  [optional]
**countryOfOrigin** | **String** | Country of orgin of product |  [optional]
**variantGroupId** | **Integer** | ID of Variant Group to which the product is associated |  [optional]
**vatId** | **Integer** | ID of Vat |  [optional]
**externalId** | **String** | External Id of the product. |  [optional]
**activationDate** | [**Date**](Date.md) | Activation date for the product. |  [optional]
**feeds** | [**List&lt;ProductModelsReadFeedMembership&gt;**](ProductModelsReadFeedMembership.md) | The feeds the product is a member of |  [optional]
**urls** | [**List&lt;ProductModelsReadProductUrl&gt;**](ProductModelsReadProductUrl.md) | All canonical urls for the product |  [optional]
**mainCategoryId** | **Integer** | The main category id for the product. |  [optional]
**relatedProducts** | [**List&lt;ProductModelsReadRelatedProduct&gt;**](ProductModelsReadRelatedProduct.md) | The related products for the product. |  [optional]




