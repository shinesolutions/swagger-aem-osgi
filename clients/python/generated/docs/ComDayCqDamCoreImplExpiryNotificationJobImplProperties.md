# ComDayCqDamCoreImplExpiryNotificationJobImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cq_dam_expiry_notification_scheduler_istimebased** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cq_dam_expiry_notification_scheduler_timebased_rule** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_dam_expiry_notification_scheduler_period_rule** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**send_email** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**asset_expired_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**prior_notification_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_dam_expiry_notification_url_protocol** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_dam_core_impl_expiry_notification_job_impl_properties import ComDayCqDamCoreImplExpiryNotificationJobImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplExpiryNotificationJobImplProperties from a JSON string
com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_instance = ComDayCqDamCoreImplExpiryNotificationJobImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqDamCoreImplExpiryNotificationJobImplProperties.to_json())

# convert the object into a dict
com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_dict = com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplExpiryNotificationJobImplProperties from a dict
com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_from_dict = ComDayCqDamCoreImplExpiryNotificationJobImplProperties.from_dict(com_day_cq_dam_core_impl_expiry_notification_job_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


