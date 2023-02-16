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
import org.openapitools.client.model.PageAreaModelsReadPageAreaFamily;
import org.openapitools.client.model.PageResult;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An envelope for the result of and action taken on a resource.
 **/
@ApiModel(description = "An envelope for the result of and action taken on a resource.")
public class EnvelopePageAreaModelsReadPageAreaFamily {
  
  @SerializedName("Message")
  private String message = null;
  @SerializedName("Details")
  private List<String> details = null;
  @SerializedName("Resource")
  private PageAreaModelsReadPageAreaFamily resource = null;
  @SerializedName("PageResult")
  private PageResult pageResult = null;

  /**
   * A status message for the action taken.
   **/
  @ApiModelProperty(value = "A status message for the action taken.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Any validation messages for the data on the current action.
   **/
  @ApiModelProperty(value = "Any validation messages for the data on the current action.")
  public List<String> getDetails() {
    return details;
  }
  public void setDetails(List<String> details) {
    this.details = details;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PageAreaModelsReadPageAreaFamily getResource() {
    return resource;
  }
  public void setResource(PageAreaModelsReadPageAreaFamily resource) {
    this.resource = resource;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PageResult getPageResult() {
    return pageResult;
  }
  public void setPageResult(PageResult pageResult) {
    this.pageResult = pageResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopePageAreaModelsReadPageAreaFamily envelopePageAreaModelsReadPageAreaFamily = (EnvelopePageAreaModelsReadPageAreaFamily) o;
    return (this.message == null ? envelopePageAreaModelsReadPageAreaFamily.message == null : this.message.equals(envelopePageAreaModelsReadPageAreaFamily.message)) &&
        (this.details == null ? envelopePageAreaModelsReadPageAreaFamily.details == null : this.details.equals(envelopePageAreaModelsReadPageAreaFamily.details)) &&
        (this.resource == null ? envelopePageAreaModelsReadPageAreaFamily.resource == null : this.resource.equals(envelopePageAreaModelsReadPageAreaFamily.resource)) &&
        (this.pageResult == null ? envelopePageAreaModelsReadPageAreaFamily.pageResult == null : this.pageResult.equals(envelopePageAreaModelsReadPageAreaFamily.pageResult));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.resource == null ? 0: this.resource.hashCode());
    result = 31 * result + (this.pageResult == null ? 0: this.pageResult.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePageAreaModelsReadPageAreaFamily {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  resource: ").append(resource).append("\n");
    sb.append("  pageResult: ").append(pageResult).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
