# OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**details** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**log_level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**queue_processing_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**package_exporter_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**package_importer_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**request_authorization_strategy_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**triggers_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties import OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties from a JSON string
org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_instance = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.to_json())

# convert the object into a dict
org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_dict = org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties from a dict
org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_from_dict = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.from_dict(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


