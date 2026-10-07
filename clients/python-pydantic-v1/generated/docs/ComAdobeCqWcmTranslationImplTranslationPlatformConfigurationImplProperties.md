# ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sync_translation_state_scheduling_format** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**scheduling_repeat_translation_scheduling_format** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sync_translation_state_lock_timeout_in_minutes** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**export_format** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties import ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties from a JSON string
com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_instance = ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.to_json()

# convert the object into a dict
com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_dict = com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties from a dict
com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_from_dict = ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.from_dict(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


