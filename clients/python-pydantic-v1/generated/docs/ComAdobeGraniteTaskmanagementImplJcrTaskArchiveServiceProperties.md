# ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiving_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**archive_since_days_completed** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties import ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties from a JSON string
com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_instance = ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.to_json()

# convert the object into a dict
com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_dict = com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_instance.to_dict()
# create an instance of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties from a dict
com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_from_dict = ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.from_dict(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


