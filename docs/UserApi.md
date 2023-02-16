# UserApi

All URIs are relative to *https://mgmtapi.carismar.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserProfile**](UserApi.md#createUserProfile) | **POST** /API/User | Create user profile
[**deleteUserProfile**](UserApi.md#deleteUserProfile) | **DELETE** /API/User/email | Delete user profile
[**getUserProfile**](UserApi.md#getUserProfile) | **POST** /API/User/Query | Get a specific user profile
[**updateUserProfile**](UserApi.md#updateUserProfile) | **PUT** /API/User | Update user profile



## createUserProfile

> EnvelopeUserModelsReadUserProfile createUserProfile(userProfile)

Create user profile

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserApi;

UserApi apiInstance = new UserApi();
UserModelsWriteUserProfile userProfile = new UserModelsWriteUserProfile(); // UserModelsWriteUserProfile | The user profile
try {
    EnvelopeUserModelsReadUserProfile result = apiInstance.createUserProfile(userProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserProfile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfile** | [**UserModelsWriteUserProfile**](UserModelsWriteUserProfile.md)| The user profile |

### Return type

[**EnvelopeUserModelsReadUserProfile**](EnvelopeUserModelsReadUserProfile.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## deleteUserProfile

> Object deleteUserProfile(email)

Delete user profile

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserApi;

UserApi apiInstance = new UserApi();
String email = null; // String | Email address
try {
    Object result = apiInstance.deleteUserProfile(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserProfile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email address | [default to null]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml


## getUserProfile

> EnvelopeUserModelsReadUserProfile getUserProfile(query)

Get a specific user profile

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserApi;

UserApi apiInstance = new UserApi();
UserModelsUserProfileQuery query = new UserModelsUserProfileQuery(); // UserModelsUserProfileQuery | The details of the query.
try {
    EnvelopeUserModelsReadUserProfile result = apiInstance.getUserProfile(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserProfile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**UserModelsUserProfileQuery**](UserModelsUserProfileQuery.md)| The details of the query. |

### Return type

[**EnvelopeUserModelsReadUserProfile**](EnvelopeUserModelsReadUserProfile.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml


## updateUserProfile

> EnvelopeUserModelsReadUserProfile updateUserProfile(userProfile)

Update user profile

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserApi;

UserApi apiInstance = new UserApi();
UserModelsWriteUserProfile userProfile = new UserModelsWriteUserProfile(); // UserModelsWriteUserProfile | The user profile
try {
    EnvelopeUserModelsReadUserProfile result = apiInstance.updateUserProfile(userProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserProfile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfile** | [**UserModelsWriteUserProfile**](UserModelsWriteUserProfile.md)| The user profile |

### Return type

[**EnvelopeUserModelsReadUserProfile**](EnvelopeUserModelsReadUserProfile.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
- **Accept**: application/json, text/json, application/xml, text/xml

