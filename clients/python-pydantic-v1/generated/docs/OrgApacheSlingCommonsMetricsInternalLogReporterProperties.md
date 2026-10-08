# OrgApacheSlingCommonsMetricsInternalLogReporterProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**time_unit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**logger_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**pattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**registry_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_commons_metrics_internal_log_reporter_properties import OrgApacheSlingCommonsMetricsInternalLogReporterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCommonsMetricsInternalLogReporterProperties from a JSON string
org_apache_sling_commons_metrics_internal_log_reporter_properties_instance = OrgApacheSlingCommonsMetricsInternalLogReporterProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingCommonsMetricsInternalLogReporterProperties.to_json()

# convert the object into a dict
org_apache_sling_commons_metrics_internal_log_reporter_properties_dict = org_apache_sling_commons_metrics_internal_log_reporter_properties_instance.to_dict()
# create an instance of OrgApacheSlingCommonsMetricsInternalLogReporterProperties from a dict
org_apache_sling_commons_metrics_internal_log_reporter_properties_from_dict = OrgApacheSlingCommonsMetricsInternalLogReporterProperties.from_dict(org_apache_sling_commons_metrics_internal_log_reporter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


