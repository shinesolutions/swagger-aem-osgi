# GuideLocalizationServiceInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**GuideLocalizationServiceProperties**](GuideLocalizationServiceProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.guide_localization_service_info import GuideLocalizationServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of GuideLocalizationServiceInfo from a JSON string
guide_localization_service_info_instance = GuideLocalizationServiceInfo.from_json(json)
# print the JSON string representation of the object
print GuideLocalizationServiceInfo.to_json()

# convert the object into a dict
guide_localization_service_info_dict = guide_localization_service_info_instance.to_dict()
# create an instance of GuideLocalizationServiceInfo from a dict
guide_localization_service_info_from_dict = GuideLocalizationServiceInfo.from_dict(guide_localization_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


