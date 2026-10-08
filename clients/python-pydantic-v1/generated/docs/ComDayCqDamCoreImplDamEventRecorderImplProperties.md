# ComDayCqDamCoreImplDamEventRecorderImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**event_queue_length** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**eventrecorder_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**eventrecorder_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**eventrecorder_eventtypes** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_dam_core_impl_dam_event_recorder_impl_properties import ComDayCqDamCoreImplDamEventRecorderImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplDamEventRecorderImplProperties from a JSON string
com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_instance = ComDayCqDamCoreImplDamEventRecorderImplProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqDamCoreImplDamEventRecorderImplProperties.to_json()

# convert the object into a dict
com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_dict = com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplDamEventRecorderImplProperties from a dict
com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_from_dict = ComDayCqDamCoreImplDamEventRecorderImplProperties.from_dict(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


