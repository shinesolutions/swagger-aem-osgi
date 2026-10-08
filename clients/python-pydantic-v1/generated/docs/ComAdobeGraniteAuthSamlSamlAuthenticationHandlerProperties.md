# ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**idp_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**idp_cert_alias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**idp_http_redirect** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_provider_entity_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**assertion_consumer_service_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sp_private_key_alias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**key_store_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**default_redirect_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**user_id_attribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**use_encryption** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**create_user** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**user_intermediate_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**add_group_memberships** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**group_membership_attribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**default_groups** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**name_id_format** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**synchronize_attributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**handle_logout** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**logout_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**clock_tolerance** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**digest_method** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**signature_method** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**identity_sync_type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**idp_identifier** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_auth_saml_saml_authentication_handler_properties import ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties from a JSON string
com_adobe_granite_auth_saml_saml_authentication_handler_properties_instance = ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.to_json()

# convert the object into a dict
com_adobe_granite_auth_saml_saml_authentication_handler_properties_dict = com_adobe_granite_auth_saml_saml_authentication_handler_properties_instance.to_dict()
# create an instance of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties from a dict
com_adobe_granite_auth_saml_saml_authentication_handler_properties_from_dict = ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.from_dict(com_adobe_granite_auth_saml_saml_authentication_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


