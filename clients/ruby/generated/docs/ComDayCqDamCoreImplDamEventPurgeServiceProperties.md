# SwaggerAemOsgiClient::ComDayCqDamCoreImplDamEventPurgeServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **max_saved_activities** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **save_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **enable_activity_purge** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **event_types** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqDamCoreImplDamEventPurgeServiceProperties.new(
  scheduler_expression: null,
  max_saved_activities: null,
  save_interval: null,
  enable_activity_purge: null,
  event_types: null
)
```

