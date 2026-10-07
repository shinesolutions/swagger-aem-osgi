# ComAdobeCqHcContentPackagesHealthCheckInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqHcContentPackagesHealthCheckProperties**](ComAdobeCqHcContentPackagesHealthCheckProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_hc_content_packages_health_check_info import ComAdobeCqHcContentPackagesHealthCheckInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqHcContentPackagesHealthCheckInfo from a JSON string
com_adobe_cq_hc_content_packages_health_check_info_instance = ComAdobeCqHcContentPackagesHealthCheckInfo.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqHcContentPackagesHealthCheckInfo.to_json()

# convert the object into a dict
com_adobe_cq_hc_content_packages_health_check_info_dict = com_adobe_cq_hc_content_packages_health_check_info_instance.to_dict()
# create an instance of ComAdobeCqHcContentPackagesHealthCheckInfo from a dict
com_adobe_cq_hc_content_packages_health_check_info_from_dict = ComAdobeCqHcContentPackagesHealthCheckInfo.from_dict(com_adobe_cq_hc_content_packages_health_check_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


