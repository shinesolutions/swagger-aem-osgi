# ComAdobeGraniteThreaddumpThreadDumpCollectorProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduler_run_on** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**granite_threaddump_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_dumps_per_file** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**granite_threaddump_enable_gzip_compression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_enable_directories_compression** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_enable_j_stack** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**granite_threaddump_max_backup_days** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**granite_threaddump_backup_clean_trigger** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_threaddump_thread_dump_collector_properties import ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteThreaddumpThreadDumpCollectorProperties from a JSON string
com_adobe_granite_threaddump_thread_dump_collector_properties_instance = ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.to_json()

# convert the object into a dict
com_adobe_granite_threaddump_thread_dump_collector_properties_dict = com_adobe_granite_threaddump_thread_dump_collector_properties_instance.to_dict()
# create an instance of ComAdobeGraniteThreaddumpThreadDumpCollectorProperties from a dict
com_adobe_granite_threaddump_thread_dump_collector_properties_from_dict = ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.from_dict(com_adobe_granite_threaddump_thread_dump_collector_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


