# ComDayCqWcmCoreImplVersionPurgeTaskProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionpurge_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**versionpurge_recursive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**versionpurge_max_versions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**versionpurge_min_versions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**versionpurge_max_age_days** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_wcm_core_impl_version_purge_task_properties import ComDayCqWcmCoreImplVersionPurgeTaskProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmCoreImplVersionPurgeTaskProperties from a JSON string
com_day_cq_wcm_core_impl_version_purge_task_properties_instance = ComDayCqWcmCoreImplVersionPurgeTaskProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWcmCoreImplVersionPurgeTaskProperties.to_json())

# convert the object into a dict
com_day_cq_wcm_core_impl_version_purge_task_properties_dict = com_day_cq_wcm_core_impl_version_purge_task_properties_instance.to_dict()
# create an instance of ComDayCqWcmCoreImplVersionPurgeTaskProperties from a dict
com_day_cq_wcm_core_impl_version_purge_task_properties_from_dict = ComDayCqWcmCoreImplVersionPurgeTaskProperties.from_dict(com_day_cq_wcm_core_impl_version_purge_task_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


