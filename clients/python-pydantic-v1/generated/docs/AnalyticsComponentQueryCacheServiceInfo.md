# AnalyticsComponentQueryCacheServiceInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**AnalyticsComponentQueryCacheServiceProperties**](AnalyticsComponentQueryCacheServiceProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.analytics_component_query_cache_service_info import AnalyticsComponentQueryCacheServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyticsComponentQueryCacheServiceInfo from a JSON string
analytics_component_query_cache_service_info_instance = AnalyticsComponentQueryCacheServiceInfo.from_json(json)
# print the JSON string representation of the object
print AnalyticsComponentQueryCacheServiceInfo.to_json()

# convert the object into a dict
analytics_component_query_cache_service_info_dict = analytics_component_query_cache_service_info_instance.to_dict()
# create an instance of AnalyticsComponentQueryCacheServiceInfo from a dict
analytics_component_query_cache_service_info_from_dict = AnalyticsComponentQueryCacheServiceInfo.from_dict(analytics_component_query_cache_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


