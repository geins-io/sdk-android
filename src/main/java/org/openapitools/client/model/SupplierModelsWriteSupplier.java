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
 * A product supplier.
 **/
@ApiModel(description = "A product supplier.")
public class SupplierModelsWriteSupplier {
  
  @SerializedName("Name")
  private String name = null;
  @SerializedName("Address1")
  private String address1 = null;
  @SerializedName("Address2")
  private String address2 = null;
  @SerializedName("Address3")
  private String address3 = null;
  @SerializedName("ZipCode")
  private String zipCode = null;
  @SerializedName("Country")
  private String country = null;
  @SerializedName("ContactPerson")
  private String contactPerson = null;
  @SerializedName("Phone1")
  private String phone1 = null;
  @SerializedName("Phone2")
  private String phone2 = null;
  @SerializedName("Email")
  private String email = null;
  @SerializedName("ExternalId")
  private String externalId = null;

  /**
   * The name of the supplier.
   **/
  @ApiModelProperty(value = "The name of the supplier.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The first address line of the supplier.
   **/
  @ApiModelProperty(value = "The first address line of the supplier.")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second address line of the supplier.
   **/
  @ApiModelProperty(value = "The second address line of the supplier.")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The third address line of the supplier.
   **/
  @ApiModelProperty(value = "The third address line of the supplier.")
  public String getAddress3() {
    return address3;
  }
  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  /**
   * The zip code of the supplier.
   **/
  @ApiModelProperty(value = "The zip code of the supplier.")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  /**
   * The country of the supplier.
   **/
  @ApiModelProperty(value = "The country of the supplier.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The contact person of the supplier.
   **/
  @ApiModelProperty(value = "The contact person of the supplier.")
  public String getContactPerson() {
    return contactPerson;
  }
  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }

  /**
   * The primary phone number of the supplier.
   **/
  @ApiModelProperty(value = "The primary phone number of the supplier.")
  public String getPhone1() {
    return phone1;
  }
  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }

  /**
   * The secondary phone number of the supplier.
   **/
  @ApiModelProperty(value = "The secondary phone number of the supplier.")
  public String getPhone2() {
    return phone2;
  }
  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  /**
   * The email address of the supplier.
   **/
  @ApiModelProperty(value = "The email address of the supplier.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * External Id of the supplier.
   **/
  @ApiModelProperty(value = "External Id of the supplier.")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierModelsWriteSupplier supplierModelsWriteSupplier = (SupplierModelsWriteSupplier) o;
    return (this.name == null ? supplierModelsWriteSupplier.name == null : this.name.equals(supplierModelsWriteSupplier.name)) &&
        (this.address1 == null ? supplierModelsWriteSupplier.address1 == null : this.address1.equals(supplierModelsWriteSupplier.address1)) &&
        (this.address2 == null ? supplierModelsWriteSupplier.address2 == null : this.address2.equals(supplierModelsWriteSupplier.address2)) &&
        (this.address3 == null ? supplierModelsWriteSupplier.address3 == null : this.address3.equals(supplierModelsWriteSupplier.address3)) &&
        (this.zipCode == null ? supplierModelsWriteSupplier.zipCode == null : this.zipCode.equals(supplierModelsWriteSupplier.zipCode)) &&
        (this.country == null ? supplierModelsWriteSupplier.country == null : this.country.equals(supplierModelsWriteSupplier.country)) &&
        (this.contactPerson == null ? supplierModelsWriteSupplier.contactPerson == null : this.contactPerson.equals(supplierModelsWriteSupplier.contactPerson)) &&
        (this.phone1 == null ? supplierModelsWriteSupplier.phone1 == null : this.phone1.equals(supplierModelsWriteSupplier.phone1)) &&
        (this.phone2 == null ? supplierModelsWriteSupplier.phone2 == null : this.phone2.equals(supplierModelsWriteSupplier.phone2)) &&
        (this.email == null ? supplierModelsWriteSupplier.email == null : this.email.equals(supplierModelsWriteSupplier.email)) &&
        (this.externalId == null ? supplierModelsWriteSupplier.externalId == null : this.externalId.equals(supplierModelsWriteSupplier.externalId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.address1 == null ? 0: this.address1.hashCode());
    result = 31 * result + (this.address2 == null ? 0: this.address2.hashCode());
    result = 31 * result + (this.address3 == null ? 0: this.address3.hashCode());
    result = 31 * result + (this.zipCode == null ? 0: this.zipCode.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.contactPerson == null ? 0: this.contactPerson.hashCode());
    result = 31 * result + (this.phone1 == null ? 0: this.phone1.hashCode());
    result = 31 * result + (this.phone2 == null ? 0: this.phone2.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.externalId == null ? 0: this.externalId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierModelsWriteSupplier {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  address1: ").append(address1).append("\n");
    sb.append("  address2: ").append(address2).append("\n");
    sb.append("  address3: ").append(address3).append("\n");
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  contactPerson: ").append(contactPerson).append("\n");
    sb.append("  phone1: ").append(phone1).append("\n");
    sb.append("  phone2: ").append(phone2).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
