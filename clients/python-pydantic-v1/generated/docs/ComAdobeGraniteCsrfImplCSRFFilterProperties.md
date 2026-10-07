# ComAdobeGraniteCsrfImplCSRFFilterProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter_methods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**filter_enable_safe_user_agents** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**filter_safe_user_agents** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**filter_excluded_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_csrf_impl_csrf_filter_properties import ComAdobeGraniteCsrfImplCSRFFilterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteCsrfImplCSRFFilterProperties from a JSON string
com_adobe_granite_csrf_impl_csrf_filter_properties_instance = ComAdobeGraniteCsrfImplCSRFFilterProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteCsrfImplCSRFFilterProperties.to_json()

# convert the object into a dict
com_adobe_granite_csrf_impl_csrf_filter_properties_dict = com_adobe_granite_csrf_impl_csrf_filter_properties_instance.to_dict()
# create an instance of ComAdobeGraniteCsrfImplCSRFFilterProperties from a dict
com_adobe_granite_csrf_impl_csrf_filter_properties_from_dict = ComAdobeGraniteCsrfImplCSRFFilterProperties.from_dict(com_adobe_granite_csrf_impl_csrf_filter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


