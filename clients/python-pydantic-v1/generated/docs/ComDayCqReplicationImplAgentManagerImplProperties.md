# ComDayCqReplicationImplAgentManagerImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_topics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**service_user_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**agent_provider_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_replication_impl_agent_manager_impl_properties import ComDayCqReplicationImplAgentManagerImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqReplicationImplAgentManagerImplProperties from a JSON string
com_day_cq_replication_impl_agent_manager_impl_properties_instance = ComDayCqReplicationImplAgentManagerImplProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqReplicationImplAgentManagerImplProperties.to_json()

# convert the object into a dict
com_day_cq_replication_impl_agent_manager_impl_properties_dict = com_day_cq_replication_impl_agent_manager_impl_properties_instance.to_dict()
# create an instance of ComDayCqReplicationImplAgentManagerImplProperties from a dict
com_day_cq_replication_impl_agent_manager_impl_properties_from_dict = ComDayCqReplicationImplAgentManagerImplProperties.from_dict(com_day_cq_replication_impl_agent_manager_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


