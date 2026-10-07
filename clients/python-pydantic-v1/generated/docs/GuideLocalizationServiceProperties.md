# GuideLocalizationServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supported_locales** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**localizable_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.guide_localization_service_properties import GuideLocalizationServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of GuideLocalizationServiceProperties from a JSON string
guide_localization_service_properties_instance = GuideLocalizationServiceProperties.from_json(json)
# print the JSON string representation of the object
print GuideLocalizationServiceProperties.to_json()

# convert the object into a dict
guide_localization_service_properties_dict = guide_localization_service_properties_instance.to_dict()
# create an instance of GuideLocalizationServiceProperties from a dict
guide_localization_service_properties_from_dict = GuideLocalizationServiceProperties.from_dict(guide_localization_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


