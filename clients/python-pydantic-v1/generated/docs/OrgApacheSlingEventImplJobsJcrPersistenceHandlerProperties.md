# OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_consumermanager_disable_distribution** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**startup_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cleanup_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties import OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties from a JSON string
org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_instance = OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.to_json()

# convert the object into a dict
org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_dict = org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_instance.to_dict()
# create an instance of OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties from a dict
org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_from_dict = OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.from_dict(org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


