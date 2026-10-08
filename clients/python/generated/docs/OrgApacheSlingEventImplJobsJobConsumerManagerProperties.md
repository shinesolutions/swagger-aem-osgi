# OrgApacheSlingEventImplJobsJobConsumerManagerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_sling_installer_configuration_persist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**job_consumermanager_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**job_consumermanager_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_event_impl_jobs_job_consumer_manager_properties import OrgApacheSlingEventImplJobsJobConsumerManagerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEventImplJobsJobConsumerManagerProperties from a JSON string
org_apache_sling_event_impl_jobs_job_consumer_manager_properties_instance = OrgApacheSlingEventImplJobsJobConsumerManagerProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEventImplJobsJobConsumerManagerProperties.to_json())

# convert the object into a dict
org_apache_sling_event_impl_jobs_job_consumer_manager_properties_dict = org_apache_sling_event_impl_jobs_job_consumer_manager_properties_instance.to_dict()
# create an instance of OrgApacheSlingEventImplJobsJobConsumerManagerProperties from a dict
org_apache_sling_event_impl_jobs_job_consumer_manager_properties_from_dict = OrgApacheSlingEventImplJobsJobConsumerManagerProperties.from_dict(org_apache_sling_event_impl_jobs_job_consumer_manager_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


