# OrgApacheSlingTracerInternalLogTracerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tracer_sets** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**servlet_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**recording_cache_size_in_mb** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**recording_cache_duration_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**recording_compression_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**gzip_response** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_tracer_internal_log_tracer_properties import OrgApacheSlingTracerInternalLogTracerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingTracerInternalLogTracerProperties from a JSON string
org_apache_sling_tracer_internal_log_tracer_properties_instance = OrgApacheSlingTracerInternalLogTracerProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingTracerInternalLogTracerProperties.to_json()

# convert the object into a dict
org_apache_sling_tracer_internal_log_tracer_properties_dict = org_apache_sling_tracer_internal_log_tracer_properties_instance.to_dict()
# create an instance of OrgApacheSlingTracerInternalLogTracerProperties from a dict
org_apache_sling_tracer_internal_log_tracer_properties_from_dict = OrgApacheSlingTracerInternalLogTracerProperties.from_dict(org_apache_sling_tracer_internal_log_tracer_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


