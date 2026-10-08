# OrgApacheSlingServletsGetDefaultGetServletInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingServletsGetDefaultGetServletProperties**](OrgApacheSlingServletsGetDefaultGetServletProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_servlets_get_default_get_servlet_info import OrgApacheSlingServletsGetDefaultGetServletInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingServletsGetDefaultGetServletInfo from a JSON string
org_apache_sling_servlets_get_default_get_servlet_info_instance = OrgApacheSlingServletsGetDefaultGetServletInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingServletsGetDefaultGetServletInfo.to_json()

# convert the object into a dict
org_apache_sling_servlets_get_default_get_servlet_info_dict = org_apache_sling_servlets_get_default_get_servlet_info_instance.to_dict()
# create an instance of OrgApacheSlingServletsGetDefaultGetServletInfo from a dict
org_apache_sling_servlets_get_default_get_servlet_info_from_dict = OrgApacheSlingServletsGetDefaultGetServletInfo.from_dict(org_apache_sling_servlets_get_default_get_servlet_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


