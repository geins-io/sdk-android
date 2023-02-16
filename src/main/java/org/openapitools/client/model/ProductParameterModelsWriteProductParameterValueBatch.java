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
import org.openapitools.client.model.ProductParameterModelsWriteProductParameterValue;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProductParameterModelsWriteProductParameterValueBatch {
  
  @SerializedName("productParameterValues")
  private List<ProductParameterModelsWriteProductParameterValue> productParameterValues = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductParameterModelsWriteProductParameterValue> getProductParameterValues() {
    return productParameterValues;
  }
  public void setProductParameterValues(List<ProductParameterModelsWriteProductParameterValue> productParameterValues) {
    this.productParameterValues = productParameterValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductParameterModelsWriteProductParameterValueBatch productParameterModelsWriteProductParameterValueBatch = (ProductParameterModelsWriteProductParameterValueBatch) o;
    return (this.productParameterValues == null ? productParameterModelsWriteProductParameterValueBatch.productParameterValues == null : this.productParameterValues.equals(productParameterModelsWriteProductParameterValueBatch.productParameterValues));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.productParameterValues == null ? 0: this.productParameterValues.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductParameterModelsWriteProductParameterValueBatch {\n");
    
    sb.append("  productParameterValues: ").append(productParameterValues).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
