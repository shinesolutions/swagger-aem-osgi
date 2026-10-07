# SwaggerAemOsgiClient::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **from_address** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **host_prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **notify_onabort** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **notify_oncomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **notify_oncontainercomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **notify_useronly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.new(
  from_address: null,
  host_prefix: null,
  notify_onabort: null,
  notify_oncomplete: null,
  notify_oncontainercomplete: null,
  notify_useronly: null
)
```

