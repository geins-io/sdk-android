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

package org.openapitools.client.model;

import java.util.*;
import java.util.Date;
import org.openapitools.client.model.CategoryModelsReadCategory;
import org.openapitools.client.model.MarketModelsMarket;
import org.openapitools.client.model.PriceListModelsReadPriceListPrice;
import org.openapitools.client.model.ProductModelsReadFeedMembership;
import org.openapitools.client.model.ProductModelsReadImage;
import org.openapitools.client.model.ProductModelsReadProductItem;
import org.openapitools.client.model.ProductModelsReadProductUrl;
import org.openapitools.client.model.ProductModelsReadRelatedProduct;
import org.openapitools.client.model.ProductParameterModelsReadProductParameterValue;
import org.openapitools.client.model.SharedModelsLocalizableContent;
import org.openapitools.client.model.VariantModelsReadVariant;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A product.
 **/
@ApiModel(description = "A product.")
public class ProductModelsReadProduct {
  
  @SerializedName("ProductId")
  private Integer productId = null;
  @SerializedName("ArticleNumber")
  private String articleNumber = null;
  @SerializedName("Names")
  private List<SharedModelsLocalizableContent> names = null;
  @SerializedName("DateCreated")
  private Date dateCreated = null;
  @SerializedName("DateUpdated")
  private Date dateUpdated = null;
  @SerializedName("Active")
  private Boolean active = null;
  @SerializedName("PurchasePrice")
  private Double purchasePrice = null;
  @SerializedName("PurchasePriceCurrency")
  private String purchasePriceCurrency = null;
  @SerializedName("ShortTexts")
  private List<SharedModelsLocalizableContent> shortTexts = null;
  @SerializedName("LongTexts")
  private List<SharedModelsLocalizableContent> longTexts = null;
  @SerializedName("TechTexts")
  private List<SharedModelsLocalizableContent> techTexts = null;
  @SerializedName("Items")
  private List<ProductModelsReadProductItem> items = null;
  @SerializedName("Prices")
  private List<PriceListModelsReadPriceListPrice> prices = null;
  @SerializedName("Categories")
  private List<CategoryModelsReadCategory> categories = null;
  @SerializedName("Images")
  private List<ProductModelsReadImage> images = null;
  @SerializedName("BrandId")
  private Integer brandId = null;
  @SerializedName("BrandName")
  private String brandName = null;
  @SerializedName("SupplierId")
  private Integer supplierId = null;
  @SerializedName("SupplierName")
  private String supplierName = null;
  @SerializedName("ParameterValues")
  private List<ProductParameterModelsReadProductParameterValue> parameterValues = null;
  @SerializedName("Variants")
  private List<VariantModelsReadVariant> variants = null;
  @SerializedName("Markets")
  private List<MarketModelsMarket> markets = null;
  @SerializedName("Vat")
  private Double vat = null;
  @SerializedName("PrimaryImage")
  private String primaryImage = null;
  @SerializedName("FreightClassId")
  private Integer freightClassId = null;
  @SerializedName("IntrastatCode")
  private String intrastatCode = null;
  @SerializedName("CountryOfOrigin")
  private String countryOfOrigin = null;
  @SerializedName("VariantGroupId")
  private Integer variantGroupId = null;
  @SerializedName("VatId")
  private Integer vatId = null;
  @SerializedName("ExternalId")
  private String externalId = null;
  @SerializedName("ActivationDate")
  private Date activationDate = null;
  @SerializedName("Feeds")
  private List<ProductModelsReadFeedMembership> feeds = null;
  @SerializedName("Urls")
  private List<ProductModelsReadProductUrl> urls = null;
  @SerializedName("MainCategoryId")
  private Integer mainCategoryId = null;
  @SerializedName("RelatedProducts")
  private List<ProductModelsReadRelatedProduct> relatedProducts = null;

  /**
   * The unique identifier for the product.
   **/
  @ApiModelProperty(value = "The unique identifier for the product.")
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  /**
   * The article number of the product.
   **/
  @ApiModelProperty(value = "The article number of the product.")
  public String getArticleNumber() {
    return articleNumber;
  }
  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  /**
   * The localized names of the product.
   **/
  @ApiModelProperty(value = "The localized names of the product.")
  public List<SharedModelsLocalizableContent> getNames() {
    return names;
  }
  public void setNames(List<SharedModelsLocalizableContent> names) {
    this.names = names;
  }

