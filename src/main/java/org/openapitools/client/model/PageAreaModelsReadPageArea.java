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
import org.openapitools.client.model.PageAreaModelsReadPageWidgetContainer;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The API-version of the PageArea class
 **/
@ApiModel(description = "The API-version of the PageArea class")
public class PageAreaModelsReadPageArea {
  
  @SerializedName("Index")
  private Integer index = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("FamilyId")
  private Integer familyId = null;
  @SerializedName("Settings")
  private String settings = null;
  @SerializedName("Containers")
  private List<PageAreaModelsReadPageWidgetContainer> containers = null;

  /**
   * The primary id of this page are family collection
   **/
  @ApiModelProperty(value = "The primary id of this page are family collection")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * A descriptive, user-defined name for this page area family collection
   **/
  @ApiModelProperty(value = "A descriptive, user-defined name for this page area family collection")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The family this area belongs to.
   **/
  @ApiModelProperty(value = "The family this area belongs to.")
  public Integer getFamilyId() {
    return familyId;
  }
  public void setFamilyId(Integer familyId) {
    this.familyId = familyId;
  }

  /**
   * The settings that determine how containers can be added to this area.
   **/
  @ApiModelProperty(value = "The settings that determine how containers can be added to this area.")
  public String getSettings() {
    return settings;
  }
  public void setSettings(String settings) {
    this.settings = settings;
  }

  /**
   * The containers in this area
   **/
  @ApiModelProperty(value = "The containers in this area")
  public List<PageAreaModelsReadPageWidgetContainer> getContainers() {
    return containers;
  }
  public void setContainers(List<PageAreaModelsReadPageWidgetContainer> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageAreaModelsReadPageArea pageAreaModelsReadPageArea = (PageAreaModelsReadPageArea) o;
    return (this.index == null ? pageAreaModelsReadPageArea.index == null : this.index.equals(pageAreaModelsReadPageArea.index)) &&
        (this.name == null ? pageAreaModelsReadPageArea.name == null : this.name.equals(pageAreaModelsReadPageArea.name)) &&
        (this.familyId == null ? pageAreaModelsReadPageArea.familyId == null : this.familyId.equals(pageAreaModelsReadPageArea.familyId)) &&
        (this.settings == null ? pageAreaModelsReadPageArea.settings == null : this.settings.equals(pageAreaModelsReadPageArea.settings)) &&
        (this.containers == null ? pageAreaModelsReadPageArea.containers == null : this.containers.equals(pageAreaModelsReadPageArea.containers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.familyId == null ? 0: this.familyId.hashCode());
    result = 31 * result + (this.settings == null ? 0: this.settings.hashCode());
    result = 31 * result + (this.containers == null ? 0: this.containers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageAreaModelsReadPageArea {\n");
    
    sb.append("  index: ").append(index).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  familyId: ").append(familyId).append("\n");
    sb.append("  settings: ").append(settings).append("\n");
    sb.append("  containers: ").append(containers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
