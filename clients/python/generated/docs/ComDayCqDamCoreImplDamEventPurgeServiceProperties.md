# ComDayCqDamCoreImplDamEventPurgeServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_saved_activities** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**save_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**enable_activity_purge** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**event_types** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_dam_core_impl_dam_event_purge_service_properties import ComDayCqDamCoreImplDamEventPurgeServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplDamEventPurgeServiceProperties from a JSON string
com_day_cq_dam_core_impl_dam_event_purge_service_properties_instance = ComDayCqDamCoreImplDamEventPurgeServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqDamCoreImplDamEventPurgeServiceProperties.to_json())

# convert the object into a dict
com_day_cq_dam_core_impl_dam_event_purge_service_properties_dict = com_day_cq_dam_core_impl_dam_event_purge_service_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplDamEventPurgeServiceProperties from a dict
com_day_cq_dam_core_impl_dam_event_purge_service_properties_from_dict = ComDayCqDamCoreImplDamEventPurgeServiceProperties.from_dict(com_day_cq_dam_core_impl_dam_event_purge_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


