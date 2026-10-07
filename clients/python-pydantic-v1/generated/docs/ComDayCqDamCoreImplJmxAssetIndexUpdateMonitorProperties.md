# ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jmx_objectname** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**property_measure_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**property_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**property_max_wait_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**property_max_rate** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**fulltext_measure_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**fulltext_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**fulltext_max_wait_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**fulltext_max_rate** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties import ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties from a JSON string
com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_instance = ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.to_json()

# convert the object into a dict
com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_dict = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties from a dict
com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_from_dict = ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.from_dict(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


