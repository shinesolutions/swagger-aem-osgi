# SwaggerAemOsgiClient::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

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

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.new(path: null,
                                 service_ranking: null,
                                 idp_url: null,
                                 idp_cert_alias: null,
                                 idp_http_redirect: null,
                                 service_provider_entity_id: null,
                                 assertion_consumer_service_url: null,
                                 sp_private_key_alias: null,
                                 key_store_password: null,
                                 default_redirect_url: null,
                                 user_id_attribute: null,
                                 use_encryption: null,
                                 create_user: null,
                                 user_intermediate_path: null,
                                 add_group_memberships: null,
                                 group_membership_attribute: null,
                                 default_groups: null,
                                 name_id_format: null,
                                 synchronize_attributes: null,
                                 handle_logout: null,
                                 logout_url: null,
                                 clock_tolerance: null,
                                 digest_method: null,
                                 signature_method: null,
                                 identity_sync_type: null,
                                 idp_identifier: null)
```


