

# ProductModelsReadProductItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **Integer** | The product item id. |  [optional]
**articleNumber** | **String** | The article number for the product item. |  [optional]
**productId** | **Integer** | The id of the product that the item belongs to. |  [optional]
**name** | **String** | The name of the product item. |  [optional]
**shelf** | **String** | The shelf name where the product item can be found. |  [optional]
**weight** | **Integer** | The weight of the item in grams (g). |  [optional]
**length** | **Integer** | The length of the item in millimeters (mm). |  [optional]
**width** | **Integer** | The width of the item in millimeters (mm). |  [optional]
**height** | **Integer** | The height of the item in millimeters (mm). |  [optional]
**gtin** | **String** | The GTIN number for the item. |  [optional]
**dateCreated** | [**Date**](Date.md) | The date the item was created. |  [optional]
**dateUpdated** | [**Date**](Date.md) | The date the item was last updated. |  [optional]
**active** | **Boolean** | The current state of the item. |  [optional]
**externalId** | **String** | External Id of the product item. |  [optional]
**stock** | [**ProductModelsReadProductItemStock**](ProductModelsReadProductItemStock.md) |  |  [optional]
**shippingFees** | [**List&lt;ProductModelsReadShippingFee&gt;**](ProductModelsReadShippingFee.md) | The lowest shipping fees for each market and country for the product item. |  [optional]




