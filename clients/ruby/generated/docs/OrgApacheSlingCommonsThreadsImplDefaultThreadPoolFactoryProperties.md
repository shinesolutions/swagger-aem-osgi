# SwaggerAemOsgiClient::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **min_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **queue_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_thread_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **keep_alive_time** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **block_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **shutdown_graceful** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **daemon** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **shutdown_wait_time** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.new(
  name: null,
  min_pool_size: null,
  max_pool_size: null,
  queue_size: null,
  max_thread_age: null,
  keep_alive_time: null,
  block_policy: null,
  shutdown_graceful: null,
  daemon: null,
  shutdown_wait_time: null,
  priority: null
)
```

