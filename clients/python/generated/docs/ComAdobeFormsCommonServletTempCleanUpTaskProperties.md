# ComAdobeFormsCommonServletTempCleanUpTaskProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**duration_for_temporary_storage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**duration_for_anonymous_storage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_forms_common_servlet_temp_clean_up_task_properties import ComAdobeFormsCommonServletTempCleanUpTaskProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeFormsCommonServletTempCleanUpTaskProperties from a JSON string
com_adobe_forms_common_servlet_temp_clean_up_task_properties_instance = ComAdobeFormsCommonServletTempCleanUpTaskProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeFormsCommonServletTempCleanUpTaskProperties.to_json())

# convert the object into a dict
com_adobe_forms_common_servlet_temp_clean_up_task_properties_dict = com_adobe_forms_common_servlet_temp_clean_up_task_properties_instance.to_dict()
# create an instance of ComAdobeFormsCommonServletTempCleanUpTaskProperties from a dict
com_adobe_forms_common_servlet_temp_clean_up_task_properties_from_dict = ComAdobeFormsCommonServletTempCleanUpTaskProperties.from_dict(com_adobe_forms_common_servlet_temp_clean_up_task_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


