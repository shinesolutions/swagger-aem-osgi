# OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties


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
**queue_processing_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**package_importer_endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**passive_queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**priority_queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**retry_strategy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**retry_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**request_authorization_strategy_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**transport_secret_provider_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**package_builder_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**triggers_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**queue_provider** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**async_delivery** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**http_conn_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties import OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties from a JSON string
org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_instance = OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.to_json()

# convert the object into a dict
org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_dict = org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties from a dict
org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_from_dict = OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.from_dict(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


