# ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**indexing_critical_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**indexing_warn_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_queries_impl_hc_async_index_health_check_properties import ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties from a JSON string
com_adobe_granite_queries_impl_hc_async_index_health_check_properties_instance = ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.to_json()

# convert the object into a dict
com_adobe_granite_queries_impl_hc_async_index_health_check_properties_dict = com_adobe_granite_queries_impl_hc_async_index_health_check_properties_instance.to_dict()
# create an instance of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties from a dict
com_adobe_granite_queries_impl_hc_async_index_health_check_properties_from_dict = ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.from_dict(com_adobe_granite_queries_impl_hc_async_index_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


