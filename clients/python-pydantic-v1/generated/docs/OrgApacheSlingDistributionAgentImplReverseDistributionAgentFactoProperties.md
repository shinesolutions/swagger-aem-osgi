# OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties


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
**package_exporter_endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**pull_items** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**http_conn_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**request_authorization_strategy_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**transport_secret_provider_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**package_builder_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**triggers_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties import OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties from a JSON string
org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties_instance = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.to_json()

# convert the object into a dict
org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties_dict = org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties from a dict
org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties_from_dict = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.from_dict(org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


