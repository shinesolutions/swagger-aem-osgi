# ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**token_required_attr** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**token_alternate_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**token_encapsulated** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**skip_token_refresh** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_crx_security_token_impl_impl_token_authentication_handler_properties import ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties from a JSON string
com_day_crx_security_token_impl_impl_token_authentication_handler_properties_instance = ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.to_json()

# convert the object into a dict
com_day_crx_security_token_impl_impl_token_authentication_handler_properties_dict = com_day_crx_security_token_impl_impl_token_authentication_handler_properties_instance.to_dict()
# create an instance of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties from a dict
com_day_crx_security_token_impl_impl_token_authentication_handler_properties_from_dict = ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.from_dict(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


