# OrgApacheSlingEventImplJobsDefaultJobManagerInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingEventImplJobsDefaultJobManagerProperties**](OrgApacheSlingEventImplJobsDefaultJobManagerProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_event_impl_jobs_default_job_manager_info import OrgApacheSlingEventImplJobsDefaultJobManagerInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEventImplJobsDefaultJobManagerInfo from a JSON string
org_apache_sling_event_impl_jobs_default_job_manager_info_instance = OrgApacheSlingEventImplJobsDefaultJobManagerInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEventImplJobsDefaultJobManagerInfo.to_json())

# convert the object into a dict
org_apache_sling_event_impl_jobs_default_job_manager_info_dict = org_apache_sling_event_impl_jobs_default_job_manager_info_instance.to_dict()
# create an instance of OrgApacheSlingEventImplJobsDefaultJobManagerInfo from a dict
org_apache_sling_event_impl_jobs_default_job_manager_info_from_dict = OrgApacheSlingEventImplJobsDefaultJobManagerInfo.from_dict(org_apache_sling_event_impl_jobs_default_job_manager_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


