# ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**dispatcher_address** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**dispatcher_filter_allowed** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**dispatcher_filter_blocked** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties import ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties from a JSON string
com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_instance = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.to_json()

# convert the object into a dict
com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_dict = com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_instance.to_dict()
# create an instance of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties from a dict
com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_from_dict = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.from_dict(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


