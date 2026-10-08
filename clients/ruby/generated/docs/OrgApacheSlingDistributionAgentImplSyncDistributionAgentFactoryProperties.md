# SwaggerAemOsgiClient::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **details** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **service_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **log_level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **queue_processing_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **passive_queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **package_exporter_endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **package_importer_endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **retry_strategy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **retry_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **pull_items** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **http_conn_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **request_authorization_strategy_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **transport_secret_provider_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **package_builder_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **triggers_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.new(
  name: null,
  title: null,
  details: null,
  enabled: null,
  service_name: null,
  log_level: null,
  queue_processing_enabled: null,
  passive_queues: null,
  package_exporter_endpoints: null,
  package_importer_endpoints: null,
  retry_strategy: null,
  retry_attempts: null,
  pull_items: null,
  http_conn_timeout: null,
  request_authorization_strategy_target: null,
  transport_secret_provider_target: null,
  package_builder_target: null,
  triggers_target: null
)
```

