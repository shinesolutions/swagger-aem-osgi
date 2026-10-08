# ComDayCqWcmCoreImplVersionManagerImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionmanager_create_version_on_activation** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**versionmanager_purging_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**versionmanager_purge_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**versionmanager_iv_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**versionmanager_max_age_days** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**versionmanager_max_number_versions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**versionmanager_min_number_versions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_wcm_core_impl_version_manager_impl_properties import ComDayCqWcmCoreImplVersionManagerImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmCoreImplVersionManagerImplProperties from a JSON string
com_day_cq_wcm_core_impl_version_manager_impl_properties_instance = ComDayCqWcmCoreImplVersionManagerImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWcmCoreImplVersionManagerImplProperties.to_json())

# convert the object into a dict
com_day_cq_wcm_core_impl_version_manager_impl_properties_dict = com_day_cq_wcm_core_impl_version_manager_impl_properties_instance.to_dict()
# create an instance of ComDayCqWcmCoreImplVersionManagerImplProperties from a dict
com_day_cq_wcm_core_impl_version_manager_impl_properties_from_dict = ComDayCqWcmCoreImplVersionManagerImplProperties.from_dict(com_day_cq_wcm_core_impl_version_manager_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


