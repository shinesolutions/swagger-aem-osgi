# ComDayCqWcmUndoUndoConfigProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cq_wcm_undo_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cq_wcm_undo_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_wcm_undo_validity** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_wcm_undo_steps** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_wcm_undo_persistence** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_wcm_undo_persistence_mode** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cq_wcm_undo_markermode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_wcm_undo_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**cq_wcm_undo_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_wcm_undo_undo_config_properties import ComDayCqWcmUndoUndoConfigProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmUndoUndoConfigProperties from a JSON string
com_day_cq_wcm_undo_undo_config_properties_instance = ComDayCqWcmUndoUndoConfigProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWcmUndoUndoConfigProperties.to_json())

# convert the object into a dict
com_day_cq_wcm_undo_undo_config_properties_dict = com_day_cq_wcm_undo_undo_config_properties_instance.to_dict()
# create an instance of ComDayCqWcmUndoUndoConfigProperties from a dict
com_day_cq_wcm_undo_undo_config_properties_from_dict = ComDayCqWcmUndoUndoConfigProperties.from_dict(com_day_cq_wcm_undo_undo_config_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


