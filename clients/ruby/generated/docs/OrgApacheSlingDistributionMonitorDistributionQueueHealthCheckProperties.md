# SwaggerAemOsgiClient::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hc_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **hc_mbean_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **number_of_retries_allowed** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.new(
  hc_name: null,
  hc_tags: null,
  hc_mbean_name: null,
  number_of_retries_allowed: null
)
```

