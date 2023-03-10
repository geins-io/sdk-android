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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A price for a product on a specific price list.
 **/
@ApiModel(description = "A price for a product on a specific price list.")
public class PriceListModelsWritePriceListPrice {
  
  @SerializedName("PriceListId")
  private Integer priceListId = null;
  @SerializedName("Price")
  private Double price = null;
  @SerializedName("ProductId")
  private String productId = null;
  @SerializedName("Currency")
  private String currency = null;
  @SerializedName("StaggeredCount")
  private Integer staggeredCount = null;

  /**
   * The price list id.
   **/
  @ApiModelProperty(value = "The price list id.")
  public Integer getPriceListId() {
    return priceListId;
  }
  public void setPriceListId(Integer priceListId) {
    this.priceListId = priceListId;
  }

  /**
   * The price in the currency of the associated price list.
   **/
  @ApiModelProperty(value = "The price in the currency of the associated price list.")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * The id of the product that this price applies to.
   **/
  @ApiModelProperty(value = "The id of the product that this price applies to.")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The 3-letter ISO 4217 currency code for this price. If ommitted the price will be updated on the default market.
   **/
  @ApiModelProperty(value = "The 3-letter ISO 4217 currency code for this price. If ommitted the price will be updated on the default market.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Staggered count for this price. Defaults to 1.
   **/
  @ApiModelProperty(value = "Staggered count for this price. Defaults to 1.")
  public Integer getStaggeredCount() {
    return staggeredCount;
  }
  public void setStaggeredCount(Integer staggeredCount) {
    this.staggeredCount = staggeredCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceListModelsWritePriceListPrice priceListModelsWritePriceListPrice = (PriceListModelsWritePriceListPrice) o;
    return (this.priceListId == null ? priceListModelsWritePriceListPrice.priceListId == null : this.priceListId.equals(priceListModelsWritePriceListPrice.priceListId)) &&
        (this.price == null ? priceListModelsWritePriceListPrice.price == null : this.price.equals(priceListModelsWritePriceListPrice.price)) &&
        (this.productId == null ? priceListModelsWritePriceListPrice.productId == null : this.productId.equals(priceListModelsWritePriceListPrice.productId)) &&
        (this.currency == null ? priceListModelsWritePriceListPrice.currency == null : this.currency.equals(priceListModelsWritePriceListPrice.currency)) &&
        (this.staggeredCount == null ? priceListModelsWritePriceListPrice.staggeredCount == null : this.staggeredCount.equals(priceListModelsWritePriceListPrice.staggeredCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.priceListId == null ? 0: this.priceListId.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.productId == null ? 0: this.productId.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.staggeredCount == null ? 0: this.staggeredCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceListModelsWritePriceListPrice {\n");
    
    sb.append("  priceListId: ").append(priceListId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  staggeredCount: ").append(staggeredCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
