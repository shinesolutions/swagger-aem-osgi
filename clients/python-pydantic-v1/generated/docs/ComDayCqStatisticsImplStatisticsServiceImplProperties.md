# ComDayCqStatisticsImplStatisticsServiceImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduler_concurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**workspace** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**keywords_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**async_entries** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_statistics_impl_statistics_service_impl_properties import ComDayCqStatisticsImplStatisticsServiceImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqStatisticsImplStatisticsServiceImplProperties from a JSON string
com_day_cq_statistics_impl_statistics_service_impl_properties_instance = ComDayCqStatisticsImplStatisticsServiceImplProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqStatisticsImplStatisticsServiceImplProperties.to_json()

# convert the object into a dict
com_day_cq_statistics_impl_statistics_service_impl_properties_dict = com_day_cq_statistics_impl_statistics_service_impl_properties_instance.to_dict()
# create an instance of ComDayCqStatisticsImplStatisticsServiceImplProperties from a dict
com_day_cq_statistics_impl_statistics_service_impl_properties_from_dict = ComDayCqStatisticsImplStatisticsServiceImplProperties.from_dict(com_day_cq_statistics_impl_statistics_service_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


