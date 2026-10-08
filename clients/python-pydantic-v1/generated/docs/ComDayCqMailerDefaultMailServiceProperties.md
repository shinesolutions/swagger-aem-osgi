# ComDayCqMailerDefaultMailServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**smtp_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**smtp_port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**smtp_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**smtp_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**from_address** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**smtp_ssl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**smtp_starttls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**debug_email** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_mailer_default_mail_service_properties import ComDayCqMailerDefaultMailServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqMailerDefaultMailServiceProperties from a JSON string
com_day_cq_mailer_default_mail_service_properties_instance = ComDayCqMailerDefaultMailServiceProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqMailerDefaultMailServiceProperties.to_json()

# convert the object into a dict
com_day_cq_mailer_default_mail_service_properties_dict = com_day_cq_mailer_default_mail_service_properties_instance.to_dict()
# create an instance of ComDayCqMailerDefaultMailServiceProperties from a dict
com_day_cq_mailer_default_mail_service_properties_from_dict = ComDayCqMailerDefaultMailServiceProperties.from_dict(com_day_cq_mailer_default_mail_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


