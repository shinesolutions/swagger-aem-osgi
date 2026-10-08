# ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preserve_hierarchy_nodes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ignore_versioning** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**import_acl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**save_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**preserve_user_paths** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**preserve_uuid** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**preserve_uuid_nodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**preserve_uuid_subtrees** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auto_commit** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties import ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties from a JSON string
com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_instance = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.to_json())

# convert the object into a dict
com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_dict = com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_instance.to_dict()
# create an instance of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties from a dict
com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_from_dict = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.from_dict(com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


