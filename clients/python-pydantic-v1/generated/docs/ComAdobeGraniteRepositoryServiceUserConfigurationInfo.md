# ComAdobeGraniteRepositoryServiceUserConfigurationInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeGraniteRepositoryServiceUserConfigurationProperties**](ComAdobeGraniteRepositoryServiceUserConfigurationProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_repository_service_user_configuration_info import ComAdobeGraniteRepositoryServiceUserConfigurationInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteRepositoryServiceUserConfigurationInfo from a JSON string
com_adobe_granite_repository_service_user_configuration_info_instance = ComAdobeGraniteRepositoryServiceUserConfigurationInfo.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteRepositoryServiceUserConfigurationInfo.to_json()

# convert the object into a dict
com_adobe_granite_repository_service_user_configuration_info_dict = com_adobe_granite_repository_service_user_configuration_info_instance.to_dict()
# create an instance of ComAdobeGraniteRepositoryServiceUserConfigurationInfo from a dict
com_adobe_granite_repository_service_user_configuration_info_from_dict = ComAdobeGraniteRepositoryServiceUserConfigurationInfo.from_dict(com_adobe_granite_repository_service_user_configuration_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


