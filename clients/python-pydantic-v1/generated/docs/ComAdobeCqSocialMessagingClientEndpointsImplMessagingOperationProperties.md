# ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**message_box_size_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**message_count_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**notify_failure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**failure_message_from** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**failure_template_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**min_wait_between_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**count_update_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**inbox_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sentitems_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**support_attachments** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**support_group_messaging** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**max_total_recipients** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**batch_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_total_attachment_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**attachment_type_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**allowed_attachment_types** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_selector** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**field_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties import ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties from a JSON string
com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_instance = ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.to_json()

# convert the object into a dict
com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_dict = com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties from a dict
com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_from_dict = ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.from_dict(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


