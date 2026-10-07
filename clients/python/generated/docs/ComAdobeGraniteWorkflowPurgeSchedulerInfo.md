# ComAdobeGraniteWorkflowPurgeSchedulerInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeGraniteWorkflowPurgeSchedulerProperties**](ComAdobeGraniteWorkflowPurgeSchedulerProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_workflow_purge_scheduler_info import ComAdobeGraniteWorkflowPurgeSchedulerInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteWorkflowPurgeSchedulerInfo from a JSON string
com_adobe_granite_workflow_purge_scheduler_info_instance = ComAdobeGraniteWorkflowPurgeSchedulerInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteWorkflowPurgeSchedulerInfo.to_json())

# convert the object into a dict
com_adobe_granite_workflow_purge_scheduler_info_dict = com_adobe_granite_workflow_purge_scheduler_info_instance.to_dict()
# create an instance of ComAdobeGraniteWorkflowPurgeSchedulerInfo from a dict
com_adobe_granite_workflow_purge_scheduler_info_from_dict = ComAdobeGraniteWorkflowPurgeSchedulerInfo.from_dict(com_adobe_granite_workflow_purge_scheduler_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


