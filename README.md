# openapi-android-client for Geins Management API 

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.BrandApi;

public class BrandApiExample {

    public static void main(String[] args) {
        BrandApi apiInstance = new BrandApi();
        BrandModelsWriteBrand brand = new BrandModelsWriteBrand(); // BrandModelsWriteBrand | The brand to create.
        try {
            EnvelopeBrandModelsReadBrand result = apiInstance.createBrand(brand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandApi#createBrand");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://mgmtapi.carismar.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandApi* | [**createBrand**](docs/BrandApi.md#createBrand) | **POST** /API/Brand | Create a new brand
*BrandApi* | [**getBrandById**](docs/BrandApi.md#getBrandById) | **GET** /API/Brand/{id} | Get a specific brand
*BrandApi* | [**queryBrands**](docs/BrandApi.md#queryBrands) | **POST** /API/Brand/Query | Query brands
*BrandApi* | [**updateBrand**](docs/BrandApi.md#updateBrand) | **PUT** /API/Brand/{id} | Updates a brand
*CategoryApi* | [**createCategory**](docs/CategoryApi.md#createCategory) | **POST** /API/Category | Create a new category
*CategoryApi* | [**getCategoryById**](docs/CategoryApi.md#getCategoryById) | **GET** /API/Category/{id} | Get a specific category
*CategoryApi* | [**queryCategories**](docs/CategoryApi.md#queryCategories) | **POST** /API/Category/Query | Query categories
*CategoryApi* | [**updateCategory**](docs/CategoryApi.md#updateCategory) | **PUT** /API/Category/{id} | Update a category
*MarketApi* | [**getMarketById**](docs/MarketApi.md#getMarketById) | **GET** /API/Market/{marketId} | Get a specific market
*MarketApi* | [**listMarkets**](docs/MarketApi.md#listMarkets) | **GET** /API/Market/List | Gets a list of all markets
*OrderApi* | [**addCommentToOrder**](docs/OrderApi.md#addCommentToOrder) | **POST** /API/Order/{id}/Comment | Adds a comment to the order
*OrderApi* | [**createOrder**](docs/OrderApi.md#createOrder) | **POST** /API/Order | Post a new order
*OrderApi* | [**createOrderId**](docs/OrderApi.md#createOrderId) | **POST** /API/Order/Id | Create a new order id
*OrderApi* | [**deleteOrder**](docs/OrderApi.md#deleteOrder) | **DELETE** /API/Order/{id} | Deletes or deactivates an order
*OrderApi* | [**getCaptureById**](docs/OrderApi.md#getCaptureById) | **GET** /API/Order/Capture/{captureId} | Get Capture by Id
*OrderApi* | [**getOrderById**](docs/OrderApi.md#getOrderById) | **GET** /API/Order/{id}/{include} | Get an instance of a order
*OrderApi* | [**getOrderStatuses**](docs/OrderApi.md#getOrderStatuses) | **GET** /API/Order/Statuses | Get a list of available order statuses
*OrderApi* | [**getRefundById**](docs/OrderApi.md#getRefundById) | **GET** /API/Order/Refund/{refundId} | Get Refund by Id
*OrderApi* | [**partialUpdateOfOrder**](docs/OrderApi.md#partialUpdateOfOrder) | **PATCH** /API/Order/{id} | Partial update of an order
*OrderApi* | [**queryOrders**](docs/OrderApi.md#queryOrders) | **POST** /API/Order/Query | Query the order repository
*OrderApi* | [**setCaptureAsProcessed**](docs/OrderApi.md#setCaptureAsProcessed) | **POST** /API/Order/Capture/SetAsProcessed | Set a capture as processed (&#x3D; captured)
*OrderApi* | [**setPaymentAsPayed**](docs/OrderApi.md#setPaymentAsPayed) | **POST** /API/Order/PaymentDetail/{paymentDetailId}/SetAsPayed | Set Payment Detail as payed
*OrderApi* | [**setRefundAsProcessed**](docs/OrderApi.md#setRefundAsProcessed) | **POST** /API/Order/Refund/SetAsProcessed | Set a refund as processed (&#x3D; settled)
*OrderApi* | [**updateOrderStatus**](docs/OrderApi.md#updateOrderStatus) | **POST** /API/Order/{id}/Status/{status}/{transactionId}/{secondaryTransactionId} | Update order status
*OrderApi* | [**updateTransactionData**](docs/OrderApi.md#updateTransactionData) | **POST** /API/Order/{id}/TransactionData | Updates transaction data on an order
*OrderApi* | [**validateOrder**](docs/OrderApi.md#validateOrder) | **POST** /API/Order/ValidateCreation | Validates order data for order creation.
*PageAreaApi* | [**createOrUpdateAPageArea**](docs/PageAreaApi.md#createOrUpdateAPageArea) | **POST** /API/PageArea | Create or update a page area
*PageAreaApi* | [**createOrUpdatePageAreaFamily**](docs/PageAreaApi.md#createOrUpdatePageAreaFamily) | **POST** /API/PageAreaFamily | Create or update a page area family
*PageAreaApi* | [**getPageArea**](docs/PageAreaApi.md#getPageArea) | **GET** /API/PageArea/{name} | Get a specific page area
*PageAreaApi* | [**getPageAreaFamily**](docs/PageAreaApi.md#getPageAreaFamily) | **GET** /API/PageAreaFamily/{familyId} | Get a specific page area family
*PageAreaApi* | [**listPageAreaFamilies**](docs/PageAreaApi.md#listPageAreaFamilies) | **GET** /API/PageAreaFamily/List | Gets a list of all page area families, including nested data
*PaymentApi* | [**queryPaymentOptions**](docs/PaymentApi.md#queryPaymentOptions) | **POST** /API/Payment/Query | Query payment options
*PriceListApi* | [**listPriceLists**](docs/PriceListApi.md#listPriceLists) | **GET** /API/PriceList/List | Get all price list definitions
*PriceListApi* | [**updatePricelistPrices**](docs/PriceListApi.md#updatePricelistPrices) | **PUT** /API/PriceList/Price | Updates price list prices
*ProductApi* | [**addAvailabilityMonitor**](docs/ProductApi.md#addAvailabilityMonitor) | **POST** /API/Product/MonitorAvailability | Add a product availability monitor
*ProductApi* | [**addCategoryToProduct**](docs/ProductApi.md#addCategoryToProduct) | **PUT** /API/Product/{productId}/Category | Adds a category relation to a product
*ProductApi* | [**addImageToProduct**](docs/ProductApi.md#addImageToProduct) | **PUT** /API/Product/{productId}/Image/{imageName} | Adds an image relation to a product
*ProductApi* | [**addRelatedProductsToProduct**](docs/ProductApi.md#addRelatedProductsToProduct) | **PUT** /API/Product/{productId}/Related | Add related products to a product
*ProductApi* | [**batchUpdateProductItems**](docs/ProductApi.md#batchUpdateProductItems) | **PUT** /API/Product/Items | Updates product items in batch
*ProductApi* | [**batchUpdateStockValues**](docs/ProductApi.md#batchUpdateStockValues) | **PUT** /API/Product/Stock | Update stock values for multiple product items
*ProductApi* | [**createProduct**](docs/ProductApi.md#createProduct) | **POST** /API/Product | Create a new product
*ProductApi* | [**createProductItems**](docs/ProductApi.md#createProductItems) | **POST** /API/Product/{productId}/Item | Create a new product item
*ProductApi* | [**getProductById**](docs/ProductApi.md#getProductById) | **GET** /API/Product/{productId} | Get a specific product
*ProductApi* | [**getProductItemById**](docs/ProductApi.md#getProductItemById) | **GET** /API/Product/Item/{itemId} | Get a specific product item
*ProductApi* | [**linkRelatedProductsByRelationId**](docs/ProductApi.md#linkRelatedProductsByRelationId) | **PUT** /API/Product/{productId}/Related/{relationTypeId} | Add related products to a product using a fixed relation type
*ProductApi* | [**listAllProductItemsPaged**](docs/ProductApi.md#listAllProductItemsPaged) | **GET** /API/Product/Items/{page} | Get all product items with pagination
*ProductApi* | [**listFeeds**](docs/ProductApi.md#listFeeds) | **GET** /API/Product/Feeds | Gets a list of all feeds
*ProductApi* | [**listProductItems**](docs/ProductApi.md#listProductItems) | **GET** /API/Product/Items | Get all product items
*ProductApi* | [**listProductRelationTypes**](docs/ProductApi.md#listProductRelationTypes) | **GET** /API/Product/RelationTypes | Gets a list of product relation types
*ProductApi* | [**queryProducts**](docs/ProductApi.md#queryProducts) | **POST** /API/Product/Query | Query products
*ProductApi* | [**queryProductsPaged**](docs/ProductApi.md#queryProductsPaged) | **POST** /API/Product/Query/{page} | Query products with pagination
*ProductApi* | [**queryStock**](docs/ProductApi.md#queryStock) | **POST** /API/Product/Stock/Query | Query stock
*ProductApi* | [**updateProduct**](docs/ProductApi.md#updateProduct) | **PUT** /API/Product/{productId} | Updates a product
*ProductApi* | [**updateProductItem**](docs/ProductApi.md#updateProductItem) | **PUT** /API/Product/Item/{itemId} | Updates a product item
*ProductParameterApi* | [**batchReplaceProductParameterValues**](docs/ProductParameterApi.md#batchReplaceProductParameterValues) | **POST** /API/ProductParameter/Values | Replace multiple product parameter values
*ProductParameterApi* | [**batchUpdateProductParameterValues**](docs/ProductParameterApi.md#batchUpdateProductParameterValues) | **PUT** /API/ProductParameter/Values | Update multiple product parameter values
*ProductParameterApi* | [**createOrUpdateProductParameterValue**](docs/ProductParameterApi.md#createOrUpdateProductParameterValue) | **POST** /API/ProductParameter/Value | Create or update a new product parameter value
*ProductParameterApi* | [**createProductParameter**](docs/ProductParameterApi.md#createProductParameter) | **POST** /API/ProductParameter | Create a new product parameter
*ProductParameterApi* | [**createProductParameterGroup**](docs/ProductParameterApi.md#createProductParameterGroup) | **POST** /API/ProductParameter/Group | Create a new product parameter group
*ProductParameterApi* | [**createProductParameterPredefinedValue**](docs/ProductParameterApi.md#createProductParameterPredefinedValue) | **POST** /API/ProductParameter/PredefinedValue | Create a new predefined value for a product parameter
*ProductParameterApi* | [**getProductParameterById**](docs/ProductParameterApi.md#getProductParameterById) | **GET** /API/ProductParameter/{id} | Get a specific product parameter
*ProductParameterApi* | [**getProductParameterGroupById**](docs/ProductParameterApi.md#getProductParameterGroupById) | **GET** /API/ProductParameter/Group/{id} | Get a specific product parameter group
*ProductParameterApi* | [**getProductParameterPredefinedValue**](docs/ProductParameterApi.md#getProductParameterPredefinedValue) | **GET** /API/ProductParameter/PredefinedValue/{id} | Get a specific predefined value for a product parameter
*ProductParameterApi* | [**getProductParameterValue**](docs/ProductParameterApi.md#getProductParameterValue) | **GET** /API/ProductParameter/Value/{id} | Get a specific product parameter value
*ProductParameterApi* | [**updateProductParameter**](docs/ProductParameterApi.md#updateProductParameter) | **PUT** /API/ProductParameter/{id} | Updates a product parameter
*ProductParameterApi* | [**updateProductParameterGroup**](docs/ProductParameterApi.md#updateProductParameterGroup) | **PUT** /API/ProductParameter/Group/{id} | Update a product parameter group
*ShippingApi* | [**createParcelGroup**](docs/ShippingApi.md#createParcelGroup) | **POST** /API/Shipping/ParcelGroup | Create a new parcel group
*ShippingApi* | [**queryShippingOptions**](docs/ShippingApi.md#queryShippingOptions) | **POST** /API/Shipping/Query | Query shipping options
*SupplierApi* | [**createSupplier**](docs/SupplierApi.md#createSupplier) | **POST** /API/Supplier | Create a new supplier
*SupplierApi* | [**getSupplierById**](docs/SupplierApi.md#getSupplierById) | **GET** /API/Supplier/{id} | Get a specific supplier
*SupplierApi* | [**querySuppliers**](docs/SupplierApi.md#querySuppliers) | **POST** /API/Supplier/Query | Query suppliers
*SupplierApi* | [**updateSupplier**](docs/SupplierApi.md#updateSupplier) | **PUT** /API/Supplier/{id} | Updates a supplier
*UserApi* | [**createUserProfile**](docs/UserApi.md#createUserProfile) | **POST** /API/User | Create user profile
*UserApi* | [**deleteUserProfile**](docs/UserApi.md#deleteUserProfile) | **DELETE** /API/User/email | Delete user profile
*UserApi* | [**getUserProfile**](docs/UserApi.md#getUserProfile) | **POST** /API/User/Query | Get a specific user profile
*UserApi* | [**updateUserProfile**](docs/UserApi.md#updateUserProfile) | **PUT** /API/User | Update user profile
*VariantApi* | [**addProductToVariantGroup**](docs/VariantApi.md#addProductToVariantGroup) | **PUT** /API/VariantGroup/{groupId}/{productId} | Adds a product to an existing group
*VariantApi* | [**addProductToVariantGroupByProductId**](docs/VariantApi.md#addProductToVariantGroupByProductId) | **PUT** /API/Variant/{productId1}/{productId2} | Adds a product to an existing group
*VariantApi* | [**createVariantGroup**](docs/VariantApi.md#createVariantGroup) | **POST** /API/VariantGroup | Create a new variant group
*VariantApi* | [**createVariantGroupWithProduct**](docs/VariantApi.md#createVariantGroupWithProduct) | **POST** /API/Variant/{productId}/VariantGroup | Create a new group for the provided product id
*VariantApi* | [**deleteVariantGroup**](docs/VariantApi.md#deleteVariantGroup) | **DELETE** /API/VariantGroup/{groupId} | Delete an entire variant group
*VariantApi* | [**deleteVariantGroupByProductId**](docs/VariantApi.md#deleteVariantGroupByProductId) | **DELETE** /API/Variant/{productId}/VariantGroup | Delete an entire variant group
*VariantApi* | [**getVariantGroup**](docs/VariantApi.md#getVariantGroup) | **GET** /API/VariantGroup/{groupId} | Get a specific variant group
*VariantApi* | [**getVariantGroupByProductId**](docs/VariantApi.md#getVariantGroupByProductId) | **GET** /API/Variant/{productId}/VariantGroup | Get the variant group for the provided id
*VariantApi* | [**getVariantLabels**](docs/VariantApi.md#getVariantLabels) | **GET** /API/Variant/Labels | Get all valid variant labels
*VariantApi* | [**removeProductFromVariantGroup**](docs/VariantApi.md#removeProductFromVariantGroup) | **DELETE** /API/Variant/{productId} | Remove a product from its variant group
*VariantApi* | [**updateVariant**](docs/VariantApi.md#updateVariant) | **PUT** /API/Variant/{productId} | Adds the variant details for the product with the provided ID
*VariantApi* | [**updateVariantGroup**](docs/VariantApi.md#updateVariantGroup) | **PUT** /API/VariantGroup/{groupId} | Updates the settings of a group


## Documentation for Models

 - [APIOrderOrderComment](docs/APIOrderOrderComment.md)
 - [APIOrderTransactionData](docs/APIOrderTransactionData.md)
 - [BrandModelsBrandQuery](docs/BrandModelsBrandQuery.md)
 - [BrandModelsReadBrand](docs/BrandModelsReadBrand.md)
 - [BrandModelsWriteBrand](docs/BrandModelsWriteBrand.md)
 - [CategoryModelsCategoryQuery](docs/CategoryModelsCategoryQuery.md)
 - [CategoryModelsReadCategory](docs/CategoryModelsReadCategory.md)
 - [CategoryModelsWriteCategory](docs/CategoryModelsWriteCategory.md)
 - [ContainerRestrictionSetupContainerRestrictionConfiguration](docs/ContainerRestrictionSetupContainerRestrictionConfiguration.md)
 - [Envelope](docs/Envelope.md)
 - [EnvelopeBrandModelsReadBrand](docs/EnvelopeBrandModelsReadBrand.md)
 - [EnvelopeCategoryModelsReadCategory](docs/EnvelopeCategoryModelsReadCategory.md)
 - [EnvelopeInt](docs/EnvelopeInt.md)
 - [EnvelopeListProductModelsReadFeed](docs/EnvelopeListProductModelsReadFeed.md)
 - [EnvelopeListProductModelsReadProduct](docs/EnvelopeListProductModelsReadProduct.md)
 - [EnvelopeListProductModelsReadProductItem](docs/EnvelopeListProductModelsReadProductItem.md)
 - [EnvelopeListProductModelsReadRelationType](docs/EnvelopeListProductModelsReadRelationType.md)
 - [EnvelopeMarketModelsMarket](docs/EnvelopeMarketModelsMarket.md)
 - [EnvelopePageAreaModelsReadPageArea](docs/EnvelopePageAreaModelsReadPageArea.md)
 - [EnvelopePageAreaModelsReadPageAreaFamily](docs/EnvelopePageAreaModelsReadPageAreaFamily.md)
 - [EnvelopeProductModelsReadProduct](docs/EnvelopeProductModelsReadProduct.md)
 - [EnvelopeProductModelsReadProductItem](docs/EnvelopeProductModelsReadProductItem.md)
 - [EnvelopeProductParameterModelsReadProductParameter](docs/EnvelopeProductParameterModelsReadProductParameter.md)
 - [EnvelopeProductParameterModelsReadProductParameterGroup](docs/EnvelopeProductParameterModelsReadProductParameterGroup.md)
 - [EnvelopeProductParameterModelsReadProductParameterPredefinedValue](docs/EnvelopeProductParameterModelsReadProductParameterPredefinedValue.md)
 - [EnvelopeProductParameterModelsReadProductParameterValue](docs/EnvelopeProductParameterModelsReadProductParameterValue.md)
 - [EnvelopeString](docs/EnvelopeString.md)
 - [EnvelopeSupplierModelsReadSupplier](docs/EnvelopeSupplierModelsReadSupplier.md)
 - [EnvelopeUserModelsReadUserProfile](docs/EnvelopeUserModelsReadUserProfile.md)
 - [EnvelopeVariantModelsReadVariant](docs/EnvelopeVariantModelsReadVariant.md)
 - [EnvelopeVariantModelsReadVariantGroup](docs/EnvelopeVariantModelsReadVariantGroup.md)
 - [MarketModelsMarket](docs/MarketModelsMarket.md)
 - [OrderCapture](docs/OrderCapture.md)
 - [OrderCaptureRow](docs/OrderCaptureRow.md)
 - [OrderCheckoutOrder](docs/OrderCheckoutOrder.md)
 - [OrderCheckoutOrderRow](docs/OrderCheckoutOrderRow.md)
 - [OrderFreightClass](docs/OrderFreightClass.md)
 - [OrderModelsAddress](docs/OrderModelsAddress.md)
 - [OrderModelsOrder](docs/OrderModelsOrder.md)
 - [OrderModelsOrderQuery](docs/OrderModelsOrderQuery.md)
 - [OrderModelsOrderRow](docs/OrderModelsOrderRow.md)
 - [OrderModelsOrderStatus](docs/OrderModelsOrderStatus.md)
 - [OrderModelsOrderUpdate](docs/OrderModelsOrderUpdate.md)
 - [OrderModelsPaymentDetail](docs/OrderModelsPaymentDetail.md)
 - [OrderModelsRefund](docs/OrderModelsRefund.md)
 - [OrderModelsShippingDetail](docs/OrderModelsShippingDetail.md)
 - [OrderProcessedCapture](docs/OrderProcessedCapture.md)
 - [OrderProcessedRefund](docs/OrderProcessedRefund.md)
 - [OrderRefund](docs/OrderRefund.md)
 - [OrderRefundRow](docs/OrderRefundRow.md)
 - [OrderValidateOrderCreationRequest](docs/OrderValidateOrderCreationRequest.md)
 - [OrderValidateOrderCreationRequestStockItem](docs/OrderValidateOrderCreationRequestStockItem.md)
 - [PageAreaModelsReadPageArea](docs/PageAreaModelsReadPageArea.md)
 - [PageAreaModelsReadPageAreaFamily](docs/PageAreaModelsReadPageAreaFamily.md)
 - [PageAreaModelsReadPageWidget](docs/PageAreaModelsReadPageWidget.md)
 - [PageAreaModelsReadPageWidgetContainer](docs/PageAreaModelsReadPageWidgetContainer.md)
 - [PageAreaModelsWritePageArea](docs/PageAreaModelsWritePageArea.md)
 - [PageAreaModelsWritePageAreaFamily](docs/PageAreaModelsWritePageAreaFamily.md)
 - [PageResult](docs/PageResult.md)
 - [PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration](docs/PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.md)
 - [PageWidgetLazyLoadSetupLazyLoadConfiguration](docs/PageWidgetLazyLoadSetupLazyLoadConfiguration.md)
 - [PaymentModelsPaymentOption](docs/PaymentModelsPaymentOption.md)
 - [PaymentModelsPaymentOptionQuery](docs/PaymentModelsPaymentOptionQuery.md)
 - [PriceListModelsPriceList](docs/PriceListModelsPriceList.md)
 - [PriceListModelsPriceListPriceResponse](docs/PriceListModelsPriceListPriceResponse.md)
 - [PriceListModelsReadPriceListPrice](docs/PriceListModelsReadPriceListPrice.md)
 - [PriceListModelsWritePriceListPrice](docs/PriceListModelsWritePriceListPrice.md)
 - [ProductModelsMonitorSku](docs/ProductModelsMonitorSku.md)
 - [ProductModelsProductCategory](docs/ProductModelsProductCategory.md)
 - [ProductModelsProductQuery](docs/ProductModelsProductQuery.md)
 - [ProductModelsReadFeed](docs/ProductModelsReadFeed.md)
 - [ProductModelsReadFeedMembership](docs/ProductModelsReadFeedMembership.md)
 - [ProductModelsReadImage](docs/ProductModelsReadImage.md)
 - [ProductModelsReadProduct](docs/ProductModelsReadProduct.md)
 - [ProductModelsReadProductItem](docs/ProductModelsReadProductItem.md)
 - [ProductModelsReadProductItemStock](docs/ProductModelsReadProductItemStock.md)
 - [ProductModelsReadProductUrl](docs/ProductModelsReadProductUrl.md)
 - [ProductModelsReadRelatedProduct](docs/ProductModelsReadRelatedProduct.md)
 - [ProductModelsReadRelationType](docs/ProductModelsReadRelationType.md)
 - [ProductModelsReadShippingFee](docs/ProductModelsReadShippingFee.md)
 - [ProductModelsRelatedProductEnvelope](docs/ProductModelsRelatedProductEnvelope.md)
 - [ProductModelsStockEnvelope](docs/ProductModelsStockEnvelope.md)
 - [ProductModelsWriteProduct](docs/ProductModelsWriteProduct.md)
 - [ProductModelsWriteProductItem](docs/ProductModelsWriteProductItem.md)
 - [ProductModelsWriteProductItemStock](docs/ProductModelsWriteProductItemStock.md)
 - [ProductModelsWriteRelatedProduct](docs/ProductModelsWriteRelatedProduct.md)
 - [ProductParameterModelsReadProductParameter](docs/ProductParameterModelsReadProductParameter.md)
 - [ProductParameterModelsReadProductParameterGroup](docs/ProductParameterModelsReadProductParameterGroup.md)
 - [ProductParameterModelsReadProductParameterPredefinedValue](docs/ProductParameterModelsReadProductParameterPredefinedValue.md)
 - [ProductParameterModelsReadProductParameterValue](docs/ProductParameterModelsReadProductParameterValue.md)
 - [ProductParameterModelsWriteProductParameter](docs/ProductParameterModelsWriteProductParameter.md)
 - [ProductParameterModelsWriteProductParameterGroup](docs/ProductParameterModelsWriteProductParameterGroup.md)
 - [ProductParameterModelsWriteProductParameterPredefinedValue](docs/ProductParameterModelsWriteProductParameterPredefinedValue.md)
 - [ProductParameterModelsWriteProductParameterValue](docs/ProductParameterModelsWriteProductParameterValue.md)
 - [ProductParameterModelsWriteProductParameterValueBatch](docs/ProductParameterModelsWriteProductParameterValueBatch.md)
 - [ProductProductItemEnvelope](docs/ProductProductItemEnvelope.md)
 - [SharedModelsLocalizableContent](docs/SharedModelsLocalizableContent.md)
 - [ShippingModelsParcelGroupOptions](docs/ShippingModelsParcelGroupOptions.md)
 - [ShippingModelsShippingOption](docs/ShippingModelsShippingOption.md)
 - [ShippingModelsShippingQuery](docs/ShippingModelsShippingQuery.md)
 - [ShippingModelsShippingSubOption](docs/ShippingModelsShippingSubOption.md)
 - [SupplierModelsReadSupplier](docs/SupplierModelsReadSupplier.md)
 - [SupplierModelsSupplierQuery](docs/SupplierModelsSupplierQuery.md)
 - [SupplierModelsWriteSupplier](docs/SupplierModelsWriteSupplier.md)
 - [SystemNullableValidationConfiguration](docs/SystemNullableValidationConfiguration.md)
 - [UserModelsReadUserProfile](docs/UserModelsReadUserProfile.md)
 - [UserModelsUserProfileQuery](docs/UserModelsUserProfileQuery.md)
 - [UserModelsWriteUserProfile](docs/UserModelsWriteUserProfile.md)
 - [VariantModelsReadVariant](docs/VariantModelsReadVariant.md)
 - [VariantModelsReadVariantGroup](docs/VariantModelsReadVariantGroup.md)
 - [VariantModelsWriteVariant](docs/VariantModelsWriteVariant.md)
 - [VariantModelsWriteVariantGroup](docs/VariantModelsWriteVariantGroup.md)
 - [WidgetRestrictionSetupWidgetRestrictionConfiguration](docs/WidgetRestrictionSetupWidgetRestrictionConfiguration.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key

- **API key parameter name**: x-apikey
- **Location**: HTTP header

### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



