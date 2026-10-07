# OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**osgi_http_whiteboard_context_select** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**osgi_http_whiteboard_listener** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_sudo_cookie** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_sudo_parameter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_annonymous** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**sling_auth_requirements** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_auth_anonymous_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_auth_anonymous_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_http** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**auth_http_realm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auth_uri_suffix** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_engine_impl_auth_sling_authenticator_properties import OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties from a JSON string
org_apache_sling_engine_impl_auth_sling_authenticator_properties_instance = OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.to_json())

# convert the object into a dict
org_apache_sling_engine_impl_auth_sling_authenticator_properties_dict = org_apache_sling_engine_impl_auth_sling_authenticator_properties_instance.to_dict()
# create an instance of OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties from a dict
org_apache_sling_engine_impl_auth_sling_authenticator_properties_from_dict = OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.from_dict(org_apache_sling_engine_impl_auth_sling_authenticator_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


