# OrgApacheFelixJaasConfigurationSpiProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jaas_default_realm_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jaas_config_provider_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jaas_global_config_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_jaas_configuration_spi_properties import OrgApacheFelixJaasConfigurationSpiProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixJaasConfigurationSpiProperties from a JSON string
org_apache_felix_jaas_configuration_spi_properties_instance = OrgApacheFelixJaasConfigurationSpiProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixJaasConfigurationSpiProperties.to_json())

# convert the object into a dict
org_apache_felix_jaas_configuration_spi_properties_dict = org_apache_felix_jaas_configuration_spi_properties_instance.to_dict()
# create an instance of OrgApacheFelixJaasConfigurationSpiProperties from a dict
org_apache_felix_jaas_configuration_spi_properties_from_dict = OrgApacheFelixJaasConfigurationSpiProperties.from_dict(org_apache_felix_jaas_configuration_spi_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


