# OrgApacheSlingAuthCoreImplLogoutServletInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingAuthCoreImplLogoutServletProperties**](OrgApacheSlingAuthCoreImplLogoutServletProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_auth_core_impl_logout_servlet_info import OrgApacheSlingAuthCoreImplLogoutServletInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingAuthCoreImplLogoutServletInfo from a JSON string
org_apache_sling_auth_core_impl_logout_servlet_info_instance = OrgApacheSlingAuthCoreImplLogoutServletInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingAuthCoreImplLogoutServletInfo.to_json()

# convert the object into a dict
org_apache_sling_auth_core_impl_logout_servlet_info_dict = org_apache_sling_auth_core_impl_logout_servlet_info_instance.to_dict()
# create an instance of OrgApacheSlingAuthCoreImplLogoutServletInfo from a dict
org_apache_sling_auth_core_impl_logout_servlet_info_from_dict = OrgApacheSlingAuthCoreImplLogoutServletInfo.from_dict(org_apache_sling_auth_core_impl_logout_servlet_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


