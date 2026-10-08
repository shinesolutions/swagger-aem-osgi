# ComDayCqDamIdsImplIDSJobProcessorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enable_multisession** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ids_cc_enable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**enable_retry** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**enable_retry_scripterror** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**externalizer_domain_cqhost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**externalizer_domain_http** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_dam_ids_impl_ids_job_processor_properties import ComDayCqDamIdsImplIDSJobProcessorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamIdsImplIDSJobProcessorProperties from a JSON string
com_day_cq_dam_ids_impl_ids_job_processor_properties_instance = ComDayCqDamIdsImplIDSJobProcessorProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqDamIdsImplIDSJobProcessorProperties.to_json())

# convert the object into a dict
com_day_cq_dam_ids_impl_ids_job_processor_properties_dict = com_day_cq_dam_ids_impl_ids_job_processor_properties_instance.to_dict()
# create an instance of ComDayCqDamIdsImplIDSJobProcessorProperties from a dict
com_day_cq_dam_ids_impl_ids_job_processor_properties_from_dict = ComDayCqDamIdsImplIDSJobProcessorProperties.from_dict(com_day_cq_dam_ids_impl_ids_job_processor_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


