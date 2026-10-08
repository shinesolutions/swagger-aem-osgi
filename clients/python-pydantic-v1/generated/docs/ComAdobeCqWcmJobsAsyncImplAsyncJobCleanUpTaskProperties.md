# ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**job_purge_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**job_purge_max_jobs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties import ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties from a JSON string
com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_instance = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.to_json()

# convert the object into a dict
com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_dict = com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_instance.to_dict()
# create an instance of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties from a dict
com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_from_dict = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.from_dict(com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


