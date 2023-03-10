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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WidgetRestrictionSetupWidgetRestrictionConfiguration {
  
  public enum ForcedResponsiveModeEnum {
     0,  1, 
  };
  @SerializedName("ForcedResponsiveMode")
  private ForcedResponsiveModeEnum forcedResponsiveMode = null;
  public enum List&lt;AllowedSizesEnum&gt; {
     1,  2,  3,  4,  5,  6, 
  };
  @SerializedName("AllowedSizes")
  private List<AllowedSizesEnum> allowedSizes = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ForcedResponsiveModeEnum getForcedResponsiveMode() {
    return forcedResponsiveMode;
  }
  public void setForcedResponsiveMode(ForcedResponsiveModeEnum forcedResponsiveMode) {
    this.forcedResponsiveMode = forcedResponsiveMode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AllowedSizesEnum> getAllowedSizes() {
    return allowedSizes;
  }
  public void setAllowedSizes(List<AllowedSizesEnum> allowedSizes) {
    this.allowedSizes = allowedSizes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetRestrictionSetupWidgetRestrictionConfiguration widgetRestrictionSetupWidgetRestrictionConfiguration = (WidgetRestrictionSetupWidgetRestrictionConfiguration) o;
    return (this.forcedResponsiveMode == null ? widgetRestrictionSetupWidgetRestrictionConfiguration.forcedResponsiveMode == null : this.forcedResponsiveMode.equals(widgetRestrictionSetupWidgetRestrictionConfiguration.forcedResponsiveMode)) &&
        (this.allowedSizes == null ? widgetRestrictionSetupWidgetRestrictionConfiguration.allowedSizes == null : this.allowedSizes.equals(widgetRestrictionSetupWidgetRestrictionConfiguration.allowedSizes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.forcedResponsiveMode == null ? 0: this.forcedResponsiveMode.hashCode());
    result = 31 * result + (this.allowedSizes == null ? 0: this.allowedSizes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetRestrictionSetupWidgetRestrictionConfiguration {\n");
    
    sb.append("  forcedResponsiveMode: ").append(forcedResponsiveMode).append("\n");
    sb.append("  allowedSizes: ").append(allowedSizes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
