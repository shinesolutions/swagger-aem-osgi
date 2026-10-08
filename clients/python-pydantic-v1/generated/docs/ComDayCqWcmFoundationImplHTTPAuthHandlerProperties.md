# ComDayCqWcmFoundationImplHTTPAuthHandlerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_http_nologin** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**auth_http_realm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_default_loginpage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_cred_form** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auth_cred_utf8** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_wcm_foundation_impl_http_auth_handler_properties import ComDayCqWcmFoundationImplHTTPAuthHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqWcmFoundationImplHTTPAuthHandlerProperties from a JSON string
com_day_cq_wcm_foundation_impl_http_auth_handler_properties_instance = ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.to_json()

# convert the object into a dict
com_day_cq_wcm_foundation_impl_http_auth_handler_properties_dict = com_day_cq_wcm_foundation_impl_http_auth_handler_properties_instance.to_dict()
# create an instance of ComDayCqWcmFoundationImplHTTPAuthHandlerProperties from a dict
com_day_cq_wcm_foundation_impl_http_auth_handler_properties_from_dict = ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.from_dict(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


