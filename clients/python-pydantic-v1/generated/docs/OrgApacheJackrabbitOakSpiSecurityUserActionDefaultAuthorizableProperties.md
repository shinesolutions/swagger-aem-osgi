# OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled_actions** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**user_privilege_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**group_privilege_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**constraint** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties import OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties from a JSON string
org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_instance = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_dict = org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties from a dict
org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_from_dict = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.from_dict(org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


