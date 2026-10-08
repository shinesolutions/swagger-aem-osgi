# SwaggerAemOsgiClient::ComDayCqDamCoreImplDamEventRecorderImplProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **event_queue_length** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **eventrecorder_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **eventrecorder_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **eventrecorder_eventtypes** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqDamCoreImplDamEventRecorderImplProperties.new(
  event_filter: null,
  event_queue_length: null,
  eventrecorder_enabled: null,
  eventrecorder_blacklist: null,
  eventrecorder_eventtypes: null
)
```

