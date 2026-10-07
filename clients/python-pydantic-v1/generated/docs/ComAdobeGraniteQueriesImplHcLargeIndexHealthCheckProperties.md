# ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**large_index_critical_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**large_index_warn_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_queries_impl_hc_large_index_health_check_properties import ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties from a JSON string
com_adobe_granite_queries_impl_hc_large_index_health_check_properties_instance = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.to_json()

# convert the object into a dict
com_adobe_granite_queries_impl_hc_large_index_health_check_properties_dict = com_adobe_granite_queries_impl_hc_large_index_health_check_properties_instance.to_dict()
# create an instance of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties from a dict
com_adobe_granite_queries_impl_hc_large_index_health_check_properties_from_dict = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.from_dict(com_adobe_granite_queries_impl_hc_large_index_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


