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
import org.openapitools.client.model.SharedModelsLocalizableContent;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An existing product parameter group.
 **/
@ApiModel(description = "An existing product parameter group.")
public class ProductParameterModelsReadProductParameterGroup {
  
  @SerializedName("GroupId")
  private Integer groupId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("LocalizedNames")
  private List<SharedModelsLocalizableContent> localizedNames = null;
  @SerializedName("ParameterIds")
  private List<Integer> parameterIds = null;

  /**
   * The unique identifier for the groups.
   **/
  @ApiModelProperty(value = "The unique identifier for the groups.")
  public Integer getGroupId() {
    return groupId;
  }
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  /**
   * The non-localized name of the group.
   **/
  @ApiModelProperty(value = "The non-localized name of the group.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The localized names of the group.
   **/
  @ApiModelProperty(value = "The localized names of the group.")
  public List<SharedModelsLocalizableContent> getLocalizedNames() {
    return localizedNames;
  }
  public void setLocalizedNames(List<SharedModelsLocalizableContent> localizedNames) {
    this.localizedNames = localizedNames;
  }

  /**
   * The ids of the parameters belonging to this group.
   **/
  @ApiModelProperty(value = "The ids of the parameters belonging to this group.")
  public List<Integer> getParameterIds() {
    return parameterIds;
  }
  public void setParameterIds(List<Integer> parameterIds) {
    this.parameterIds = parameterIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductParameterModelsReadProductParameterGroup productParameterModelsReadProductParameterGroup = (ProductParameterModelsReadProductParameterGroup) o;
    return (this.groupId == null ? productParameterModelsReadProductParameterGroup.groupId == null : this.groupId.equals(productParameterModelsReadProductParameterGroup.groupId)) &&
        (this.name == null ? productParameterModelsReadProductParameterGroup.name == null : this.name.equals(productParameterModelsReadProductParameterGroup.name)) &&
        (this.localizedNames == null ? productParameterModelsReadProductParameterGroup.localizedNames == null : this.localizedNames.equals(productParameterModelsReadProductParameterGroup.localizedNames)) &&
        (this.parameterIds == null ? productParameterModelsReadProductParameterGroup.parameterIds == null : this.parameterIds.equals(productParameterModelsReadProductParameterGroup.parameterIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.localizedNames == null ? 0: this.localizedNames.hashCode());
    result = 31 * result + (this.parameterIds == null ? 0: this.parameterIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductParameterModelsReadProductParameterGroup {\n");
    
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  localizedNames: ").append(localizedNames).append("\n");
    sb.append("  parameterIds: ").append(parameterIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
