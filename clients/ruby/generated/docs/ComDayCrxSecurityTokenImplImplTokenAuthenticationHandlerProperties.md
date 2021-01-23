# SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **token_required_attr** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **token_alternate_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **token_encapsulated** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **skip_token_refresh** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.new(
  path: null,
  token_required_attr: null,
  token_alternate_url: null,
  token_encapsulated: null,
  skip_token_refresh: null
)
```

