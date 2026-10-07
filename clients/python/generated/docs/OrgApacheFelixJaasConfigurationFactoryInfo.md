# OrgApacheFelixJaasConfigurationFactoryInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheFelixJaasConfigurationFactoryProperties**](OrgApacheFelixJaasConfigurationFactoryProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_jaas_configuration_factory_info import OrgApacheFelixJaasConfigurationFactoryInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixJaasConfigurationFactoryInfo from a JSON string
org_apache_felix_jaas_configuration_factory_info_instance = OrgApacheFelixJaasConfigurationFactoryInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixJaasConfigurationFactoryInfo.to_json())

# convert the object into a dict
org_apache_felix_jaas_configuration_factory_info_dict = org_apache_felix_jaas_configuration_factory_info_instance.to_dict()
# create an instance of OrgApacheFelixJaasConfigurationFactoryInfo from a dict
org_apache_felix_jaas_configuration_factory_info_from_dict = OrgApacheFelixJaasConfigurationFactoryInfo.from_dict(org_apache_felix_jaas_configuration_factory_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


