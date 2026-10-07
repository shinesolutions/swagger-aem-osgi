# ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties**](ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_fd_fp_config_forms_portal_scheduler_service_info import ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo from a JSON string
com_adobe_fd_fp_config_forms_portal_scheduler_service_info_instance = ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.from_json(json)
# print the JSON string representation of the object
print ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.to_json()

# convert the object into a dict
com_adobe_fd_fp_config_forms_portal_scheduler_service_info_dict = com_adobe_fd_fp_config_forms_portal_scheduler_service_info_instance.to_dict()
# create an instance of ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo from a dict
com_adobe_fd_fp_config_forms_portal_scheduler_service_info_from_dict = ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.from_dict(com_adobe_fd_fp_config_forms_portal_scheduler_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


