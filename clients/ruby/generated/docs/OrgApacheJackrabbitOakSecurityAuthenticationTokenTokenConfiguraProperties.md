# SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token_expiration** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **token_length** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **token_refresh** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **token_cleanup_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **password_hash_algorithm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **password_hash_iterations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **password_salt_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.new(
  token_expiration: null,
  token_length: null,
  token_refresh: null,
  token_cleanup_threshold: null,
  password_hash_algorithm: null,
  password_hash_iterations: null,
  password_salt_size: null
)
```

