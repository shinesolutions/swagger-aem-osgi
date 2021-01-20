# SwaggerAemOsgiClient::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **job_purge_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **job_purge_max_jobs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.new(
  scheduler_expression: null,
  job_purge_threshold: null,
  job_purge_max_jobs: null
)
```

