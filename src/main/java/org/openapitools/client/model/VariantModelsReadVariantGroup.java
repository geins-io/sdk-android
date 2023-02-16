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
import org.openapitools.client.model.ProductModelsReadProduct;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A variant group for a collection of related variants.
 **/
@ApiModel(description = "A variant group for a collection of related variants.")
public class VariantModelsReadVariantGroup {
  
  @SerializedName("GroupId")
  private Integer groupId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("CollapseInLists")
  private Boolean collapseInLists = null;
  @SerializedName("MainProductId")
  private Integer mainProductId = null;
  @SerializedName("ProductIds")
  private List<Integer> productIds = null;
  @SerializedName("Products")
  private List<ProductModelsReadProduct> products = null;

  /**
   * The id of variant goup.
   **/
  @ApiModelProperty(value = "The id of variant goup.")
  public Integer getGroupId() {
    return groupId;
  }
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  /**
   * The optional internal name of the variant group.
   **/
  @ApiModelProperty(value = "The optional internal name of the variant group.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Determine visibility of non-main products of this group in lists.
   **/
  @ApiModelProperty(value = "Determine visibility of non-main products of this group in lists.")
  public Boolean getCollapseInLists() {
    return collapseInLists;
  }
  public void setCollapseInLists(Boolean collapseInLists) {
    this.collapseInLists = collapseInLists;
  }

  /**
   * The main product of this group. If the group is collapsed in lists, this will be the only visible product.
   **/
  @ApiModelProperty(value = "The main product of this group. If the group is collapsed in lists, this will be the only visible product.")
  public Integer getMainProductId() {
    return mainProductId;
  }
  public void setMainProductId(Integer mainProductId) {
    this.mainProductId = mainProductId;
  }

  /**
   * The product ids of the variants that belong to this group.
   **/
  @ApiModelProperty(value = "The product ids of the variants that belong to this group.")
  public List<Integer> getProductIds() {
    return productIds;
  }
  public void setProductIds(List<Integer> productIds) {
    this.productIds = productIds;
  }

  /**
   * Products belonging to the Variant group. Only included when parameter \"include\" is supplied in the query string
   **/
  @ApiModelProperty(value = "Products belonging to the Variant group. Only included when parameter \"include\" is supplied in the query string")
  public List<ProductModelsReadProduct> getProducts() {
    return products;
  }
  public void setProducts(List<ProductModelsReadProduct> products) {
    this.products = products;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantModelsReadVariantGroup variantModelsReadVariantGroup = (VariantModelsReadVariantGroup) o;
    return (this.groupId == null ? variantModelsReadVariantGroup.groupId == null : this.groupId.equals(variantModelsReadVariantGroup.groupId)) &&
        (this.name == null ? variantModelsReadVariantGroup.name == null : this.name.equals(variantModelsReadVariantGroup.name)) &&
        (this.collapseInLists == null ? variantModelsReadVariantGroup.collapseInLists == null : this.collapseInLists.equals(variantModelsReadVariantGroup.collapseInLists)) &&
        (this.mainProductId == null ? variantModelsReadVariantGroup.mainProductId == null : this.mainProductId.equals(variantModelsReadVariantGroup.mainProductId)) &&
        (this.productIds == null ? variantModelsReadVariantGroup.productIds == null : this.productIds.equals(variantModelsReadVariantGroup.productIds)) &&
        (this.products == null ? variantModelsReadVariantGroup.products == null : this.products.equals(variantModelsReadVariantGroup.products));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.collapseInLists == null ? 0: this.collapseInLists.hashCode());
    result = 31 * result + (this.mainProductId == null ? 0: this.mainProductId.hashCode());
    result = 31 * result + (this.productIds == null ? 0: this.productIds.hashCode());
    result = 31 * result + (this.products == null ? 0: this.products.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantModelsReadVariantGroup {\n");
    
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  collapseInLists: ").append(collapseInLists).append("\n");
    sb.append("  mainProductId: ").append(mainProductId).append("\n");
    sb.append("  productIds: ").append(productIds).append("\n");
    sb.append("  products: ").append(products).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}