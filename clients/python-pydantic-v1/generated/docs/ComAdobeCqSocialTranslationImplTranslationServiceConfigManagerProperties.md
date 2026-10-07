# ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**translate_language** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**translate_display** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**translate_attribution** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**translate_caching** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**translate_smart_rendering** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**translate_caching_duration** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**translate_session_save_interval** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**translate_session_save_batch_limit** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_social_translation_impl_translation_service_config_manager_properties import ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties from a JSON string
com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_instance = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.to_json()

# convert the object into a dict
com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_dict = com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties from a dict
com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_from_dict = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.from_dict(com_adobe_cq_social_translation_impl_translation_service_config_manager_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


