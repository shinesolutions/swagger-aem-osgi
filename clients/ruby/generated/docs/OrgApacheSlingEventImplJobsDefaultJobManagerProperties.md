# SwaggerAemOsgiClient::OrgApacheSlingEventImplJobsDefaultJobManagerProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **queue_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **queue_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **queue_retrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **queue_maxparallel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingEventImplJobsDefaultJobManagerProperties.new(
  queue_priority: null,
  queue_retries: null,
  queue_retrydelay: null,
  queue_maxparallel: null
)
```

