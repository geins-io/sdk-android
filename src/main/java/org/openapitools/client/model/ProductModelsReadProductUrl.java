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
 * A canonical product url for a specific market and language.
 **/
@ApiModel(description = "A canonical product url for a specific market and language.")
public class ProductModelsReadProductUrl {
  
  @SerializedName("Url")
  private String url = null;
  @SerializedName("Market")
  private Integer market = null;
  @SerializedName("Language")
  private String language = null;

  /**
   * The canonical url to the product.
   **/
  @ApiModelProperty(value = "The canonical url to the product.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The market of the url.
   **/
  @ApiModelProperty(value = "The market of the url.")
  public Integer getMarket() {
    return market;
  }
  public void setMarket(Integer market) {
    this.market = market;
  }

  /**
   * The language code of the url.
   **/
  @ApiModelProperty(value = "The language code of the url.")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductModelsReadProductUrl productModelsReadProductUrl = (ProductModelsReadProductUrl) o;
    return (this.url == null ? productModelsReadProductUrl.url == null : this.url.equals(productModelsReadProductUrl.url)) &&
        (this.market == null ? productModelsReadProductUrl.market == null : this.market.equals(productModelsReadProductUrl.market)) &&
        (this.language == null ? productModelsReadProductUrl.language == null : this.language.equals(productModelsReadProductUrl.language));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.market == null ? 0: this.market.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductModelsReadProductUrl {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  market: ").append(market).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}