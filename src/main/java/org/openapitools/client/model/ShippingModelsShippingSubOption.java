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

@ApiModel(description = "")
public class ShippingModelsShippingSubOption {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("ExternalId")
  private String externalId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Fee")
  private Double fee = null;
  @SerializedName("Logo")
  private String logo = null;
  @SerializedName("ShippingData")
  private String shippingData = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFee() {
    return fee;
  }
  public void setFee(Double fee) {
    this.fee = fee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getShippingData() {
    return shippingData;
  }
  public void setShippingData(String shippingData) {
    this.shippingData = shippingData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingModelsShippingSubOption shippingModelsShippingSubOption = (ShippingModelsShippingSubOption) o;
    return (this.id == null ? shippingModelsShippingSubOption.id == null : this.id.equals(shippingModelsShippingSubOption.id)) &&
        (this.externalId == null ? shippingModelsShippingSubOption.externalId == null : this.externalId.equals(shippingModelsShippingSubOption.externalId)) &&
        (this.name == null ? shippingModelsShippingSubOption.name == null : this.name.equals(shippingModelsShippingSubOption.name)) &&
        (this.fee == null ? shippingModelsShippingSubOption.fee == null : this.fee.equals(shippingModelsShippingSubOption.fee)) &&
        (this.logo == null ? shippingModelsShippingSubOption.logo == null : this.logo.equals(shippingModelsShippingSubOption.logo)) &&
        (this.shippingData == null ? shippingModelsShippingSubOption.shippingData == null : this.shippingData.equals(shippingModelsShippingSubOption.shippingData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.externalId == null ? 0: this.externalId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.fee == null ? 0: this.fee.hashCode());
    result = 31 * result + (this.logo == null ? 0: this.logo.hashCode());
    result = 31 * result + (this.shippingData == null ? 0: this.shippingData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingModelsShippingSubOption {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  fee: ").append(fee).append("\n");
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  shippingData: ").append(shippingData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}