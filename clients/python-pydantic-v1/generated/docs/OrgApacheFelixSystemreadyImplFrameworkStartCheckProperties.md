# OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**target_start_level** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**target_start_level_prop_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_felix_systemready_impl_framework_start_check_properties import OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties from a JSON string
org_apache_felix_systemready_impl_framework_start_check_properties_instance = OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.to_json()

# convert the object into a dict
org_apache_felix_systemready_impl_framework_start_check_properties_dict = org_apache_felix_systemready_impl_framework_start_check_properties_instance.to_dict()
# create an instance of OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties from a dict
org_apache_felix_systemready_impl_framework_start_check_properties_from_dict = OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.from_dict(org_apache_felix_systemready_impl_framework_start_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


