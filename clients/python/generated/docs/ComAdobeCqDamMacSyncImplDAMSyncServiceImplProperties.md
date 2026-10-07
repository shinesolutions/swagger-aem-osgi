# ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_cq_dam_mac_sync_damsyncservice_platform** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties import ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties from a JSON string
com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_instance = ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_dict = com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties from a dict
com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_from_dict = ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.from_dict(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


