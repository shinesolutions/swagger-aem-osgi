# OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extensions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**min_duration_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_duration_ms** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**compact_log_format** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties import OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties from a JSON string
org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_instance = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.to_json()

# convert the object into a dict
org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_dict = org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_instance.to_dict()
# create an instance of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties from a dict
org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_from_dict = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.from_dict(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


