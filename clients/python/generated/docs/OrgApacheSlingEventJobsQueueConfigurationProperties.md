# OrgApacheSlingEventJobsQueueConfigurationProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queue_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**queue_topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**queue_type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**queue_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**queue_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queue_retrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queue_maxparallel** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**queue_keep_jobs** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**queue_prefer_run_on_creation_instance** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**queue_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_event_jobs_queue_configuration_properties import OrgApacheSlingEventJobsQueueConfigurationProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEventJobsQueueConfigurationProperties from a JSON string
org_apache_sling_event_jobs_queue_configuration_properties_instance = OrgApacheSlingEventJobsQueueConfigurationProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEventJobsQueueConfigurationProperties.to_json())

# convert the object into a dict
org_apache_sling_event_jobs_queue_configuration_properties_dict = org_apache_sling_event_jobs_queue_configuration_properties_instance.to_dict()
# create an instance of OrgApacheSlingEventJobsQueueConfigurationProperties from a dict
org_apache_sling_event_jobs_queue_configuration_properties_from_dict = OrgApacheSlingEventJobsQueueConfigurationProperties.from_dict(org_apache_sling_event_jobs_queue_configuration_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


