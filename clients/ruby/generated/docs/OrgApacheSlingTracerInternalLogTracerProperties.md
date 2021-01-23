# SwaggerAemOsgiClient::OrgApacheSlingTracerInternalLogTracerProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tracer_sets** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **servlet_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **recording_cache_size_in_mb** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **recording_cache_duration_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **recording_compression_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **gzip_response** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingTracerInternalLogTracerProperties.new(
  tracer_sets: null,
  enabled: null,
  servlet_enabled: null,
  recording_cache_size_in_mb: null,
  recording_cache_duration_in_secs: null,
  recording_compression_enabled: null,
  gzip_response: null
)
```

