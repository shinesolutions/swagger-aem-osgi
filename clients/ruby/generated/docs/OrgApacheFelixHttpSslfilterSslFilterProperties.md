# SwaggerAemOsgiClient::OrgApacheFelixHttpSslfilterSslFilterProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ssl_forward_header** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **ssl_forward_value** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **ssl_forward_cert_header** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **rewrite_absolute_urls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheFelixHttpSslfilterSslFilterProperties.new(
  ssl_forward_header: null,
  ssl_forward_value: null,
  ssl_forward_cert_header: null,
  rewrite_absolute_urls: null
)
```

