# OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token_expiration** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**token_length** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**token_refresh** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**token_cleanup_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**password_hash_algorithm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**password_hash_iterations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**password_salt_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties import OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties from a JSON string
org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_instance = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.to_json())

# convert the object into a dict
org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_dict = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties from a dict
org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_from_dict = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.from_dict(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


