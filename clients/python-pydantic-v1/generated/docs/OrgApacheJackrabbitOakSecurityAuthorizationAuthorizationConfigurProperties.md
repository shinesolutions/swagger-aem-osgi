# OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permissions_jr2** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**import_behavior** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**read_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**administrative_principals** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**configuration_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties import OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties from a JSON string
org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_instance = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_dict = org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties from a dict
org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_from_dict = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.from_dict(org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


