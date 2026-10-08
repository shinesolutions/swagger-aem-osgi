# ComAdobeCqProjectsPurgeSchedulerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduledpurge_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**scheduledpurge_purge_active** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_templates** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**scheduledpurge_purge_groups** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_purge_assets** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_terminate_running_workflows** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_daysold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduledpurge_save_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_projects_purge_scheduler_properties import ComAdobeCqProjectsPurgeSchedulerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqProjectsPurgeSchedulerProperties from a JSON string
com_adobe_cq_projects_purge_scheduler_properties_instance = ComAdobeCqProjectsPurgeSchedulerProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqProjectsPurgeSchedulerProperties.to_json()

# convert the object into a dict
com_adobe_cq_projects_purge_scheduler_properties_dict = com_adobe_cq_projects_purge_scheduler_properties_instance.to_dict()
# create an instance of ComAdobeCqProjectsPurgeSchedulerProperties from a dict
com_adobe_cq_projects_purge_scheduler_properties_from_dict = ComAdobeCqProjectsPurgeSchedulerProperties.from_dict(com_adobe_cq_projects_purge_scheduler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


