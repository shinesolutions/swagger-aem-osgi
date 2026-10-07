# ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_topics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**translate_listener_type** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**translate_property_list** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queue_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**keep_alive_time** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_social_translation_impl_ugc_language_detector_properties import ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties from a JSON string
com_adobe_cq_social_translation_impl_ugc_language_detector_properties_instance = ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.to_json())

# convert the object into a dict
com_adobe_cq_social_translation_impl_ugc_language_detector_properties_dict = com_adobe_cq_social_translation_impl_ugc_language_detector_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties from a dict
com_adobe_cq_social_translation_impl_ugc_language_detector_properties_from_dict = ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.from_dict(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


