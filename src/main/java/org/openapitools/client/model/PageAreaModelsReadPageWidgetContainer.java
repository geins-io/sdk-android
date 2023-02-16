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
import org.openapitools.client.model.PageAreaModelsReadPageWidget;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a collection of widgets, and defines how they should be layouted in the area they are rendered in.
 **/
@ApiModel(description = "This class represents a collection of widgets, and defines how they should be layouted in the area they are rendered in.")
public class PageAreaModelsReadPageWidgetContainer {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("ClassNames")
  private List<String> classNames = null;
  @SerializedName("Active")
  private Boolean active = null;
  @SerializedName("Layout")
  private String layout = null;
  @SerializedName("ResponsiveMode")
  private String responsiveMode = null;
  @SerializedName("Visibility")
  private String visibility = null;
  @SerializedName("Design")
  private String design = null;
  @SerializedName("Widgets")
  private List<PageAreaModelsReadPageWidget> widgets = null;

  /**
   * The primary ID of this container
   **/
  @ApiModelProperty(value = "The primary ID of this container")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The descriptive user defined name of this container, which is used to distinguish this container in a container library
   **/
  @ApiModelProperty(value = "The descriptive user defined name of this container, which is used to distinguish this container in a container library")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The CSS class names this container should use.
   **/
  @ApiModelProperty(value = "The CSS class names this container should use.")
  public List<String> getClassNames() {
    return classNames;
  }
  public void setClassNames(List<String> classNames) {
    this.classNames = classNames;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLayout() {
    return layout;
  }
  public void setLayout(String layout) {
    this.layout = layout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResponsiveMode() {
    return responsiveMode;
  }
  public void setResponsiveMode(String responsiveMode) {
    this.responsiveMode = responsiveMode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDesign() {
    return design;
  }
  public void setDesign(String design) {
    this.design = design;
  }

  /**
   * The configured widgets held by this container
   **/
  @ApiModelProperty(value = "The configured widgets held by this container")
  public List<PageAreaModelsReadPageWidget> getWidgets() {
    return widgets;
  }
  public void setWidgets(List<PageAreaModelsReadPageWidget> widgets) {
    this.widgets = widgets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageAreaModelsReadPageWidgetContainer pageAreaModelsReadPageWidgetContainer = (PageAreaModelsReadPageWidgetContainer) o;
    return (this.id == null ? pageAreaModelsReadPageWidgetContainer.id == null : this.id.equals(pageAreaModelsReadPageWidgetContainer.id)) &&
        (this.name == null ? pageAreaModelsReadPageWidgetContainer.name == null : this.name.equals(pageAreaModelsReadPageWidgetContainer.name)) &&
        (this.classNames == null ? pageAreaModelsReadPageWidgetContainer.classNames == null : this.classNames.equals(pageAreaModelsReadPageWidgetContainer.classNames)) &&
        (this.active == null ? pageAreaModelsReadPageWidgetContainer.active == null : this.active.equals(pageAreaModelsReadPageWidgetContainer.active)) &&
        (this.layout == null ? pageAreaModelsReadPageWidgetContainer.layout == null : this.layout.equals(pageAreaModelsReadPageWidgetContainer.layout)) &&
        (this.responsiveMode == null ? pageAreaModelsReadPageWidgetContainer.responsiveMode == null : this.responsiveMode.equals(pageAreaModelsReadPageWidgetContainer.responsiveMode)) &&
        (this.visibility == null ? pageAreaModelsReadPageWidgetContainer.visibility == null : this.visibility.equals(pageAreaModelsReadPageWidgetContainer.visibility)) &&
        (this.design == null ? pageAreaModelsReadPageWidgetContainer.design == null : this.design.equals(pageAreaModelsReadPageWidgetContainer.design)) &&
        (this.widgets == null ? pageAreaModelsReadPageWidgetContainer.widgets == null : this.widgets.equals(pageAreaModelsReadPageWidgetContainer.widgets));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.classNames == null ? 0: this.classNames.hashCode());
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.layout == null ? 0: this.layout.hashCode());
    result = 31 * result + (this.responsiveMode == null ? 0: this.responsiveMode.hashCode());
    result = 31 * result + (this.visibility == null ? 0: this.visibility.hashCode());
    result = 31 * result + (this.design == null ? 0: this.design.hashCode());
    result = 31 * result + (this.widgets == null ? 0: this.widgets.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageAreaModelsReadPageWidgetContainer {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  classNames: ").append(classNames).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  layout: ").append(layout).append("\n");
    sb.append("  responsiveMode: ").append(responsiveMode).append("\n");
    sb.append("  visibility: ").append(visibility).append("\n");
    sb.append("  design: ").append(design).append("\n");
    sb.append("  widgets: ").append(widgets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
