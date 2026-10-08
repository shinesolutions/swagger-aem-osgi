# OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout_in_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**long_running_future_threshold_for_critical_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**result_cache_ttl_in_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties import OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties from a JSON string
org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_instance = OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.to_json())

# convert the object into a dict
org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_dict = org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_instance.to_dict()
# create an instance of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties from a dict
org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_from_dict = OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.from_dict(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


