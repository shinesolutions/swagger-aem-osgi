# ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**min_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_wcm_workflow_terminate_on_activate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cq_wcm_worklfow_terminate_exclusion_list** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties import ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties from a JSON string
com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_instance = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.to_json())

# convert the object into a dict
com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_dict = com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_instance.to_dict()
# create an instance of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties from a dict
com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_from_dict = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.from_dict(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


