# OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manager_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**http_service_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**default_render** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**realm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**category** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**locale** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**loglevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**plugins** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_webconsole_internal_servlet_osgi_manager_properties import OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties from a JSON string
org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_instance = OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.to_json())

# convert the object into a dict
org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_dict = org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_instance.to_dict()
# create an instance of OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties from a dict
org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_from_dict = OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.from_dict(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


