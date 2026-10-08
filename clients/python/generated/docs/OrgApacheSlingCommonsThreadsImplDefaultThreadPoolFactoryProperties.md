# OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**min_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queue_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_thread_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**keep_alive_time** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**block_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**shutdown_graceful** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**daemon** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**shutdown_wait_time** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties import OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties from a JSON string
org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_instance = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.to_json())

# convert the object into a dict
org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_dict = org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_instance.to_dict()
# create an instance of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties from a dict
org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_from_dict = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.from_dict(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


