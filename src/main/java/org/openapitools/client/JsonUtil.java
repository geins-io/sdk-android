/**
 * Geins Management API
 *  Geins Management API is an RESTful api to power your applications who manages your geins services. Geins provides an easy-to-use and scalable solution for managing all aspects of an online store, from product listings and customer information to order processing and payment transactions.   :::tip With this API, you can build custom applications and integrate with third-party systems, dashboards and other bussiness logic apps. :::    ## Getting started Once you have created an account, you can start using the Management API by creating an `API key`. You can create as many API keys as you need. Each `API key` is connected to a specific account so you can keep track of operations and manage keys. You can find your `API key` in the `geins merchant center`.   ### Fast track Use one of our [SDKs](https://docs.geins.io/docs/sdk/introduction) to get started quickly. The SDKs are available for the most popular programming languages and frameworks.  Or, if you prefer to just take it for a test run:  [![Run in Postman](https://run.pstmn.io/button.svg)](https://god.gw.postman.com/run-collection/25895885-aaf6598f-1a7c-4949-85d7-ba846c42d553?action=collection%2Ffork&collection-url=entityId%3D25895885-aaf6598f-1a7c-4949-85d7-ba846c42d553%26entityType%3Dcollection%26workspaceId%3Da2a179ce-158e-46b0-8d06-e9640f45112c)  ### Authentication Two authentication methods are supported:   - `API Key`   - `Basic Auth` 
 *
 * The version of the OpenAPI document: v1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("APIOrderOrderComment".equalsIgnoreCase(className)) {
      return new TypeToken<List<APIOrderOrderComment>>(){}.getType();
    }
    
    if ("APIOrderTransactionData".equalsIgnoreCase(className)) {
      return new TypeToken<List<APIOrderTransactionData>>(){}.getType();
    }
    
    if ("BrandModelsBrandQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<BrandModelsBrandQuery>>(){}.getType();
    }
    
    if ("BrandModelsReadBrand".equalsIgnoreCase(className)) {
      return new TypeToken<List<BrandModelsReadBrand>>(){}.getType();
    }
    
    if ("BrandModelsWriteBrand".equalsIgnoreCase(className)) {
      return new TypeToken<List<BrandModelsWriteBrand>>(){}.getType();
    }
    
    if ("CategoryModelsCategoryQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<CategoryModelsCategoryQuery>>(){}.getType();
    }
    
    if ("CategoryModelsReadCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<CategoryModelsReadCategory>>(){}.getType();
    }
    
    if ("CategoryModelsWriteCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<CategoryModelsWriteCategory>>(){}.getType();
    }
    
    if ("ContainerRestrictionSetupContainerRestrictionConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContainerRestrictionSetupContainerRestrictionConfiguration>>(){}.getType();
    }
    
    if ("Envelope".equalsIgnoreCase(className)) {
      return new TypeToken<List<Envelope>>(){}.getType();
    }
    
    if ("EnvelopeBrandModelsReadBrand".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeBrandModelsReadBrand>>(){}.getType();
    }
    
    if ("EnvelopeCategoryModelsReadCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeCategoryModelsReadCategory>>(){}.getType();
    }
    
    if ("EnvelopeInt".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeInt>>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadFeed".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeListProductModelsReadFeed>>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeListProductModelsReadProduct>>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeListProductModelsReadProductItem>>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadRelationType".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeListProductModelsReadRelationType>>(){}.getType();
    }
    
    if ("EnvelopeMarketModelsMarket".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeMarketModelsMarket>>(){}.getType();
    }
    
    if ("EnvelopePageAreaModelsReadPageArea".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopePageAreaModelsReadPageArea>>(){}.getType();
    }
    
    if ("EnvelopePageAreaModelsReadPageAreaFamily".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopePageAreaModelsReadPageAreaFamily>>(){}.getType();
    }
    
    if ("EnvelopeProductModelsReadProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeProductModelsReadProduct>>(){}.getType();
    }
    
    if ("EnvelopeProductModelsReadProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeProductModelsReadProductItem>>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameter".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeProductParameterModelsReadProductParameter>>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeProductParameterModelsReadProductParameterGroup>>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameterPredefinedValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeProductParameterModelsReadProductParameterPredefinedValue>>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameterValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeProductParameterModelsReadProductParameterValue>>(){}.getType();
    }
    
    if ("EnvelopeString".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeString>>(){}.getType();
    }
    
    if ("EnvelopeSupplierModelsReadSupplier".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeSupplierModelsReadSupplier>>(){}.getType();
    }
    
    if ("EnvelopeUserModelsReadUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeUserModelsReadUserProfile>>(){}.getType();
    }
    
    if ("EnvelopeVariantModelsReadVariant".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeVariantModelsReadVariant>>(){}.getType();
    }
    
    if ("EnvelopeVariantModelsReadVariantGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnvelopeVariantModelsReadVariantGroup>>(){}.getType();
    }
    
    if ("MarketModelsMarket".equalsIgnoreCase(className)) {
      return new TypeToken<List<MarketModelsMarket>>(){}.getType();
    }
    
    if ("OrderCapture".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCapture>>(){}.getType();
    }
    
    if ("OrderCaptureRow".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCaptureRow>>(){}.getType();
    }
    
    if ("OrderCheckoutOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCheckoutOrder>>(){}.getType();
    }
    
    if ("OrderCheckoutOrderRow".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCheckoutOrderRow>>(){}.getType();
    }
    
    if ("OrderFreightClass".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderFreightClass>>(){}.getType();
    }
    
    if ("OrderModelsAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsAddress>>(){}.getType();
    }
    
    if ("OrderModelsOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsOrder>>(){}.getType();
    }
    
    if ("OrderModelsOrderQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsOrderQuery>>(){}.getType();
    }
    
    if ("OrderModelsOrderRow".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsOrderRow>>(){}.getType();
    }
    
    if ("OrderModelsOrderStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsOrderStatus>>(){}.getType();
    }
    
    if ("OrderModelsOrderUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsOrderUpdate>>(){}.getType();
    }
    
    if ("OrderModelsPaymentDetail".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsPaymentDetail>>(){}.getType();
    }
    
    if ("OrderModelsRefund".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsRefund>>(){}.getType();
    }
    
    if ("OrderModelsShippingDetail".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderModelsShippingDetail>>(){}.getType();
    }
    
    if ("OrderProcessedCapture".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderProcessedCapture>>(){}.getType();
    }
    
    if ("OrderProcessedRefund".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderProcessedRefund>>(){}.getType();
    }
    
    if ("OrderRefund".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderRefund>>(){}.getType();
    }
    
    if ("OrderRefundRow".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderRefundRow>>(){}.getType();
    }
    
    if ("OrderValidateOrderCreationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderValidateOrderCreationRequest>>(){}.getType();
    }
    
    if ("OrderValidateOrderCreationRequestStockItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderValidateOrderCreationRequestStockItem>>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageArea".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAreaModelsReadPageArea>>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageAreaFamily".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAreaModelsReadPageAreaFamily>>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageWidget".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAreaModelsReadPageWidget>>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageWidgetContainer".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAreaModelsReadPageWidgetContainer>>(){}.getType();
    }
    
    if ("PageAreaModelsWritePageArea".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAreaModelsWritePageArea>>(){}.getType();
    }
    
    if ("PageAreaModelsWritePageAreaFamily".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAreaModelsWritePageAreaFamily>>(){}.getType();
    }
    
    if ("PageResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageResult>>(){}.getType();
    }
    
    if ("PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration>>(){}.getType();
    }
    
    if ("PageWidgetLazyLoadSetupLazyLoadConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageWidgetLazyLoadSetupLazyLoadConfiguration>>(){}.getType();
    }
    
    if ("PaymentModelsPaymentOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentModelsPaymentOption>>(){}.getType();
    }
    
    if ("PaymentModelsPaymentOptionQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentModelsPaymentOptionQuery>>(){}.getType();
    }
    
    if ("PriceListModelsPriceList".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceListModelsPriceList>>(){}.getType();
    }
    
    if ("PriceListModelsPriceListPriceResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceListModelsPriceListPriceResponse>>(){}.getType();
    }
    
    if ("PriceListModelsReadPriceListPrice".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceListModelsReadPriceListPrice>>(){}.getType();
    }
    
    if ("PriceListModelsWritePriceListPrice".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceListModelsWritePriceListPrice>>(){}.getType();
    }
    
    if ("ProductModelsMonitorSku".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsMonitorSku>>(){}.getType();
    }
    
    if ("ProductModelsProductCategory".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsProductCategory>>(){}.getType();
    }
    
    if ("ProductModelsProductQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsProductQuery>>(){}.getType();
    }
    
    if ("ProductModelsReadFeed".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadFeed>>(){}.getType();
    }
    
    if ("ProductModelsReadFeedMembership".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadFeedMembership>>(){}.getType();
    }
    
    if ("ProductModelsReadImage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadImage>>(){}.getType();
    }
    
    if ("ProductModelsReadProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadProduct>>(){}.getType();
    }
    
    if ("ProductModelsReadProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadProductItem>>(){}.getType();
    }
    
    if ("ProductModelsReadProductItemStock".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadProductItemStock>>(){}.getType();
    }
    
    if ("ProductModelsReadProductUrl".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadProductUrl>>(){}.getType();
    }
    
    if ("ProductModelsReadRelatedProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadRelatedProduct>>(){}.getType();
    }
    
    if ("ProductModelsReadRelationType".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadRelationType>>(){}.getType();
    }
    
    if ("ProductModelsReadShippingFee".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsReadShippingFee>>(){}.getType();
    }
    
    if ("ProductModelsRelatedProductEnvelope".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsRelatedProductEnvelope>>(){}.getType();
    }
    
    if ("ProductModelsStockEnvelope".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsStockEnvelope>>(){}.getType();
    }
    
    if ("ProductModelsWriteProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsWriteProduct>>(){}.getType();
    }
    
    if ("ProductModelsWriteProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsWriteProductItem>>(){}.getType();
    }
    
    if ("ProductModelsWriteProductItemStock".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsWriteProductItemStock>>(){}.getType();
    }
    
    if ("ProductModelsWriteRelatedProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductModelsWriteRelatedProduct>>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameter".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsReadProductParameter>>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsReadProductParameterGroup>>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameterPredefinedValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsReadProductParameterPredefinedValue>>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameterValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsReadProductParameterValue>>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameter".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsWriteProductParameter>>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsWriteProductParameterGroup>>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterPredefinedValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsWriteProductParameterPredefinedValue>>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsWriteProductParameterValue>>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterValueBatch".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductParameterModelsWriteProductParameterValueBatch>>(){}.getType();
    }
    
    if ("ProductProductItemEnvelope".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductProductItemEnvelope>>(){}.getType();
    }
    
    if ("SharedModelsLocalizableContent".equalsIgnoreCase(className)) {
      return new TypeToken<List<SharedModelsLocalizableContent>>(){}.getType();
    }
    
    if ("ShippingModelsParcelGroupOptions".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingModelsParcelGroupOptions>>(){}.getType();
    }
    
    if ("ShippingModelsShippingOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingModelsShippingOption>>(){}.getType();
    }
    
    if ("ShippingModelsShippingQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingModelsShippingQuery>>(){}.getType();
    }
    
    if ("ShippingModelsShippingSubOption".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingModelsShippingSubOption>>(){}.getType();
    }
    
    if ("SupplierModelsReadSupplier".equalsIgnoreCase(className)) {
      return new TypeToken<List<SupplierModelsReadSupplier>>(){}.getType();
    }
    
    if ("SupplierModelsSupplierQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<SupplierModelsSupplierQuery>>(){}.getType();
    }
    
    if ("SupplierModelsWriteSupplier".equalsIgnoreCase(className)) {
      return new TypeToken<List<SupplierModelsWriteSupplier>>(){}.getType();
    }
    
    if ("SystemNullableValidationConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<List<SystemNullableValidationConfiguration>>(){}.getType();
    }
    
    if ("UserModelsReadUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserModelsReadUserProfile>>(){}.getType();
    }
    
    if ("UserModelsUserProfileQuery".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserModelsUserProfileQuery>>(){}.getType();
    }
    
    if ("UserModelsWriteUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserModelsWriteUserProfile>>(){}.getType();
    }
    
    if ("VariantModelsReadVariant".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariantModelsReadVariant>>(){}.getType();
    }
    
    if ("VariantModelsReadVariantGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariantModelsReadVariantGroup>>(){}.getType();
    }
    
    if ("VariantModelsWriteVariant".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariantModelsWriteVariant>>(){}.getType();
    }
    
    if ("VariantModelsWriteVariantGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<VariantModelsWriteVariantGroup>>(){}.getType();
    }
    
    if ("WidgetRestrictionSetupWidgetRestrictionConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<List<WidgetRestrictionSetupWidgetRestrictionConfiguration>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("APIOrderOrderComment".equalsIgnoreCase(className)) {
      return new TypeToken<APIOrderOrderComment>(){}.getType();
    }
    
    if ("APIOrderTransactionData".equalsIgnoreCase(className)) {
      return new TypeToken<APIOrderTransactionData>(){}.getType();
    }
    
    if ("BrandModelsBrandQuery".equalsIgnoreCase(className)) {
      return new TypeToken<BrandModelsBrandQuery>(){}.getType();
    }
    
    if ("BrandModelsReadBrand".equalsIgnoreCase(className)) {
      return new TypeToken<BrandModelsReadBrand>(){}.getType();
    }
    
    if ("BrandModelsWriteBrand".equalsIgnoreCase(className)) {
      return new TypeToken<BrandModelsWriteBrand>(){}.getType();
    }
    
    if ("CategoryModelsCategoryQuery".equalsIgnoreCase(className)) {
      return new TypeToken<CategoryModelsCategoryQuery>(){}.getType();
    }
    
    if ("CategoryModelsReadCategory".equalsIgnoreCase(className)) {
      return new TypeToken<CategoryModelsReadCategory>(){}.getType();
    }
    
    if ("CategoryModelsWriteCategory".equalsIgnoreCase(className)) {
      return new TypeToken<CategoryModelsWriteCategory>(){}.getType();
    }
    
    if ("ContainerRestrictionSetupContainerRestrictionConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<ContainerRestrictionSetupContainerRestrictionConfiguration>(){}.getType();
    }
    
    if ("Envelope".equalsIgnoreCase(className)) {
      return new TypeToken<Envelope>(){}.getType();
    }
    
    if ("EnvelopeBrandModelsReadBrand".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeBrandModelsReadBrand>(){}.getType();
    }
    
    if ("EnvelopeCategoryModelsReadCategory".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeCategoryModelsReadCategory>(){}.getType();
    }
    
    if ("EnvelopeInt".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeInt>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadFeed".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeListProductModelsReadFeed>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadProduct".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeListProductModelsReadProduct>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeListProductModelsReadProductItem>(){}.getType();
    }
    
    if ("EnvelopeListProductModelsReadRelationType".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeListProductModelsReadRelationType>(){}.getType();
    }
    
    if ("EnvelopeMarketModelsMarket".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeMarketModelsMarket>(){}.getType();
    }
    
    if ("EnvelopePageAreaModelsReadPageArea".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopePageAreaModelsReadPageArea>(){}.getType();
    }
    
    if ("EnvelopePageAreaModelsReadPageAreaFamily".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopePageAreaModelsReadPageAreaFamily>(){}.getType();
    }
    
    if ("EnvelopeProductModelsReadProduct".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeProductModelsReadProduct>(){}.getType();
    }
    
    if ("EnvelopeProductModelsReadProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeProductModelsReadProductItem>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameter".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeProductParameterModelsReadProductParameter>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeProductParameterModelsReadProductParameterGroup>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameterPredefinedValue".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeProductParameterModelsReadProductParameterPredefinedValue>(){}.getType();
    }
    
    if ("EnvelopeProductParameterModelsReadProductParameterValue".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeProductParameterModelsReadProductParameterValue>(){}.getType();
    }
    
    if ("EnvelopeString".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeString>(){}.getType();
    }
    
    if ("EnvelopeSupplierModelsReadSupplier".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeSupplierModelsReadSupplier>(){}.getType();
    }
    
    if ("EnvelopeUserModelsReadUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeUserModelsReadUserProfile>(){}.getType();
    }
    
    if ("EnvelopeVariantModelsReadVariant".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeVariantModelsReadVariant>(){}.getType();
    }
    
    if ("EnvelopeVariantModelsReadVariantGroup".equalsIgnoreCase(className)) {
      return new TypeToken<EnvelopeVariantModelsReadVariantGroup>(){}.getType();
    }
    
    if ("MarketModelsMarket".equalsIgnoreCase(className)) {
      return new TypeToken<MarketModelsMarket>(){}.getType();
    }
    
    if ("OrderCapture".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCapture>(){}.getType();
    }
    
    if ("OrderCaptureRow".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCaptureRow>(){}.getType();
    }
    
    if ("OrderCheckoutOrder".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCheckoutOrder>(){}.getType();
    }
    
    if ("OrderCheckoutOrderRow".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCheckoutOrderRow>(){}.getType();
    }
    
    if ("OrderFreightClass".equalsIgnoreCase(className)) {
      return new TypeToken<OrderFreightClass>(){}.getType();
    }
    
    if ("OrderModelsAddress".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsAddress>(){}.getType();
    }
    
    if ("OrderModelsOrder".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsOrder>(){}.getType();
    }
    
    if ("OrderModelsOrderQuery".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsOrderQuery>(){}.getType();
    }
    
    if ("OrderModelsOrderRow".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsOrderRow>(){}.getType();
    }
    
    if ("OrderModelsOrderStatus".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsOrderStatus>(){}.getType();
    }
    
    if ("OrderModelsOrderUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsOrderUpdate>(){}.getType();
    }
    
    if ("OrderModelsPaymentDetail".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsPaymentDetail>(){}.getType();
    }
    
    if ("OrderModelsRefund".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsRefund>(){}.getType();
    }
    
    if ("OrderModelsShippingDetail".equalsIgnoreCase(className)) {
      return new TypeToken<OrderModelsShippingDetail>(){}.getType();
    }
    
    if ("OrderProcessedCapture".equalsIgnoreCase(className)) {
      return new TypeToken<OrderProcessedCapture>(){}.getType();
    }
    
    if ("OrderProcessedRefund".equalsIgnoreCase(className)) {
      return new TypeToken<OrderProcessedRefund>(){}.getType();
    }
    
    if ("OrderRefund".equalsIgnoreCase(className)) {
      return new TypeToken<OrderRefund>(){}.getType();
    }
    
    if ("OrderRefundRow".equalsIgnoreCase(className)) {
      return new TypeToken<OrderRefundRow>(){}.getType();
    }
    
    if ("OrderValidateOrderCreationRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderValidateOrderCreationRequest>(){}.getType();
    }
    
    if ("OrderValidateOrderCreationRequestStockItem".equalsIgnoreCase(className)) {
      return new TypeToken<OrderValidateOrderCreationRequestStockItem>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageArea".equalsIgnoreCase(className)) {
      return new TypeToken<PageAreaModelsReadPageArea>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageAreaFamily".equalsIgnoreCase(className)) {
      return new TypeToken<PageAreaModelsReadPageAreaFamily>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageWidget".equalsIgnoreCase(className)) {
      return new TypeToken<PageAreaModelsReadPageWidget>(){}.getType();
    }
    
    if ("PageAreaModelsReadPageWidgetContainer".equalsIgnoreCase(className)) {
      return new TypeToken<PageAreaModelsReadPageWidgetContainer>(){}.getType();
    }
    
    if ("PageAreaModelsWritePageArea".equalsIgnoreCase(className)) {
      return new TypeToken<PageAreaModelsWritePageArea>(){}.getType();
    }
    
    if ("PageAreaModelsWritePageAreaFamily".equalsIgnoreCase(className)) {
      return new TypeToken<PageAreaModelsWritePageAreaFamily>(){}.getType();
    }
    
    if ("PageResult".equalsIgnoreCase(className)) {
      return new TypeToken<PageResult>(){}.getType();
    }
    
    if ("PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration>(){}.getType();
    }
    
    if ("PageWidgetLazyLoadSetupLazyLoadConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<PageWidgetLazyLoadSetupLazyLoadConfiguration>(){}.getType();
    }
    
    if ("PaymentModelsPaymentOption".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentModelsPaymentOption>(){}.getType();
    }
    
    if ("PaymentModelsPaymentOptionQuery".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentModelsPaymentOptionQuery>(){}.getType();
    }
    
    if ("PriceListModelsPriceList".equalsIgnoreCase(className)) {
      return new TypeToken<PriceListModelsPriceList>(){}.getType();
    }
    
    if ("PriceListModelsPriceListPriceResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PriceListModelsPriceListPriceResponse>(){}.getType();
    }
    
    if ("PriceListModelsReadPriceListPrice".equalsIgnoreCase(className)) {
      return new TypeToken<PriceListModelsReadPriceListPrice>(){}.getType();
    }
    
    if ("PriceListModelsWritePriceListPrice".equalsIgnoreCase(className)) {
      return new TypeToken<PriceListModelsWritePriceListPrice>(){}.getType();
    }
    
    if ("ProductModelsMonitorSku".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsMonitorSku>(){}.getType();
    }
    
    if ("ProductModelsProductCategory".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsProductCategory>(){}.getType();
    }
    
    if ("ProductModelsProductQuery".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsProductQuery>(){}.getType();
    }
    
    if ("ProductModelsReadFeed".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadFeed>(){}.getType();
    }
    
    if ("ProductModelsReadFeedMembership".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadFeedMembership>(){}.getType();
    }
    
    if ("ProductModelsReadImage".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadImage>(){}.getType();
    }
    
    if ("ProductModelsReadProduct".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadProduct>(){}.getType();
    }
    
    if ("ProductModelsReadProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadProductItem>(){}.getType();
    }
    
    if ("ProductModelsReadProductItemStock".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadProductItemStock>(){}.getType();
    }
    
    if ("ProductModelsReadProductUrl".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadProductUrl>(){}.getType();
    }
    
    if ("ProductModelsReadRelatedProduct".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadRelatedProduct>(){}.getType();
    }
    
    if ("ProductModelsReadRelationType".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadRelationType>(){}.getType();
    }
    
    if ("ProductModelsReadShippingFee".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsReadShippingFee>(){}.getType();
    }
    
    if ("ProductModelsRelatedProductEnvelope".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsRelatedProductEnvelope>(){}.getType();
    }
    
    if ("ProductModelsStockEnvelope".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsStockEnvelope>(){}.getType();
    }
    
    if ("ProductModelsWriteProduct".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsWriteProduct>(){}.getType();
    }
    
    if ("ProductModelsWriteProductItem".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsWriteProductItem>(){}.getType();
    }
    
    if ("ProductModelsWriteProductItemStock".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsWriteProductItemStock>(){}.getType();
    }
    
    if ("ProductModelsWriteRelatedProduct".equalsIgnoreCase(className)) {
      return new TypeToken<ProductModelsWriteRelatedProduct>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameter".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsReadProductParameter>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsReadProductParameterGroup>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameterPredefinedValue".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsReadProductParameterPredefinedValue>(){}.getType();
    }
    
    if ("ProductParameterModelsReadProductParameterValue".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsReadProductParameterValue>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameter".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsWriteProductParameter>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterGroup".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsWriteProductParameterGroup>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterPredefinedValue".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsWriteProductParameterPredefinedValue>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterValue".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsWriteProductParameterValue>(){}.getType();
    }
    
    if ("ProductParameterModelsWriteProductParameterValueBatch".equalsIgnoreCase(className)) {
      return new TypeToken<ProductParameterModelsWriteProductParameterValueBatch>(){}.getType();
    }
    
    if ("ProductProductItemEnvelope".equalsIgnoreCase(className)) {
      return new TypeToken<ProductProductItemEnvelope>(){}.getType();
    }
    
    if ("SharedModelsLocalizableContent".equalsIgnoreCase(className)) {
      return new TypeToken<SharedModelsLocalizableContent>(){}.getType();
    }
    
    if ("ShippingModelsParcelGroupOptions".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingModelsParcelGroupOptions>(){}.getType();
    }
    
    if ("ShippingModelsShippingOption".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingModelsShippingOption>(){}.getType();
    }
    
    if ("ShippingModelsShippingQuery".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingModelsShippingQuery>(){}.getType();
    }
    
    if ("ShippingModelsShippingSubOption".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingModelsShippingSubOption>(){}.getType();
    }
    
    if ("SupplierModelsReadSupplier".equalsIgnoreCase(className)) {
      return new TypeToken<SupplierModelsReadSupplier>(){}.getType();
    }
    
    if ("SupplierModelsSupplierQuery".equalsIgnoreCase(className)) {
      return new TypeToken<SupplierModelsSupplierQuery>(){}.getType();
    }
    
    if ("SupplierModelsWriteSupplier".equalsIgnoreCase(className)) {
      return new TypeToken<SupplierModelsWriteSupplier>(){}.getType();
    }
    
    if ("SystemNullableValidationConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<SystemNullableValidationConfiguration>(){}.getType();
    }
    
    if ("UserModelsReadUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<UserModelsReadUserProfile>(){}.getType();
    }
    
    if ("UserModelsUserProfileQuery".equalsIgnoreCase(className)) {
      return new TypeToken<UserModelsUserProfileQuery>(){}.getType();
    }
    
    if ("UserModelsWriteUserProfile".equalsIgnoreCase(className)) {
      return new TypeToken<UserModelsWriteUserProfile>(){}.getType();
    }
    
    if ("VariantModelsReadVariant".equalsIgnoreCase(className)) {
      return new TypeToken<VariantModelsReadVariant>(){}.getType();
    }
    
    if ("VariantModelsReadVariantGroup".equalsIgnoreCase(className)) {
      return new TypeToken<VariantModelsReadVariantGroup>(){}.getType();
    }
    
    if ("VariantModelsWriteVariant".equalsIgnoreCase(className)) {
      return new TypeToken<VariantModelsWriteVariant>(){}.getType();
    }
    
    if ("VariantModelsWriteVariantGroup".equalsIgnoreCase(className)) {
      return new TypeToken<VariantModelsWriteVariantGroup>(){}.getType();
    }
    
    if ("WidgetRestrictionSetupWidgetRestrictionConfiguration".equalsIgnoreCase(className)) {
      return new TypeToken<WidgetRestrictionSetupWidgetRestrictionConfiguration>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
