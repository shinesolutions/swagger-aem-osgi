# OrgApacheFelixJaasConfigurationFactoryProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jaas_control_flag** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**jaas_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**jaas_realm_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jaas_classname** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jaas_options** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_felix_jaas_configuration_factory_properties import OrgApacheFelixJaasConfigurationFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixJaasConfigurationFactoryProperties from a JSON string
org_apache_felix_jaas_configuration_factory_properties_instance = OrgApacheFelixJaasConfigurationFactoryProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheFelixJaasConfigurationFactoryProperties.to_json()

# convert the object into a dict
org_apache_felix_jaas_configuration_factory_properties_dict = org_apache_felix_jaas_configuration_factory_properties_instance.to_dict()
# create an instance of OrgApacheFelixJaasConfigurationFactoryProperties from a dict
org_apache_felix_jaas_configuration_factory_properties_from_dict = OrgApacheFelixJaasConfigurationFactoryProperties.from_dict(org_apache_felix_jaas_configuration_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


