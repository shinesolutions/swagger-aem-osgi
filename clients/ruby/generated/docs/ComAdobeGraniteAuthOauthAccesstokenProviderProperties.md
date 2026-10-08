# SwaggerAemOsgiClient::ComAdobeGraniteAuthOauthAccesstokenProviderProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_provider_title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_provider_default_claims** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **auth_token_provider_endpoint** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_access_token_request** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_provider_keypair_alias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_provider_conn_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **auth_token_provider_so_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **auth_token_provider_client_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_provider_scope** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_provider_reuse_access_token** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **auth_token_provider_relaxed_ssl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **token_request_customizer_type** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auth_token_validator_type** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeGraniteAuthOauthAccesstokenProviderProperties.new(
  name: null,
  auth_token_provider_title: null,
  auth_token_provider_default_claims: null,
  auth_token_provider_endpoint: null,
  auth_access_token_request: null,
  auth_token_provider_keypair_alias: null,
  auth_token_provider_conn_timeout: null,
  auth_token_provider_so_timeout: null,
  auth_token_provider_client_id: null,
  auth_token_provider_scope: null,
  auth_token_provider_reuse_access_token: null,
  auth_token_provider_relaxed_ssl: null,
  token_request_customizer_type: null,
  auth_token_validator_type: null
)
```

