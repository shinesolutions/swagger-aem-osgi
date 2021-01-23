# SwaggerAemOsgiClient::OrgApacheSlingEventJobsQueueConfigurationProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **queue_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **queue_topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **queue_type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **queue_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **queue_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **queue_retrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **queue_maxparallel** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] |
| **queue_keep_jobs** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **queue_prefer_run_on_creation_instance** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **queue_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingEventJobsQueueConfigurationProperties.new(
  queue_name: null,
  queue_topics: null,
  queue_type: null,
  queue_priority: null,
  queue_retries: null,
  queue_retrydelay: null,
  queue_maxparallel: null,
  queue_keep_jobs: null,
  queue_prefer_run_on_creation_instance: null,
  queue_thread_pool_size: null,
  service_ranking: null
)
```

