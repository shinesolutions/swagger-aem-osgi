# ComDayCqWcmCoreImplEventPageEventAuditListenerInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComDayCqWcmCoreImplEventPageEventAuditListenerProperties**](ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_wcm_core_impl_event_page_event_audit_listener_info import ComDayCqWcmCoreImplEventPageEventAuditListenerInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmCoreImplEventPageEventAuditListenerInfo from a JSON string
com_day_cq_wcm_core_impl_event_page_event_audit_listener_info_instance = ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.from_json(json)
# print the JSON string representation of the object
print(ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.to_json())

# convert the object into a dict
com_day_cq_wcm_core_impl_event_page_event_audit_listener_info_dict = com_day_cq_wcm_core_impl_event_page_event_audit_listener_info_instance.to_dict()
# create an instance of ComDayCqWcmCoreImplEventPageEventAuditListenerInfo from a dict
com_day_cq_wcm_core_impl_event_page_event_audit_listener_info_from_dict = ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.from_dict(com_day_cq_wcm_core_impl_event_page_event_audit_listener_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


