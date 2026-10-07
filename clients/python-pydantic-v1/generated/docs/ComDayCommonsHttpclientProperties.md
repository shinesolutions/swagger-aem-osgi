# ComDayCommonsHttpclientProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proxy_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**proxy_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_ntlm_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_ntlm_domain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_exceptions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_commons_httpclient_properties import ComDayCommonsHttpclientProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCommonsHttpclientProperties from a JSON string
com_day_commons_httpclient_properties_instance = ComDayCommonsHttpclientProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCommonsHttpclientProperties.to_json()

# convert the object into a dict
com_day_commons_httpclient_properties_dict = com_day_commons_httpclient_properties_instance.to_dict()
# create an instance of ComDayCommonsHttpclientProperties from a dict
com_day_commons_httpclient_properties_from_dict = ComDayCommonsHttpclientProperties.from_dict(com_day_commons_httpclient_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


