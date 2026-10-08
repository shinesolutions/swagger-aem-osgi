# OrgApacheFelixEventadminImplEventAdminProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_felix_eventadmin_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org_apache_felix_eventadmin_async_to_sync_thread_ratio** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**org_apache_felix_eventadmin_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org_apache_felix_eventadmin_require_topic** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org_apache_felix_eventadmin_ignore_timeout** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org_apache_felix_eventadmin_ignore_topic** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_eventadmin_impl_event_admin_properties import OrgApacheFelixEventadminImplEventAdminProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixEventadminImplEventAdminProperties from a JSON string
org_apache_felix_eventadmin_impl_event_admin_properties_instance = OrgApacheFelixEventadminImplEventAdminProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixEventadminImplEventAdminProperties.to_json())

# convert the object into a dict
org_apache_felix_eventadmin_impl_event_admin_properties_dict = org_apache_felix_eventadmin_impl_event_admin_properties_instance.to_dict()
# create an instance of OrgApacheFelixEventadminImplEventAdminProperties from a dict
org_apache_felix_eventadmin_impl_event_admin_properties_from_dict = OrgApacheFelixEventadminImplEventAdminProperties.from_dict(org_apache_felix_eventadmin_impl_event_admin_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


