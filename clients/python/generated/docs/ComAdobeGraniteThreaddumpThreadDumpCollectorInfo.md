# ComAdobeGraniteThreaddumpThreadDumpCollectorInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeGraniteThreaddumpThreadDumpCollectorProperties**](ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_threaddump_thread_dump_collector_info import ComAdobeGraniteThreaddumpThreadDumpCollectorInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteThreaddumpThreadDumpCollectorInfo from a JSON string
com_adobe_granite_threaddump_thread_dump_collector_info_instance = ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.to_json())

# convert the object into a dict
com_adobe_granite_threaddump_thread_dump_collector_info_dict = com_adobe_granite_threaddump_thread_dump_collector_info_instance.to_dict()
# create an instance of ComAdobeGraniteThreaddumpThreadDumpCollectorInfo from a dict
com_adobe_granite_threaddump_thread_dump_collector_info_from_dict = ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.from_dict(com_adobe_granite_threaddump_thread_dump_collector_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


