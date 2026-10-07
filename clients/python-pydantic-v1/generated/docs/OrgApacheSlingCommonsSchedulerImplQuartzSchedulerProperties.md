# OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pool_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**allowed_pool_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**scheduler_useleaderforsingle** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**metrics_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**slow_threshold_millis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties import OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties from a JSON string
org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_instance = OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.to_json()

# convert the object into a dict
org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_dict = org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_instance.to_dict()
# create an instance of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties from a dict
org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_from_dict = OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.from_dict(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


