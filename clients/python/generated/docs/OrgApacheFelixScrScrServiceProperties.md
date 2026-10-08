# OrgApacheFelixScrScrServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ds_loglevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ds_factory_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ds_delayed_keep_instances** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ds_lock_timeout_milliseconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ds_stop_timeout_milliseconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ds_global_extender** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_scr_scr_service_properties import OrgApacheFelixScrScrServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixScrScrServiceProperties from a JSON string
org_apache_felix_scr_scr_service_properties_instance = OrgApacheFelixScrScrServiceProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixScrScrServiceProperties.to_json())

# convert the object into a dict
org_apache_felix_scr_scr_service_properties_dict = org_apache_felix_scr_scr_service_properties_instance.to_dict()
# create an instance of OrgApacheFelixScrScrServiceProperties from a dict
org_apache_felix_scr_scr_service_properties_from_dict = OrgApacheFelixScrScrServiceProperties.from_dict(org_apache_felix_scr_scr_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


