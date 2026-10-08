# OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**details** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**log_level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**allowed_roots** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**request_authorization_strategy_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**queue_provider_factory_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**package_builder_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**triggers_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**priority_queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties import OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties from a JSON string
org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_instance = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.to_json()

# convert the object into a dict
org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_dict = org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties from a dict
org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_from_dict = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.from_dict(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


