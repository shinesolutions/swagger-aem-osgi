# ComAdobeGraniteAuthImsImplIMSProviderImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_provider_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_authorization_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_token_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_profile_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_extended_details_urls** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**oauth_provider_ims_validate_token_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_session_property** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_service_token_client_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_service_token_client_secret** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**oauth_provider_ims_service_token** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ims_org_ref** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ims_group_mapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**oauth_provider_ims_only_license_group** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_auth_ims_impl_ims_provider_impl_properties import ComAdobeGraniteAuthImsImplIMSProviderImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteAuthImsImplIMSProviderImplProperties from a JSON string
com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_instance = ComAdobeGraniteAuthImsImplIMSProviderImplProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteAuthImsImplIMSProviderImplProperties.to_json()

# convert the object into a dict
com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_dict = com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_instance.to_dict()
# create an instance of ComAdobeGraniteAuthImsImplIMSProviderImplProperties from a dict
com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_from_dict = ComAdobeGraniteAuthImsImplIMSProviderImplProperties.from_dict(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


