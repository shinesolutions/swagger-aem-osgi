# OrgApacheSlingEventImplJobsDefaultJobManagerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queue_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**queue_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queue_retrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queue_maxparallel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_event_impl_jobs_default_job_manager_properties import OrgApacheSlingEventImplJobsDefaultJobManagerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEventImplJobsDefaultJobManagerProperties from a JSON string
org_apache_sling_event_impl_jobs_default_job_manager_properties_instance = OrgApacheSlingEventImplJobsDefaultJobManagerProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEventImplJobsDefaultJobManagerProperties.to_json())

# convert the object into a dict
org_apache_sling_event_impl_jobs_default_job_manager_properties_dict = org_apache_sling_event_impl_jobs_default_job_manager_properties_instance.to_dict()
# create an instance of OrgApacheSlingEventImplJobsDefaultJobManagerProperties from a dict
org_apache_sling_event_impl_jobs_default_job_manager_properties_from_dict = OrgApacheSlingEventImplJobsDefaultJobManagerProperties.from_dict(org_apache_sling_event_impl_jobs_default_job_manager_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


