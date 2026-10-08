# SwaggerAemOsgiClient::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **global_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_disk_usage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **persistence_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **thread_pool_max_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **scheduled_thread_pool_max_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **graceful_shutdown_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **addresses_max_delivery_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **addresses_expiry_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **addresses_address_full_message_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **addresses_max_size_bytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **addresses_page_size_bytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **addresses_page_cache_max_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **cluster_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **cluster_call_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_call_failover_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_client_failure_check_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_notification_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_notification_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **id_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_confirmation_window_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_connection_ttl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_duplicate_detection** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **cluster_initial_connect_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_max_retry_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_min_large_message_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_producer_window_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_reconnect_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_retry_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cluster_retry_interval_multiplier** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.new(
  service_ranking: null,
  global_size: null,
  max_disk_usage: null,
  persistence_enabled: null,
  thread_pool_max_size: null,
  scheduled_thread_pool_max_size: null,
  graceful_shutdown_timeout: null,
  queues: null,
  topics: null,
  addresses_max_delivery_attempts: null,
  addresses_expiry_delay: null,
  addresses_address_full_message_policy: null,
  addresses_max_size_bytes: null,
  addresses_page_size_bytes: null,
  addresses_page_cache_max_size: null,
  cluster_user: null,
  cluster_password: null,
  cluster_call_timeout: null,
  cluster_call_failover_timeout: null,
  cluster_client_failure_check_period: null,
  cluster_notification_attempts: null,
  cluster_notification_interval: null,
  id_cache_size: null,
  cluster_confirmation_window_size: null,
  cluster_connection_ttl: null,
  cluster_duplicate_detection: null,
  cluster_initial_connect_attempts: null,
  cluster_max_retry_interval: null,
  cluster_min_large_message_size: null,
  cluster_producer_window_size: null,
  cluster_reconnect_attempts: null,
  cluster_retry_interval: null,
  cluster_retry_interval_multiplier: null
)
```

