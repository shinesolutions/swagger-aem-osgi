# OrgApacheFelixJaasConfigurationSpiInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheFelixJaasConfigurationSpiProperties**](OrgApacheFelixJaasConfigurationSpiProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_felix_jaas_configuration_spi_info import OrgApacheFelixJaasConfigurationSpiInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixJaasConfigurationSpiInfo from a JSON string
org_apache_felix_jaas_configuration_spi_info_instance = OrgApacheFelixJaasConfigurationSpiInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheFelixJaasConfigurationSpiInfo.to_json()

# convert the object into a dict
org_apache_felix_jaas_configuration_spi_info_dict = org_apache_felix_jaas_configuration_spi_info_instance.to_dict()
# create an instance of OrgApacheFelixJaasConfigurationSpiInfo from a dict
org_apache_felix_jaas_configuration_spi_info_from_dict = OrgApacheFelixJaasConfigurationSpiInfo.from_dict(org_apache_felix_jaas_configuration_spi_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


