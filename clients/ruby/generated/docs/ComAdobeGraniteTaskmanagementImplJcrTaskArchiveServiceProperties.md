# SwaggerAemOsgiClient::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **archiving_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **archive_since_days_completed** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.new(
  archiving_enabled: null,
  scheduler_expression: null,
  archive_since_days_completed: null
)
```

