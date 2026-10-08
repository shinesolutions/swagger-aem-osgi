# ComDayCqPollingImporterImplManagedPollConfigImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**reference** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**source** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**login** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_polling_importer_impl_managed_poll_config_impl_properties import ComDayCqPollingImporterImplManagedPollConfigImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqPollingImporterImplManagedPollConfigImplProperties from a JSON string
com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_instance = ComDayCqPollingImporterImplManagedPollConfigImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqPollingImporterImplManagedPollConfigImplProperties.to_json())

# convert the object into a dict
com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_dict = com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_instance.to_dict()
# create an instance of ComDayCqPollingImporterImplManagedPollConfigImplProperties from a dict
com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_from_dict = ComDayCqPollingImporterImplManagedPollConfigImplProperties.from_dict(com_day_cq_polling_importer_impl_managed_poll_config_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


