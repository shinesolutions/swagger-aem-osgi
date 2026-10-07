# ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_client_ids_allowed** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auth_bearer_sync_ims** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**auth_token_request_parameter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_bearer_configid** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_jwt_support** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties import ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties from a JSON string
com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_instance = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.to_json()

# convert the object into a dict
com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_dict = com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_instance.to_dict()
# create an instance of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties from a dict
com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_from_dict = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.from_dict(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


