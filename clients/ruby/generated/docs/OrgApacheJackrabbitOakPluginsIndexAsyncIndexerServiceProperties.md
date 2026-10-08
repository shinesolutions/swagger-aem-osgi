# SwaggerAemOsgiClient::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **async_configs** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **lease_time_out_minutes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **failing_index_timeout_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **error_warn_interval_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.new(
  async_configs: null,
  lease_time_out_minutes: null,
  failing_index_timeout_seconds: null,
  error_warn_interval_seconds: null
)
```

