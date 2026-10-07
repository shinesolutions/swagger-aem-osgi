# ComDayCqAuthImplLoginSelectorHandlerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**auth_loginselector_mappings** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auth_loginselector_changepw_mappings** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auth_loginselector_defaultloginpage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_loginselector_defaultchangepwpage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_loginselector_handle** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auth_loginselector_handle_all_extensions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_auth_impl_login_selector_handler_properties import ComDayCqAuthImplLoginSelectorHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqAuthImplLoginSelectorHandlerProperties from a JSON string
com_day_cq_auth_impl_login_selector_handler_properties_instance = ComDayCqAuthImplLoginSelectorHandlerProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqAuthImplLoginSelectorHandlerProperties.to_json())

# convert the object into a dict
com_day_cq_auth_impl_login_selector_handler_properties_dict = com_day_cq_auth_impl_login_selector_handler_properties_instance.to_dict()
# create an instance of ComDayCqAuthImplLoginSelectorHandlerProperties from a dict
com_day_cq_auth_impl_login_selector_handler_properties_from_dict = ComDayCqAuthImplLoginSelectorHandlerProperties.from_dict(com_day_cq_auth_impl_login_selector_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


