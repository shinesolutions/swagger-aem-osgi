# OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jaas_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**jaas_control_flag** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jaas_realm_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**idp_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sync_handler_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties import OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties from a JSON string
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_instance = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_dict = org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties from a dict
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_from_dict = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.from_dict(org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


