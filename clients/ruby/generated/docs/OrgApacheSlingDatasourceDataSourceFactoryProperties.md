# SwaggerAemOsgiClient::OrgApacheSlingDatasourceDataSourceFactoryProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **datasource_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **datasource_svc_prop_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **driver_class_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **default_auto_commit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **default_read_only** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **default_transaction_isolation** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **default_catalog** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **max_active** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_idle** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **min_idle** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **initial_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_wait** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **test_on_borrow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **test_on_return** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **test_while_idle** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **validation_query** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **validation_query_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **time_between_eviction_runs_millis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **min_evictable_idle_time_millis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **connection_properties** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **init_sql** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jdbc_interceptors** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **validation_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **log_validation_errors** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **datasource_svc_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingDatasourceDataSourceFactoryProperties.new(
  datasource_name: null,
  datasource_svc_prop_name: null,
  driver_class_name: null,
  url: null,
  username: null,
  password: null,
  default_auto_commit: null,
  default_read_only: null,
  default_transaction_isolation: null,
  default_catalog: null,
  max_active: null,
  max_idle: null,
  min_idle: null,
  initial_size: null,
  max_wait: null,
  max_age: null,
  test_on_borrow: null,
  test_on_return: null,
  test_while_idle: null,
  validation_query: null,
  validation_query_timeout: null,
  time_between_eviction_runs_millis: null,
  min_evictable_idle_time_millis: null,
  connection_properties: null,
  init_sql: null,
  jdbc_interceptors: null,
  validation_interval: null,
  log_validation_errors: null,
  datasource_svc_properties: null
)
```

