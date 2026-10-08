# OrgApacheFelixEventadminImplEventAdminInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheFelixEventadminImplEventAdminProperties**](OrgApacheFelixEventadminImplEventAdminProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_eventadmin_impl_event_admin_info import OrgApacheFelixEventadminImplEventAdminInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixEventadminImplEventAdminInfo from a JSON string
org_apache_felix_eventadmin_impl_event_admin_info_instance = OrgApacheFelixEventadminImplEventAdminInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixEventadminImplEventAdminInfo.to_json())

# convert the object into a dict
org_apache_felix_eventadmin_impl_event_admin_info_dict = org_apache_felix_eventadmin_impl_event_admin_info_instance.to_dict()
# create an instance of OrgApacheFelixEventadminImplEventAdminInfo from a dict
org_apache_felix_eventadmin_impl_event_admin_info_from_dict = OrgApacheFelixEventadminImplEventAdminInfo.from_dict(org_apache_felix_eventadmin_impl_event_admin_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


