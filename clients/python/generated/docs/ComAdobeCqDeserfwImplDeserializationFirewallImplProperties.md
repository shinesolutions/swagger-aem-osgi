# ComAdobeCqDeserfwImplDeserializationFirewallImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firewall_deserialization_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**firewall_deserialization_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**firewall_deserialization_diagnostics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties import ComAdobeCqDeserfwImplDeserializationFirewallImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqDeserfwImplDeserializationFirewallImplProperties from a JSON string
com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_instance = ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_dict = com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqDeserfwImplDeserializationFirewallImplProperties from a dict
com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_from_dict = ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.from_dict(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


