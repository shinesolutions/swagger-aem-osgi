# OrgApacheSlingEngineImplSlingMainServletProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sling_max_calls** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**sling_max_inclusions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**sling_trace_allow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**sling_max_record_requests** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**sling_store_pattern_requests** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_serverinfo** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_additional_response_headers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_engine_impl_sling_main_servlet_properties import OrgApacheSlingEngineImplSlingMainServletProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEngineImplSlingMainServletProperties from a JSON string
org_apache_sling_engine_impl_sling_main_servlet_properties_instance = OrgApacheSlingEngineImplSlingMainServletProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEngineImplSlingMainServletProperties.to_json())

# convert the object into a dict
org_apache_sling_engine_impl_sling_main_servlet_properties_dict = org_apache_sling_engine_impl_sling_main_servlet_properties_instance.to_dict()
# create an instance of OrgApacheSlingEngineImplSlingMainServletProperties from a dict
org_apache_sling_engine_impl_sling_main_servlet_properties_from_dict = OrgApacheSlingEngineImplSlingMainServletProperties.from_dict(org_apache_sling_engine_impl_sling_main_servlet_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


