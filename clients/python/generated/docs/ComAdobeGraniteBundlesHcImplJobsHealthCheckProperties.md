# ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**max_queued_jobs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_bundles_hc_impl_jobs_health_check_properties import ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties from a JSON string
com_adobe_granite_bundles_hc_impl_jobs_health_check_properties_instance = ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.to_json())

# convert the object into a dict
com_adobe_granite_bundles_hc_impl_jobs_health_check_properties_dict = com_adobe_granite_bundles_hc_impl_jobs_health_check_properties_instance.to_dict()
# create an instance of ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties from a dict
com_adobe_granite_bundles_hc_impl_jobs_health_check_properties_from_dict = ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.from_dict(com_adobe_granite_bundles_hc_impl_jobs_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


