# ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**disk_space_warn_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**disk_space_error_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_repository_hc_impl_disk_space_health_check_properties import ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties from a JSON string
com_adobe_granite_repository_hc_impl_disk_space_health_check_properties_instance = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.to_json()

# convert the object into a dict
com_adobe_granite_repository_hc_impl_disk_space_health_check_properties_dict = com_adobe_granite_repository_hc_impl_disk_space_health_check_properties_instance.to_dict()
# create an instance of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties from a dict
com_adobe_granite_repository_hc_impl_disk_space_health_check_properties_from_dict = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.from_dict(com_adobe_granite_repository_hc_impl_disk_space_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


