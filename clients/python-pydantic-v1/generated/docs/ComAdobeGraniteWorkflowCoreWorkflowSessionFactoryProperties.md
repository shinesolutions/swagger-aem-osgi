# ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**granite_workflowinbox_sort_property_name** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**granite_workflowinbox_sort_order** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_workflow_job_retry** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_workflow_superuser** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**granite_workflow_inbox_query_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**granite_workflow_admin_user_group_filter** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_workflow_enforce_workitem_assignee_permissions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_workflow_enforce_workflow_initiator_permissions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_workflow_inject_tenant_id_in_job_topics** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_workflow_max_purge_save_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**granite_workflow_max_purge_query_count** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_workflow_core_workflow_session_factory_properties import ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties from a JSON string
com_adobe_granite_workflow_core_workflow_session_factory_properties_instance = ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.to_json()

# convert the object into a dict
com_adobe_granite_workflow_core_workflow_session_factory_properties_dict = com_adobe_granite_workflow_core_workflow_session_factory_properties_instance.to_dict()
# create an instance of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties from a dict
com_adobe_granite_workflow_core_workflow_session_factory_properties_from_dict = ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.from_dict(com_adobe_granite_workflow_core_workflow_session_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


