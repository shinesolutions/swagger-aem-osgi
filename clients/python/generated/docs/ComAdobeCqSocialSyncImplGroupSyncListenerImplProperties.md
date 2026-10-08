# ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ignorableprops** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ignorablenodes** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**distfolders** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties import ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties from a JSON string
com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_instance = ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_dict = com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties from a dict
com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_from_dict = ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.from_dict(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


