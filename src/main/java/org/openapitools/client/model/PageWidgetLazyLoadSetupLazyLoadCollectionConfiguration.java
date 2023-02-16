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
public class PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration {
  
  @SerializedName("CollectionName")
  private String collectionName = null;
  @SerializedName("EnableLazyloadMobile")
  private Boolean enableLazyloadMobile = null;
  @SerializedName("EagerLoadStepsMobile")
  private Integer eagerLoadStepsMobile = null;
  @SerializedName("EnableLazyloadDesktop")
  private Boolean enableLazyloadDesktop = null;
  @SerializedName("EagerLoadStepsDesktop")
  private Integer eagerLoadStepsDesktop = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCollectionName() {
    return collectionName;
  }
  public void setCollectionName(String collectionName) {
    this.collectionName = collectionName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnableLazyloadMobile() {
    return enableLazyloadMobile;
  }
  public void setEnableLazyloadMobile(Boolean enableLazyloadMobile) {
    this.enableLazyloadMobile = enableLazyloadMobile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEagerLoadStepsMobile() {
    return eagerLoadStepsMobile;
  }
  public void setEagerLoadStepsMobile(Integer eagerLoadStepsMobile) {
    this.eagerLoadStepsMobile = eagerLoadStepsMobile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnableLazyloadDesktop() {
    return enableLazyloadDesktop;
  }
  public void setEnableLazyloadDesktop(Boolean enableLazyloadDesktop) {
    this.enableLazyloadDesktop = enableLazyloadDesktop;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEagerLoadStepsDesktop() {
    return eagerLoadStepsDesktop;
  }
  public void setEagerLoadStepsDesktop(Integer eagerLoadStepsDesktop) {
    this.eagerLoadStepsDesktop = eagerLoadStepsDesktop;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration = (PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration) o;
    return (this.collectionName == null ? pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.collectionName == null : this.collectionName.equals(pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.collectionName)) &&
        (this.enableLazyloadMobile == null ? pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.enableLazyloadMobile == null : this.enableLazyloadMobile.equals(pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.enableLazyloadMobile)) &&
        (this.eagerLoadStepsMobile == null ? pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.eagerLoadStepsMobile == null : this.eagerLoadStepsMobile.equals(pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.eagerLoadStepsMobile)) &&
        (this.enableLazyloadDesktop == null ? pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.enableLazyloadDesktop == null : this.enableLazyloadDesktop.equals(pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.enableLazyloadDesktop)) &&
        (this.eagerLoadStepsDesktop == null ? pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.eagerLoadStepsDesktop == null : this.eagerLoadStepsDesktop.equals(pageWidgetLazyLoadSetupLazyLoadCollectionConfiguration.eagerLoadStepsDesktop));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.collectionName == null ? 0: this.collectionName.hashCode());
    result = 31 * result + (this.enableLazyloadMobile == null ? 0: this.enableLazyloadMobile.hashCode());
    result = 31 * result + (this.eagerLoadStepsMobile == null ? 0: this.eagerLoadStepsMobile.hashCode());
    result = 31 * result + (this.enableLazyloadDesktop == null ? 0: this.enableLazyloadDesktop.hashCode());
    result = 31 * result + (this.eagerLoadStepsDesktop == null ? 0: this.eagerLoadStepsDesktop.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageWidgetLazyLoadSetupLazyLoadCollectionConfiguration {\n");
    
    sb.append("  collectionName: ").append(collectionName).append("\n");
    sb.append("  enableLazyloadMobile: ").append(enableLazyloadMobile).append("\n");
    sb.append("  eagerLoadStepsMobile: ").append(eagerLoadStepsMobile).append("\n");
    sb.append("  enableLazyloadDesktop: ").append(enableLazyloadDesktop).append("\n");
    sb.append("  eagerLoadStepsDesktop: ").append(eagerLoadStepsDesktop).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