  /**
   * The date the product was created.
   **/
  @ApiModelProperty(value = "The date the product was created.")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * The date the product was last updated.
   **/
  @ApiModelProperty(value = "The date the product was last updated.")
  public Date getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(Date dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  /**
   * The current state of the product.
   **/
  @ApiModelProperty(value = "The current state of the product.")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * The purchase price in the currency defined in {Product.Models.Read.Product.PurchasePriceCurrency}.
   **/
  @ApiModelProperty(value = "The purchase price in the currency defined in {Product.Models.Read.Product.PurchasePriceCurrency}.")
  public Double getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  /**
   * The 3-letter ISO 4217 currency code for the amount given in {Product.Models.Read.Product.PurchasePrice}.
   **/
  @ApiModelProperty(value = "The 3-letter ISO 4217 currency code for the amount given in {Product.Models.Read.Product.PurchasePrice}.")
  public String getPurchasePriceCurrency() {
    return purchasePriceCurrency;
  }
  public void setPurchasePriceCurrency(String purchasePriceCurrency) {
    this.purchasePriceCurrency = purchasePriceCurrency;
  }

  /**
   * Localized short texts for the product.
   **/
  @ApiModelProperty(value = "Localized short texts for the product.")
  public List<SharedModelsLocalizableContent> getShortTexts() {
    return shortTexts;
  }
  public void setShortTexts(List<SharedModelsLocalizableContent> shortTexts) {
    this.shortTexts = shortTexts;
  }

  /**
   * Localized long texts for the product.
   **/
  @ApiModelProperty(value = "Localized long texts for the product.")
  public List<SharedModelsLocalizableContent> getLongTexts() {
    return longTexts;
  }
  public void setLongTexts(List<SharedModelsLocalizableContent> longTexts) {
    this.longTexts = longTexts;
  }

  /**
   * Localized tech texts for the product.
   **/
  @ApiModelProperty(value = "Localized tech texts for the product.")
  public List<SharedModelsLocalizableContent> getTechTexts() {
    return techTexts;
  }
  public void setTechTexts(List<SharedModelsLocalizableContent> techTexts) {
    this.techTexts = techTexts;
  }

  /**
   * The items belonging to the product.
   **/
  @ApiModelProperty(value = "The items belonging to the product.")
  public List<ProductModelsReadProductItem> getItems() {
    return items;
  }
  public void setItems(List<ProductModelsReadProductItem> items) {
    this.items = items;
  }

  /**
   * The current prices of the product.
   **/
  @ApiModelProperty(value = "The current prices of the product.")
  public List<PriceListModelsReadPriceListPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<PriceListModelsReadPriceListPrice> prices) {
    this.prices = prices;
  }

