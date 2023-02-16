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
import org.openapitools.client.model.OrderValidateOrderCreationRequestStockItem;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderValidateOrderCreationRequest {
  
  @SerializedName("OrderId")
  private Integer orderId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("Email")
  private String email = null;
  @SerializedName("Phone")
  private String phone = null;
  @SerializedName("Currency")
  private String currency = null;
  @SerializedName("SumIncVat")
  private Double sumIncVat = null;
  @SerializedName("BalanceIncVat")
  private Double balanceIncVat = null;
  @SerializedName("Items")
  private List<OrderValidateOrderCreationRequestStockItem> items = null;

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
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSumIncVat() {
    return sumIncVat;
  }
  public void setSumIncVat(Double sumIncVat) {
    this.sumIncVat = sumIncVat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBalanceIncVat() {
    return balanceIncVat;
  }
  public void setBalanceIncVat(Double balanceIncVat) {
    this.balanceIncVat = balanceIncVat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<OrderValidateOrderCreationRequestStockItem> getItems() {
    return items;
  }
  public void setItems(List<OrderValidateOrderCreationRequestStockItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderValidateOrderCreationRequest orderValidateOrderCreationRequest = (OrderValidateOrderCreationRequest) o;
    return (this.orderId == null ? orderValidateOrderCreationRequest.orderId == null : this.orderId.equals(orderValidateOrderCreationRequest.orderId)) &&
        (this.userId == null ? orderValidateOrderCreationRequest.userId == null : this.userId.equals(orderValidateOrderCreationRequest.userId)) &&
        (this.email == null ? orderValidateOrderCreationRequest.email == null : this.email.equals(orderValidateOrderCreationRequest.email)) &&
        (this.phone == null ? orderValidateOrderCreationRequest.phone == null : this.phone.equals(orderValidateOrderCreationRequest.phone)) &&
        (this.currency == null ? orderValidateOrderCreationRequest.currency == null : this.currency.equals(orderValidateOrderCreationRequest.currency)) &&
        (this.sumIncVat == null ? orderValidateOrderCreationRequest.sumIncVat == null : this.sumIncVat.equals(orderValidateOrderCreationRequest.sumIncVat)) &&
        (this.balanceIncVat == null ? orderValidateOrderCreationRequest.balanceIncVat == null : this.balanceIncVat.equals(orderValidateOrderCreationRequest.balanceIncVat)) &&
        (this.items == null ? orderValidateOrderCreationRequest.items == null : this.items.equals(orderValidateOrderCreationRequest.items));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.sumIncVat == null ? 0: this.sumIncVat.hashCode());
    result = 31 * result + (this.balanceIncVat == null ? 0: this.balanceIncVat.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderValidateOrderCreationRequest {\n");
    
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  sumIncVat: ").append(sumIncVat).append("\n");
    sb.append("  balanceIncVat: ").append(balanceIncVat).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
