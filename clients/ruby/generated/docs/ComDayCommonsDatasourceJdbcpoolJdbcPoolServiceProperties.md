# SwaggerAemOsgiClient::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **jdbc_driver_class** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jdbc_connection_uri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jdbc_username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jdbc_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jdbc_validation_query** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **default_readonly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **default_autocommit** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **pool_max_wait_msec** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **datasource_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **datasource_svc_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.new(
  jdbc_driver_class: null,
  jdbc_connection_uri: null,
  jdbc_username: null,
  jdbc_password: null,
  jdbc_validation_query: null,
  default_readonly: null,
  default_autocommit: null,
  pool_size: null,
  pool_max_wait_msec: null,
  datasource_name: null,
  datasource_svc_properties: null
)
```

