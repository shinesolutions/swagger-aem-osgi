# ComDayCqDamCoreImplReportsReportPurgeServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_saved_reports** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**time_duration** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**enable_report_purge** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_dam_core_impl_reports_report_purge_service_properties import ComDayCqDamCoreImplReportsReportPurgeServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplReportsReportPurgeServiceProperties from a JSON string
com_day_cq_dam_core_impl_reports_report_purge_service_properties_instance = ComDayCqDamCoreImplReportsReportPurgeServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqDamCoreImplReportsReportPurgeServiceProperties.to_json())

# convert the object into a dict
com_day_cq_dam_core_impl_reports_report_purge_service_properties_dict = com_day_cq_dam_core_impl_reports_report_purge_service_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplReportsReportPurgeServiceProperties from a dict
com_day_cq_dam_core_impl_reports_report_purge_service_properties_from_dict = ComDayCqDamCoreImplReportsReportPurgeServiceProperties.from_dict(com_day_cq_dam_core_impl_reports_report_purge_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


