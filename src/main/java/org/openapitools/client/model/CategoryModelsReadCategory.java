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
 * An existing category.
 **/
@ApiModel(description = "An existing category.")
public class CategoryModelsReadCategory {
  
  @SerializedName("CategoryId")
  private Integer categoryId = null;
  @SerializedName("ParentCategoryId")
  private Integer parentCategoryId = null;
  @SerializedName("Names")
  private List<SharedModelsLocalizableContent> names = null;
  @SerializedName("Descriptions")
  private List<SharedModelsLocalizableContent> descriptions = null;
  @SerializedName("GoogleCategoryPath")
  private String googleCategoryPath = null;

  /**
   * The unique identifier for the category.
   **/
  @ApiModelProperty(value = "The unique identifier for the category.")
  public Integer getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * The unique identifier for the parent category.
   **/
  @ApiModelProperty(value = "The unique identifier for the parent category.")
  public Integer getParentCategoryId() {
    return parentCategoryId;
  }
  public void setParentCategoryId(Integer parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  /**
   * The localizable names of the category.
   **/
  @ApiModelProperty(value = "The localizable names of the category.")
  public List<SharedModelsLocalizableContent> getNames() {
    return names;
  }
  public void setNames(List<SharedModelsLocalizableContent> names) {
    this.names = names;
  }

  /**
   * The localized descriptions of the category.
   **/
  @ApiModelProperty(value = "The localized descriptions of the category.")
  public List<SharedModelsLocalizableContent> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<SharedModelsLocalizableContent> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * The Google Taxonomy category path for the category, if any.
   **/
  @ApiModelProperty(value = "The Google Taxonomy category path for the category, if any.")
  public String getGoogleCategoryPath() {
    return googleCategoryPath;
  }
  public void setGoogleCategoryPath(String googleCategoryPath) {
    this.googleCategoryPath = googleCategoryPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryModelsReadCategory categoryModelsReadCategory = (CategoryModelsReadCategory) o;
    return (this.categoryId == null ? categoryModelsReadCategory.categoryId == null : this.categoryId.equals(categoryModelsReadCategory.categoryId)) &&
        (this.parentCategoryId == null ? categoryModelsReadCategory.parentCategoryId == null : this.parentCategoryId.equals(categoryModelsReadCategory.parentCategoryId)) &&
        (this.names == null ? categoryModelsReadCategory.names == null : this.names.equals(categoryModelsReadCategory.names)) &&
        (this.descriptions == null ? categoryModelsReadCategory.descriptions == null : this.descriptions.equals(categoryModelsReadCategory.descriptions)) &&
        (this.googleCategoryPath == null ? categoryModelsReadCategory.googleCategoryPath == null : this.googleCategoryPath.equals(categoryModelsReadCategory.googleCategoryPath));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.categoryId == null ? 0: this.categoryId.hashCode());
    result = 31 * result + (this.parentCategoryId == null ? 0: this.parentCategoryId.hashCode());
    result = 31 * result + (this.names == null ? 0: this.names.hashCode());
    result = 31 * result + (this.descriptions == null ? 0: this.descriptions.hashCode());
    result = 31 * result + (this.googleCategoryPath == null ? 0: this.googleCategoryPath.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryModelsReadCategory {\n");
    
    sb.append("  categoryId: ").append(categoryId).append("\n");
    sb.append("  parentCategoryId: ").append(parentCategoryId).append("\n");
    sb.append("  names: ").append(names).append("\n");
    sb.append("  descriptions: ").append(descriptions).append("\n");
    sb.append("  googleCategoryPath: ").append(googleCategoryPath).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
