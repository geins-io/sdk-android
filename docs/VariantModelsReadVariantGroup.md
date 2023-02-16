

# VariantModelsReadVariantGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **Integer** | The id of variant goup. |  [optional]
**name** | **String** | The optional internal name of the variant group. |  [optional]
**collapseInLists** | **Boolean** | Determine visibility of non-main products of this group in lists. |  [optional]
**mainProductId** | **Integer** | The main product of this group. If the group is collapsed in lists, this will be the only visible product. |  [optional]
**productIds** | **List&lt;Integer&gt;** | The product ids of the variants that belong to this group. |  [optional]
**products** | [**List&lt;ProductModelsReadProduct&gt;**](ProductModelsReadProduct.md) | Products belonging to the Variant group. Only included when parameter \&quot;include\&quot; is supplied in the query string |  [optional]




