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
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A prroduct query.
 **/
@ApiModel(description = "A prroduct query.")
public class ProductModelsProductQuery {
  
  @SerializedName("UpdatedAfter")
  private Date updatedAfter = null;
  @SerializedName("ProductIds")
  private List<Integer> productIds = null;
  @SerializedName("ArticleNumbers")
  private List<String> articleNumbers = null;
  @SerializedName("OnlySellable")
  private Boolean onlySellable = null;
  @SerializedName("FeedId")
  private Integer feedId = null;
  @SerializedName("BatchId")
  private UUID batchId = null;

  /**
   * Limits query to products updated after the specified date.
   **/
  @ApiModelProperty(value = "Limits query to products updated after the specified date.")
  public Date getUpdatedAfter() {
    return updatedAfter;
  }
  public void setUpdatedAfter(Date updatedAfter) {
    this.updatedAfter = updatedAfter;
  }

  /**
   * Limits query to only include the supplied product ids.
   **/
  @ApiModelProperty(value = "Limits query to only include the supplied product ids.")
  public List<Integer> getProductIds() {
    return productIds;
  }
  public void setProductIds(List<Integer> productIds) {
    this.productIds = productIds;
  }

  /**
   * Limits query to only include products with supplied article numbers.
   **/
  @ApiModelProperty(value = "Limits query to only include products with supplied article numbers.")
  public List<String> getArticleNumbers() {
    return articleNumbers;
  }
  public void setArticleNumbers(List<String> articleNumbers) {
    this.articleNumbers = articleNumbers;
  }

  /**
   * Limits query to only include products that are available for purchase
   **/
  @ApiModelProperty(value = "Limits query to only include products that are available for purchase")
  public Boolean getOnlySellable() {
    return onlySellable;
  }
  public void setOnlySellable(Boolean onlySellable) {
    this.onlySellable = onlySellable;
  }

  /**
   * Limits query to only include products contained in the specified feed.
   **/
  @ApiModelProperty(value = "Limits query to only include products contained in the specified feed.")
  public Integer getFeedId() {
    return feedId;
  }
  public void setFeedId(Integer feedId) {
    this.feedId = feedId;
  }

  /**
   * Used to fetch products where the result set is split into batches
   **/
  @ApiModelProperty(value = "Used to fetch products where the result set is split into batches")
  public UUID getBatchId() {
    return batchId;
  }
  public void setBatchId(UUID batchId) {
    this.batchId = batchId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductModelsProductQuery productModelsProductQuery = (ProductModelsProductQuery) o;
    return (this.updatedAfter == null ? productModelsProductQuery.updatedAfter == null : this.updatedAfter.equals(productModelsProductQuery.updatedAfter)) &&
        (this.productIds == null ? productModelsProductQuery.productIds == null : this.productIds.equals(productModelsProductQuery.productIds)) &&
        (this.articleNumbers == null ? productModelsProductQuery.articleNumbers == null : this.articleNumbers.equals(productModelsProductQuery.articleNumbers)) &&
        (this.onlySellable == null ? productModelsProductQuery.onlySellable == null : this.onlySellable.equals(productModelsProductQuery.onlySellable)) &&
        (this.feedId == null ? productModelsProductQuery.feedId == null : this.feedId.equals(productModelsProductQuery.feedId)) &&
        (this.batchId == null ? productModelsProductQuery.batchId == null : this.batchId.equals(productModelsProductQuery.batchId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.updatedAfter == null ? 0: this.updatedAfter.hashCode());
    result = 31 * result + (this.productIds == null ? 0: this.productIds.hashCode());
    result = 31 * result + (this.articleNumbers == null ? 0: this.articleNumbers.hashCode());
    result = 31 * result + (this.onlySellable == null ? 0: this.onlySellable.hashCode());
    result = 31 * result + (this.feedId == null ? 0: this.feedId.hashCode());
    result = 31 * result + (this.batchId == null ? 0: this.batchId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductModelsProductQuery {\n");
    
    sb.append("  updatedAfter: ").append(updatedAfter).append("\n");
    sb.append("  productIds: ").append(productIds).append("\n");
    sb.append("  articleNumbers: ").append(articleNumbers).append("\n");
    sb.append("  onlySellable: ").append(onlySellable).append("\n");
    sb.append("  feedId: ").append(feedId).append("\n");
    sb.append("  batchId: ").append(batchId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
