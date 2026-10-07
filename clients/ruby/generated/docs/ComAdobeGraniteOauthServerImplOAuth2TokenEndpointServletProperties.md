# SwaggerAemOsgiClient::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **oauth_issuer** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **oauth_access_token_expires_in** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **osgi_http_whiteboard_servlet_pattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **osgi_http_whiteboard_context_select** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.new(
  oauth_issuer: null,
  oauth_access_token_expires_in: null,
  osgi_http_whiteboard_servlet_pattern: null,
  osgi_http_whiteboard_context_select: null
)
```

