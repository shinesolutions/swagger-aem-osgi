# OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**servlet_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**disabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cors_access_control_allow_origin** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties import OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties from a JSON string
org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_instance = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.to_json()

# convert the object into a dict
org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_dict = org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_instance.to_dict()
# create an instance of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties from a dict
org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_from_dict = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.from_dict(org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


