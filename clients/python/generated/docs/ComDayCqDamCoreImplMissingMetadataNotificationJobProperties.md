# ComDayCqDamCoreImplMissingMetadataNotificationJobProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cq_dam_missingmetadata_notification_scheduler_istimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cq_dam_missingmetadata_notification_scheduler_timebased_rule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_dam_missingmetadata_notification_scheduler_period_rule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_dam_missingmetadata_notification_recipient** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_dam_core_impl_missing_metadata_notification_job_properties import ComDayCqDamCoreImplMissingMetadataNotificationJobProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplMissingMetadataNotificationJobProperties from a JSON string
com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_instance = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.to_json())

# convert the object into a dict
com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_dict = com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplMissingMetadataNotificationJobProperties from a dict
com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_from_dict = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.from_dict(com_day_cq_dam_core_impl_missing_metadata_notification_job_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


