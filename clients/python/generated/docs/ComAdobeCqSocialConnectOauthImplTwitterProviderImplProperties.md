# ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_provider_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_cloud_config_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**provider_config_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**provider_config_user_folder** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**provider_config_twitter_enable_params** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**provider_config_twitter_params** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**provider_config_refresh_userdata_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties import ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties from a JSON string
com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_instance = ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_dict = com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties from a dict
com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_from_dict = ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.from_dict(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


