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
public class APIOrderOrderComment {
  
  @SerializedName("OrderId")
  private Integer orderId = null;
  @SerializedName("Comment")
  private String comment = null;
  @SerializedName("System")
  private Boolean system = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrderId() {
    return orderId;
  }
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSystem() {
    return system;
  }
  public void setSystem(Boolean system) {
    this.system = system;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIOrderOrderComment aPIOrderOrderComment = (APIOrderOrderComment) o;
    return (this.orderId == null ? aPIOrderOrderComment.orderId == null : this.orderId.equals(aPIOrderOrderComment.orderId)) &&
        (this.comment == null ? aPIOrderOrderComment.comment == null : this.comment.equals(aPIOrderOrderComment.comment)) &&
        (this.system == null ? aPIOrderOrderComment.system == null : this.system.equals(aPIOrderOrderComment.system));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.comment == null ? 0: this.comment.hashCode());
    result = 31 * result + (this.system == null ? 0: this.system.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOrderOrderComment {\n");
    
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  system: ").append(system).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}