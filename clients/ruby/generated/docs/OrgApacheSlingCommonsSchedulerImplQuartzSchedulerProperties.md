# SwaggerAemOsgiClient::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pool_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **allowed_pool_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **scheduler_useleaderforsingle** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **metrics_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **slow_threshold_millis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.new(
  pool_name: null,
  allowed_pool_names: null,
  scheduler_useleaderforsingle: null,
  metrics_filters: null,
  slow_threshold_millis: null
)
```

