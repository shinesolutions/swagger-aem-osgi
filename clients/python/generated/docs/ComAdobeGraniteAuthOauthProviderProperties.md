# ComAdobeGraniteAuthOauthProviderProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_config_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_client_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_client_secret** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_scope** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**oauth_config_provider_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_create_users** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_userid_property** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**force_strict_username_matching** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_encode_userids** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_hash_userids** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_call_back_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_access_token_persist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_access_token_persist_cookie** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_csrf_state_protection** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_redirect_request_params** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**oauth_config_siblings_allow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_auth_oauth_provider_properties import ComAdobeGraniteAuthOauthProviderProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteAuthOauthProviderProperties from a JSON string
com_adobe_granite_auth_oauth_provider_properties_instance = ComAdobeGraniteAuthOauthProviderProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteAuthOauthProviderProperties.to_json())

# convert the object into a dict
com_adobe_granite_auth_oauth_provider_properties_dict = com_adobe_granite_auth_oauth_provider_properties_instance.to_dict()
# create an instance of ComAdobeGraniteAuthOauthProviderProperties from a dict
com_adobe_granite_auth_oauth_provider_properties_from_dict = ComAdobeGraniteAuthOauthProviderProperties.from_dict(com_adobe_granite_auth_oauth_provider_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


