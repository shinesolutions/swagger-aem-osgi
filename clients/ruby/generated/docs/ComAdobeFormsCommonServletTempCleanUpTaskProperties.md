# SwaggerAemOsgiClient::ComAdobeFormsCommonServletTempCleanUpTaskProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **duration_for_temporary_storage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **duration_for_anonymous_storage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeFormsCommonServletTempCleanUpTaskProperties.new(
  scheduler_expression: null,
  duration_for_temporary_storage: null,
  duration_for_anonymous_storage: null
)
```

