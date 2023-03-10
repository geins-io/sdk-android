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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Data carrying class for order queries
 **/
@ApiModel(description = "Data carrying class for order queries")
public class OrderModelsOrderQuery {
  
  @SerializedName("Updated")
  private Date updated = null;
  @SerializedName("StatusList")
  private String statusList = null;
  @SerializedName("MarketId")
  private Integer marketId = null;
  @SerializedName("PaymentName")
  private String paymentName = null;
  @SerializedName("ParcelGroupId")
  private Integer parcelGroupId = null;
  @SerializedName("CustomerId")
  private Integer customerId = null;
  @SerializedName("Email")
  private String email = null;
  @SerializedName("Include")
  private String include = null;
  @SerializedName("ExternalOrderStatus")
  private Integer externalOrderStatus = null;
  @SerializedName("CombineProductContainerRows")
  private Boolean combineProductContainerRows = null;
  @SerializedName("PackingLocationId")
  private Integer packingLocationId = null;

  /**
   * Given a date, only orders updated after the provided date will be returned.
   **/
  @ApiModelProperty(value = "Given a date, only orders updated after the provided date will be returned.")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  /**
   * Comma separated list of statuses to filter on.
   **/
  @ApiModelProperty(value = "Comma separated list of statuses to filter on.")
  public String getStatusList() {
    return statusList;
  }
  public void setStatusList(String statusList) {
    this.statusList = statusList;
  }

  /**
   * Id of a market.
   **/
  @ApiModelProperty(value = "Id of a market.")
  public Integer getMarketId() {
    return marketId;
  }
  public void setMarketId(Integer marketId) {
    this.marketId = marketId;
  }

  /**
   * Name of a payment method
   **/
  @ApiModelProperty(value = "Name of a payment method")
  public String getPaymentName() {
    return paymentName;
  }
  public void setPaymentName(String paymentName) {
    this.paymentName = paymentName;
  }

  /**
   * Id of a parcel group.
   **/
  @ApiModelProperty(value = "Id of a parcel group.")
  public Integer getParcelGroupId() {
    return parcelGroupId;
  }
  public void setParcelGroupId(Integer parcelGroupId) {
    this.parcelGroupId = parcelGroupId;
  }

  /**
   * The ID of a customer
   **/
  @ApiModelProperty(value = "The ID of a customer")
  public Integer getCustomerId() {
    return customerId;
  }
  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  /**
   * The email of a customer
   **/
  @ApiModelProperty(value = "The email of a customer")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Comma separated list of child-collections to also include in the query result.
   **/
  @ApiModelProperty(value = "Comma separated list of child-collections to also include in the query result.")
  public String getInclude() {
    return include;
  }
  public void setInclude(String include) {
    this.include = include;
  }

  /**
   * This status can be used by external systems to change the status of an order. Such as failed or done.
   **/
  @ApiModelProperty(value = "This status can be used by external systems to change the status of an order. Such as failed or done.")
  public Integer getExternalOrderStatus() {
    return externalOrderStatus;
  }
  public void setExternalOrderStatus(Integer externalOrderStatus) {
    this.externalOrderStatus = externalOrderStatus;
  }

  /**
   * If true, will combine all order rows that are part of a container into a single container row.
   **/
  @ApiModelProperty(value = "If true, will combine all order rows that are part of a container into a single container row.")
  public Boolean getCombineProductContainerRows() {
    return combineProductContainerRows;
  }
  public void setCombineProductContainerRows(Boolean combineProductContainerRows) {
    this.combineProductContainerRows = combineProductContainerRows;
  }

  /**
   * The packing place to get orders from.
   **/
  @ApiModelProperty(value = "The packing place to get orders from.")
  public Integer getPackingLocationId() {
    return packingLocationId;
  }
  public void setPackingLocationId(Integer packingLocationId) {
    this.packingLocationId = packingLocationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModelsOrderQuery orderModelsOrderQuery = (OrderModelsOrderQuery) o;
    return (this.updated == null ? orderModelsOrderQuery.updated == null : this.updated.equals(orderModelsOrderQuery.updated)) &&
        (this.statusList == null ? orderModelsOrderQuery.statusList == null : this.statusList.equals(orderModelsOrderQuery.statusList)) &&
        (this.marketId == null ? orderModelsOrderQuery.marketId == null : this.marketId.equals(orderModelsOrderQuery.marketId)) &&
        (this.paymentName == null ? orderModelsOrderQuery.paymentName == null : this.paymentName.equals(orderModelsOrderQuery.paymentName)) &&
        (this.parcelGroupId == null ? orderModelsOrderQuery.parcelGroupId == null : this.parcelGroupId.equals(orderModelsOrderQuery.parcelGroupId)) &&
        (this.customerId == null ? orderModelsOrderQuery.customerId == null : this.customerId.equals(orderModelsOrderQuery.customerId)) &&
        (this.email == null ? orderModelsOrderQuery.email == null : this.email.equals(orderModelsOrderQuery.email)) &&
        (this.include == null ? orderModelsOrderQuery.include == null : this.include.equals(orderModelsOrderQuery.include)) &&
        (this.externalOrderStatus == null ? orderModelsOrderQuery.externalOrderStatus == null : this.externalOrderStatus.equals(orderModelsOrderQuery.externalOrderStatus)) &&
        (this.combineProductContainerRows == null ? orderModelsOrderQuery.combineProductContainerRows == null : this.combineProductContainerRows.equals(orderModelsOrderQuery.combineProductContainerRows)) &&
        (this.packingLocationId == null ? orderModelsOrderQuery.packingLocationId == null : this.packingLocationId.equals(orderModelsOrderQuery.packingLocationId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    result = 31 * result + (this.statusList == null ? 0: this.statusList.hashCode());
    result = 31 * result + (this.marketId == null ? 0: this.marketId.hashCode());
    result = 31 * result + (this.paymentName == null ? 0: this.paymentName.hashCode());
    result = 31 * result + (this.parcelGroupId == null ? 0: this.parcelGroupId.hashCode());
    result = 31 * result + (this.customerId == null ? 0: this.customerId.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.include == null ? 0: this.include.hashCode());
    result = 31 * result + (this.externalOrderStatus == null ? 0: this.externalOrderStatus.hashCode());
    result = 31 * result + (this.combineProductContainerRows == null ? 0: this.combineProductContainerRows.hashCode());
    result = 31 * result + (this.packingLocationId == null ? 0: this.packingLocationId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModelsOrderQuery {\n");
    
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  statusList: ").append(statusList).append("\n");
    sb.append("  marketId: ").append(marketId).append("\n");
    sb.append("  paymentName: ").append(paymentName).append("\n");
    sb.append("  parcelGroupId: ").append(parcelGroupId).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  include: ").append(include).append("\n");
    sb.append("  externalOrderStatus: ").append(externalOrderStatus).append("\n");
    sb.append("  combineProductContainerRows: ").append(combineProductContainerRows).append("\n");
    sb.append("  packingLocationId: ").append(packingLocationId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
