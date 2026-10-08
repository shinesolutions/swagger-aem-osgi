# ComDayCqMailerImplCqMailingServiceInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComDayCqMailerImplCqMailingServiceProperties**](ComDayCqMailerImplCqMailingServiceProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_mailer_impl_cq_mailing_service_info import ComDayCqMailerImplCqMailingServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqMailerImplCqMailingServiceInfo from a JSON string
com_day_cq_mailer_impl_cq_mailing_service_info_instance = ComDayCqMailerImplCqMailingServiceInfo.from_json(json)
# print the JSON string representation of the object
print ComDayCqMailerImplCqMailingServiceInfo.to_json()

# convert the object into a dict
com_day_cq_mailer_impl_cq_mailing_service_info_dict = com_day_cq_mailer_impl_cq_mailing_service_info_instance.to_dict()
# create an instance of ComDayCqMailerImplCqMailingServiceInfo from a dict
com_day_cq_mailer_impl_cq_mailing_service_info_from_dict = ComDayCqMailerImplCqMailingServiceInfo.from_dict(com_day_cq_mailer_impl_cq_mailing_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


