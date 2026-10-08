# ComDayCqWcmMsmImplRolloutManagerImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**rolloutmgr_excludedprops_default** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**rolloutmgr_excludedparagraphprops_default** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**rolloutmgr_excludednodetypes_default** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**rolloutmgr_threadpool_maxsize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**rolloutmgr_threadpool_maxshutdowntime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**rolloutmgr_threadpool_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**rolloutmgr_commit_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**rolloutmgr_conflicthandling_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_wcm_msm_impl_rollout_manager_impl_properties import ComDayCqWcmMsmImplRolloutManagerImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmMsmImplRolloutManagerImplProperties from a JSON string
com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_instance = ComDayCqWcmMsmImplRolloutManagerImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWcmMsmImplRolloutManagerImplProperties.to_json())

# convert the object into a dict
com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_dict = com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_instance.to_dict()
# create an instance of ComDayCqWcmMsmImplRolloutManagerImplProperties from a dict
com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_from_dict = ComDayCqWcmMsmImplRolloutManagerImplProperties.from_dict(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


