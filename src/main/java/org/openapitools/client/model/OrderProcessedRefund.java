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

import java.util.Date;
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderProcessedRefund {
  
  @SerializedName("RefundId")
  private UUID refundId = null;
  @SerializedName("ExternalId")
  private String externalId = null;
  @SerializedName("Reference")
  private String reference = null;
  @SerializedName("ProcessedOn")
  private Date processedOn = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getRefundId() {
    return refundId;
  }
  public void setRefundId(UUID refundId) {
    this.refundId = refundId;
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
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getProcessedOn() {
    return processedOn;
  }
  public void setProcessedOn(Date processedOn) {
    this.processedOn = processedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderProcessedRefund orderProcessedRefund = (OrderProcessedRefund) o;
    return (this.refundId == null ? orderProcessedRefund.refundId == null : this.refundId.equals(orderProcessedRefund.refundId)) &&
        (this.externalId == null ? orderProcessedRefund.externalId == null : this.externalId.equals(orderProcessedRefund.externalId)) &&
        (this.reference == null ? orderProcessedRefund.reference == null : this.reference.equals(orderProcessedRefund.reference)) &&
        (this.processedOn == null ? orderProcessedRefund.processedOn == null : this.processedOn.equals(orderProcessedRefund.processedOn));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.refundId == null ? 0: this.refundId.hashCode());
    result = 31 * result + (this.externalId == null ? 0: this.externalId.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    result = 31 * result + (this.processedOn == null ? 0: this.processedOn.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderProcessedRefund {\n");
    
    sb.append("  refundId: ").append(refundId).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  processedOn: ").append(processedOn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}