# ComDayCqWorkflowImplEmailEMailNotificationServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_address** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**host_prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**notify_onabort** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**notify_oncomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**notify_oncontainercomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**notify_useronly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_workflow_impl_email_e_mail_notification_service_properties import ComDayCqWorkflowImplEmailEMailNotificationServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWorkflowImplEmailEMailNotificationServiceProperties from a JSON string
com_day_cq_workflow_impl_email_e_mail_notification_service_properties_instance = ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.to_json())

# convert the object into a dict
com_day_cq_workflow_impl_email_e_mail_notification_service_properties_dict = com_day_cq_workflow_impl_email_e_mail_notification_service_properties_instance.to_dict()
# create an instance of ComDayCqWorkflowImplEmailEMailNotificationServiceProperties from a dict
com_day_cq_workflow_impl_email_e_mail_notification_service_properties_from_dict = ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.from_dict(com_day_cq_workflow_impl_email_e_mail_notification_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


