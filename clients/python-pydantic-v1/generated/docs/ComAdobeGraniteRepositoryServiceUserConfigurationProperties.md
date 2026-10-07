# ComAdobeGraniteRepositoryServiceUserConfigurationProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**serviceusers_simple_subject_population** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**serviceusers_list** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_repository_service_user_configuration_properties import ComAdobeGraniteRepositoryServiceUserConfigurationProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteRepositoryServiceUserConfigurationProperties from a JSON string
com_adobe_granite_repository_service_user_configuration_properties_instance = ComAdobeGraniteRepositoryServiceUserConfigurationProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteRepositoryServiceUserConfigurationProperties.to_json()

# convert the object into a dict
com_adobe_granite_repository_service_user_configuration_properties_dict = com_adobe_granite_repository_service_user_configuration_properties_instance.to_dict()
# create an instance of ComAdobeGraniteRepositoryServiceUserConfigurationProperties from a dict
com_adobe_granite_repository_service_user_configuration_properties_from_dict = ComAdobeGraniteRepositoryServiceUserConfigurationProperties.from_dict(com_adobe_granite_repository_service_user_configuration_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


