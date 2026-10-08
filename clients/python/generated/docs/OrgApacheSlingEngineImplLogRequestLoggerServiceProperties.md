# OrgApacheSlingEngineImplLogRequestLoggerServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_log_service_format** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**request_log_service_output** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**request_log_service_outputtype** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**request_log_service_onentry** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_engine_impl_log_request_logger_service_properties import OrgApacheSlingEngineImplLogRequestLoggerServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties from a JSON string
org_apache_sling_engine_impl_log_request_logger_service_properties_instance = OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.to_json())

# convert the object into a dict
org_apache_sling_engine_impl_log_request_logger_service_properties_dict = org_apache_sling_engine_impl_log_request_logger_service_properties_instance.to_dict()
# create an instance of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties from a dict
org_apache_sling_engine_impl_log_request_logger_service_properties_from_dict = OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.from_dict(org_apache_sling_engine_impl_log_request_logger_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


