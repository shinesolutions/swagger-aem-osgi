# ComAdobeGraniteWorkflowCoreJobJobHandlerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**allow_self_process_termination** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_workflow_core_job_job_handler_properties import ComAdobeGraniteWorkflowCoreJobJobHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteWorkflowCoreJobJobHandlerProperties from a JSON string
com_adobe_granite_workflow_core_job_job_handler_properties_instance = ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.to_json())

# convert the object into a dict
com_adobe_granite_workflow_core_job_job_handler_properties_dict = com_adobe_granite_workflow_core_job_job_handler_properties_instance.to_dict()
# create an instance of ComAdobeGraniteWorkflowCoreJobJobHandlerProperties from a dict
com_adobe_granite_workflow_core_job_job_handler_properties_from_dict = ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.from_dict(com_adobe_granite_workflow_core_job_job_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


