# ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_provider_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_cloud_config_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**provider_config_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**provider_config_create_tags_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**provider_config_user_folder** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**provider_config_facebook_fetch_fields** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**provider_config_facebook_fields** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**provider_config_refresh_userdata_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties import ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties from a JSON string
com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_instance = ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_dict = com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties from a dict
com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_from_dict = ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.from_dict(com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