  /**
   * The categories the product belongs to.
   **/
  @ApiModelProperty(value = "The categories the product belongs to.")
  public List<CategoryModelsReadCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<CategoryModelsReadCategory> categories) {
    this.categories = categories;
  }

  /**
   * The images for the product
   **/
  @ApiModelProperty(value = "The images for the product")
  public List<ProductModelsReadImage> getImages() {
    return images;
  }
  public void setImages(List<ProductModelsReadImage> images) {
    this.images = images;
  }

  /**
   * The brand id of the product.
   **/
  @ApiModelProperty(value = "The brand id of the product.")
  public Integer getBrandId() {
    return brandId;
  }
  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  /**
   * The brand name of the product.
   **/
  @ApiModelProperty(value = "The brand name of the product.")
  public String getBrandName() {
    return brandName;
  }
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  /**
   * The supplier id of the product.
   **/
  @ApiModelProperty(value = "The supplier id of the product.")
  public Integer getSupplierId() {
    return supplierId;
  }
  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }

  /**
   * The supplier name of the product.
   **/
  @ApiModelProperty(value = "The supplier name of the product.")
  public String getSupplierName() {
    return supplierName;
  }
  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  /**
   * The parameter values associated with the product.
   **/
  @ApiModelProperty(value = "The parameter values associated with the product.")
  public List<ProductParameterModelsReadProductParameterValue> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<ProductParameterModelsReadProductParameterValue> parameterValues) {
    this.parameterValues = parameterValues;
  }

  /**
   * The variants for this product.
   **/
  @ApiModelProperty(value = "The variants for this product.")
  public List<VariantModelsReadVariant> getVariants() {
    return variants;
  }
  public void setVariants(List<VariantModelsReadVariant> variants) {
    this.variants = variants;
  }

  /**
   * The markets for this product
   **/
  @ApiModelProperty(value = "The markets for this product")
  public List<MarketModelsMarket> getMarkets() {
    return markets;
  }
  public void setMarkets(List<MarketModelsMarket> markets) {
    this.markets = markets;
  }

  /**
   * The vat percent for this product. Eg) 0.25 meaning 25% VAT.
   **/
  @ApiModelProperty(value = "The vat percent for this product. Eg) 0.25 meaning 25% VAT.")
  public Double getVat() {
    return vat;
  }
  public void setVat(Double vat) {
    this.vat = vat;
  }

  /**
   * The filename of this products primary image.
   **/
  @ApiModelProperty(value = "The filename of this products primary image.")
  public String getPrimaryImage() {
    return primaryImage;
  }
  public void setPrimaryImage(String primaryImage) {
    this.primaryImage = primaryImage;
  }

  /**
   * ID of freight class
   **/
  @ApiModelProperty(value = "ID of freight class")
  public Integer getFreightClassId() {
    return freightClassId;
  }
  public void setFreightClassId(Integer freightClassId) {
    this.freightClassId = freightClassId;
  }

  /**
   * Intrastat code of the product
   **/
  @ApiModelProperty(value = "Intrastat code of the product")
  public String getIntrastatCode() {
    return intrastatCode;
  }
  public void setIntrastatCode(String intrastatCode) {
    this.intrastatCode = intrastatCode;
  }

  /**
   * Country of orgin of product
   **/
  @ApiModelProperty(value = "Country of orgin of product")
  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }
  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  /**
   * ID of Variant Group to which the product is associated
   **/
  @ApiModelProperty(value = "ID of Variant Group to which the product is associated")
  public Integer getVariantGroupId() {
    return variantGroupId;
  }
  public void setVariantGroupId(Integer variantGroupId) {
    this.variantGroupId = variantGroupId;
  }

  /**
   * ID of Vat
   **/
  @ApiModelProperty(value = "ID of Vat")
  public Integer getVatId() {
    return vatId;
  }
  public void setVatId(Integer vatId) {
    this.vatId = vatId;
  }

  /**
   * External Id of the product.
   **/
  @ApiModelProperty(value = "External Id of the product.")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Activation date for the product.
   **/
  @ApiModelProperty(value = "Activation date for the product.")
  public Date getActivationDate() {
    return activationDate;
  }
  public void setActivationDate(Date activationDate) {
    this.activationDate = activationDate;
  }

  /**
   * The feeds the product is a member of
   **/
  @ApiModelProperty(value = "The feeds the product is a member of")
  public List<ProductModelsReadFeedMembership> getFeeds() {
    return feeds;
  }
  public void setFeeds(List<ProductModelsReadFeedMembership> feeds) {
    this.feeds = feeds;
  }

  /**
   * All canonical urls for the product
   **/
  @ApiModelProperty(value = "All canonical urls for the product")
  public List<ProductModelsReadProductUrl> getUrls() {
    return urls;
  }
  public void setUrls(List<ProductModelsReadProductUrl> urls) {
    this.urls = urls;
  }

  /**
   * The main category id for the product.
   **/
  @ApiModelProperty(value = "The main category id for the product.")
  public Integer getMainCategoryId() {
    return mainCategoryId;
  }
  public void setMainCategoryId(Integer mainCategoryId) {
    this.mainCategoryId = mainCategoryId;
  }

  /**
   * The related products for the product.
   **/
  @ApiModelProperty(value = "The related products for the product.")
  public List<ProductModelsReadRelatedProduct> getRelatedProducts() {
    return relatedProducts;
  }
  public void setRelatedProducts(List<ProductModelsReadRelatedProduct> relatedProducts) {
    this.relatedProducts = relatedProducts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductModelsReadProduct productModelsReadProduct = (ProductModelsReadProduct) o;
    return (this.productId == null ? productModelsReadProduct.productId == null : this.productId.equals(productModelsReadProduct.productId)) &&
        (this.articleNumber == null ? productModelsReadProduct.articleNumber == null : this.articleNumber.equals(productModelsReadProduct.articleNumber)) &&
        (this.names == null ? productModelsReadProduct.names == null : this.names.equals(productModelsReadProduct.names)) &&
        (this.dateCreated == null ? productModelsReadProduct.dateCreated == null : this.dateCreated.equals(productModelsReadProduct.dateCreated)) &&
        (this.dateUpdated == null ? productModelsReadProduct.dateUpdated == null : this.dateUpdated.equals(productModelsReadProduct.dateUpdated)) &&
        (this.active == null ? productModelsReadProduct.active == null : this.active.equals(productModelsReadProduct.active)) &&
        (this.purchasePrice == null ? productModelsReadProduct.purchasePrice == null : this.purchasePrice.equals(productModelsReadProduct.purchasePrice)) &&
        (this.purchasePriceCurrency == null ? productModelsReadProduct.purchasePriceCurrency == null : this.purchasePriceCurrency.equals(productModelsReadProduct.purchasePriceCurrency)) &&
        (this.shortTexts == null ? productModelsReadProduct.shortTexts == null : this.shortTexts.equals(productModelsReadProduct.shortTexts)) &&
        (this.longTexts == null ? productModelsReadProduct.longTexts == null : this.longTexts.equals(productModelsReadProduct.longTexts)) &&
        (this.techTexts == null ? productModelsReadProduct.techTexts == null : this.techTexts.equals(productModelsReadProduct.techTexts)) &&
        (this.items == null ? productModelsReadProduct.items == null : this.items.equals(productModelsReadProduct.items)) &&
        (this.prices == null ? productModelsReadProduct.prices == null : this.prices.equals(productModelsReadProduct.prices)) &&
        (this.categories == null ? productModelsReadProduct.categories == null : this.categories.equals(productModelsReadProduct.categories)) &&
        (this.images == null ? productModelsReadProduct.images == null : this.images.equals(productModelsReadProduct.images)) &&
        (this.brandId == null ? productModelsReadProduct.brandId == null : this.brandId.equals(productModelsReadProduct.brandId)) &&
        (this.brandName == null ? productModelsReadProduct.brandName == null : this.brandName.equals(productModelsReadProduct.brandName)) &&
        (this.supplierId == null ? productModelsReadProduct.supplierId == null : this.supplierId.equals(productModelsReadProduct.supplierId)) &&
        (this.supplierName == null ? productModelsReadProduct.supplierName == null : this.supplierName.equals(productModelsReadProduct.supplierName)) &&
        (this.parameterValues == null ? productModelsReadProduct.parameterValues == null : this.parameterValues.equals(productModelsReadProduct.parameterValues)) &&
        (this.variants == null ? productModelsReadProduct.variants == null : this.variants.equals(productModelsReadProduct.variants)) &&
        (this.markets == null ? productModelsReadProduct.markets == null : this.markets.equals(productModelsReadProduct.markets)) &&
        (this.vat == null ? productModelsReadProduct.vat == null : this.vat.equals(productModelsReadProduct.vat)) &&
        (this.primaryImage == null ? productModelsReadProduct.primaryImage == null : this.primaryImage.equals(productModelsReadProduct.primaryImage)) &&
        (this.freightClassId == null ? productModelsReadProduct.freightClassId == null : this.freightClassId.equals(productModelsReadProduct.freightClassId)) &&
        (this.intrastatCode == null ? productModelsReadProduct.intrastatCode == null : this.intrastatCode.equals(productModelsReadProduct.intrastatCode)) &&
        (this.countryOfOrigin == null ? productModelsReadProduct.countryOfOrigin == null : this.countryOfOrigin.equals(productModelsReadProduct.countryOfOrigin)) &&
        (this.variantGroupId == null ? productModelsReadProduct.variantGroupId == null : this.variantGroupId.equals(productModelsReadProduct.variantGroupId)) &&
        (this.vatId == null ? productModelsReadProduct.vatId == null : this.vatId.equals(productModelsReadProduct.vatId)) &&
        (this.externalId == null ? productModelsReadProduct.externalId == null : this.externalId.equals(productModelsReadProduct.externalId)) &&
        (this.activationDate == null ? productModelsReadProduct.activationDate == null : this.activationDate.equals(productModelsReadProduct.activationDate)) &&
        (this.feeds == null ? productModelsReadProduct.feeds == null : this.feeds.equals(productModelsReadProduct.feeds)) &&
        (this.urls == null ? productModelsReadProduct.urls == null : this.urls.equals(productModelsReadProduct.urls)) &&
        (this.mainCategoryId == null ? productModelsReadProduct.mainCategoryId == null : this.mainCategoryId.equals(productModelsReadProduct.mainCategoryId)) &&
        (this.relatedProducts == null ? productModelsReadProduct.relatedProducts == null : this.relatedProducts.equals(productModelsReadProduct.relatedProducts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.articleNumber == null ? 0: this.articleNumber.hashCode());
    result = 31 * result + (this.names == null ? 0: this.names.hashCode());
    result = 31 * result + (this.dateCreated == null ? 0: this.dateCreated.hashCode());
    result = 31 * result + (this.dateUpdated == null ? 0: this.dateUpdated.hashCode());
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.purchasePrice == null ? 0: this.purchasePrice.hashCode());
    result = 31 * result + (this.purchasePriceCurrency == null ? 0: this.purchasePriceCurrency.hashCode());
    result = 31 * result + (this.shortTexts == null ? 0: this.shortTexts.hashCode());
    result = 31 * result + (this.longTexts == null ? 0: this.longTexts.hashCode());
    result = 31 * result + (this.techTexts == null ? 0: this.techTexts.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    result = 31 * result + (this.prices == null ? 0: this.prices.hashCode());
    result = 31 * result + (this.categories == null ? 0: this.categories.hashCode());
    result = 31 * result + (this.images == null ? 0: this.images.hashCode());
    result = 31 * result + (this.brandId == null ? 0: this.brandId.hashCode());
    result = 31 * result + (this.brandName == null ? 0: this.brandName.hashCode());
    result = 31 * result + (this.supplierId == null ? 0: this.supplierId.hashCode());
    result = 31 * result + (this.supplierName == null ? 0: this.supplierName.hashCode());
    result = 31 * result + (this.parameterValues == null ? 0: this.parameterValues.hashCode());
    result = 31 * result + (this.variants == null ? 0: this.variants.hashCode());
    result = 31 * result + (this.markets == null ? 0: this.markets.hashCode());
    result = 31 * result + (this.vat == null ? 0: this.vat.hashCode());
    result = 31 * result + (this.primaryImage == null ? 0: this.primaryImage.hashCode());
    result = 31 * result + (this.freightClassId == null ? 0: this.freightClassId.hashCode());
    result = 31 * result + (this.intrastatCode == null ? 0: this.intrastatCode.hashCode());
    result = 31 * result + (this.countryOfOrigin == null ? 0: this.countryOfOrigin.hashCode());
    result = 31 * result + (this.variantGroupId == null ? 0: this.variantGroupId.hashCode());
    result = 31 * result + (this.vatId == null ? 0: this.vatId.hashCode());
    result = 31 * result + (this.externalId == null ? 0: this.externalId.hashCode());
    result = 31 * result + (this.activationDate == null ? 0: this.activationDate.hashCode());
    result = 31 * result + (this.feeds == null ? 0: this.feeds.hashCode());
    result = 31 * result + (this.urls == null ? 0: this.urls.hashCode());
    result = 31 * result + (this.mainCategoryId == null ? 0: this.mainCategoryId.hashCode());
    result = 31 * result + (this.relatedProducts == null ? 0: this.relatedProducts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductModelsReadProduct {\n");
    
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  articleNumber: ").append(articleNumber).append("\n");
    sb.append("  names: ").append(names).append("\n");
    sb.append("  dateCreated: ").append(dateCreated).append("\n");
    sb.append("  dateUpdated: ").append(dateUpdated).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  purchasePrice: ").append(purchasePrice).append("\n");
    sb.append("  purchasePriceCurrency: ").append(purchasePriceCurrency).append("\n");
    sb.append("  shortTexts: ").append(shortTexts).append("\n");
    sb.append("  longTexts: ").append(longTexts).append("\n");
    sb.append("  techTexts: ").append(techTexts).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  prices: ").append(prices).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("  brandId: ").append(brandId).append("\n");
    sb.append("  brandName: ").append(brandName).append("\n");
    sb.append("  supplierId: ").append(supplierId).append("\n");
    sb.append("  supplierName: ").append(supplierName).append("\n");
    sb.append("  parameterValues: ").append(parameterValues).append("\n");
    sb.append("  variants: ").append(variants).append("\n");
    sb.append("  markets: ").append(markets).append("\n");
    sb.append("  vat: ").append(vat).append("\n");
    sb.append("  primaryImage: ").append(primaryImage).append("\n");
    sb.append("  freightClassId: ").append(freightClassId).append("\n");
    sb.append("  intrastatCode: ").append(intrastatCode).append("\n");
    sb.append("  countryOfOrigin: ").append(countryOfOrigin).append("\n");
    sb.append("  variantGroupId: ").append(variantGroupId).append("\n");
    sb.append("  vatId: ").append(vatId).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  activationDate: ").append(activationDate).append("\n");
    sb.append("  feeds: ").append(feeds).append("\n");
    sb.append("  urls: ").append(urls).append("\n");
    sb.append("  mainCategoryId: ").append(mainCategoryId).append("\n");
    sb.append("  relatedProducts: ").append(relatedProducts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
