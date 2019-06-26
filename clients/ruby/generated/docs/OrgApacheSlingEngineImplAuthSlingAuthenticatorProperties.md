# SwaggerAemOsgiClient::OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties

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

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.new(osgi_http_whiteboard_context_select: null,
                                 osgi_http_whiteboard_listener: null,
                                 auth_sudo_cookie: null,
                                 auth_sudo_parameter: null,
                                 auth_annonymous: null,
                                 sling_auth_requirements: null,
                                 sling_auth_anonymous_user: null,
                                 sling_auth_anonymous_password: null,
                                 auth_http: null,
                                 auth_http_realm: null,
                                 auth_uri_suffix: null)
```


