# ComAdobeGraniteAuthOauthImplGraniteProviderProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_provider_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_granite_authorization_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_granite_token_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_granite_profile_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_granite_extended_details_urls** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_auth_oauth_impl_granite_provider_properties import ComAdobeGraniteAuthOauthImplGraniteProviderProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteAuthOauthImplGraniteProviderProperties from a JSON string
com_adobe_granite_auth_oauth_impl_granite_provider_properties_instance = ComAdobeGraniteAuthOauthImplGraniteProviderProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteAuthOauthImplGraniteProviderProperties.to_json()

# convert the object into a dict
com_adobe_granite_auth_oauth_impl_granite_provider_properties_dict = com_adobe_granite_auth_oauth_impl_granite_provider_properties_instance.to_dict()
# create an instance of ComAdobeGraniteAuthOauthImplGraniteProviderProperties from a dict
com_adobe_granite_auth_oauth_impl_granite_provider_properties_from_dict = ComAdobeGraniteAuthOauthImplGraniteProviderProperties.from_dict(com_adobe_granite_auth_oauth_impl_granite_provider_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


