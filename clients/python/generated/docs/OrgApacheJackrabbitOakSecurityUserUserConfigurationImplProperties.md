# OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**groups_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**system_relative_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**default_depth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**import_behavior** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**password_hash_algorithm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**password_hash_iterations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**password_salt_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**omit_admin_pw** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**support_auto_save** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**password_max_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**initial_password_change** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**password_history_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**password_expiry_for_admin** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cache_expiration** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**enable_rfc7613_usercase_mapped_profile** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties import OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties from a JSON string
org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_instance = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.to_json())

# convert the object into a dict
org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_dict = org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties from a dict
org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_from_dict = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.from_dict(org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


