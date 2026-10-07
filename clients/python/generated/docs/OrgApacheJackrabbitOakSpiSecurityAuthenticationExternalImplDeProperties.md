# OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**handler_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**user_expiration_time** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**user_auto_membership** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**user_property_mapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**user_path_prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**user_membership_exp_time** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**user_membership_nesting_depth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**user_dynamic_membership** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**user_disable_missing** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**group_expiration_time** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**group_auto_membership** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**group_property_mapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**group_path_prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enable_rfc7613_usercase_mapped_profile** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties import OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties from a JSON string
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_instance = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.to_json())

# convert the object into a dict
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_dict = org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties from a dict
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_from_dict = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.from_dict(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


