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

package org.openapitools.client.request;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;

import org.apache.http.HttpEntity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PatchRequest extends Request<String> {

  HttpEntity entity;

  private final Response.Listener<String> mListener;

  String contentType;
  Map<String, String> apiHeaders;
  public PatchRequest(String url, Map<String, String> apiHeaders, String contentType, HttpEntity entity, Response.Listener<String> listener, Response.ErrorListener errorListener) {
    super(Method.PATCH, url, errorListener);
    mListener = listener;
    this.entity = entity;
    this.contentType = contentType;
    this.apiHeaders = apiHeaders;
  }

  @Override
  public String getBodyContentType() {
    if(entity == null) {
        return null;
    }
    return entity.getContentType().getValue();
  }

  @Override
  public byte[] getBody() throws AuthFailureError {
    if(entity == null) {
        return null;
    }
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try {
        entity.writeTo(bos);
    }
    catch (IOException e) {
        VolleyLog.e("IOException writing to ByteArrayOutputStream");
    }
    return bos.toByteArray();
  }

  @Override
  protected Response<String> parseNetworkResponse(NetworkResponse response) {
    String parsed;
    try {
      parsed = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
    } catch (UnsupportedEncodingException e) {
      parsed = new String(response.data);
    }
    return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
  }

  @Override
  protected void deliverResponse(String response) {
    mListener.onResponse(response);
  }

  /* (non-Javadoc)
   * @see com.android.volley.Request#getHeaders()
   */
  @Override
  public Map<String, String> getHeaders() throws AuthFailureError {
    Map<String, String> headers = super.getHeaders();
    if (headers == null || headers.equals(Collections.emptyMap())) {
      headers = new HashMap<String, String>();
    }
    if (apiHeaders != null && !apiHeaders.equals(Collections.emptyMap())) {
      headers.putAll(apiHeaders);
    }
    if(contentType != null) {
      headers.put("Content-Type", contentType);
    }

    return headers;
  }
}
