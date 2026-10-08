# ComAdobeGraniteWorkflowPurgeSchedulerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduledpurge_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**scheduledpurge_workflow_status** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**scheduledpurge_model_ids** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**scheduledpurge_daysold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_workflow_purge_scheduler_properties import ComAdobeGraniteWorkflowPurgeSchedulerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteWorkflowPurgeSchedulerProperties from a JSON string
com_adobe_granite_workflow_purge_scheduler_properties_instance = ComAdobeGraniteWorkflowPurgeSchedulerProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteWorkflowPurgeSchedulerProperties.to_json())

# convert the object into a dict
com_adobe_granite_workflow_purge_scheduler_properties_dict = com_adobe_granite_workflow_purge_scheduler_properties_instance.to_dict()
# create an instance of ComAdobeGraniteWorkflowPurgeSchedulerProperties from a dict
com_adobe_granite_workflow_purge_scheduler_properties_from_dict = ComAdobeGraniteWorkflowPurgeSchedulerProperties.from_dict(com_adobe_granite_workflow_purge_scheduler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


