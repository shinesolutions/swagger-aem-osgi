# SwaggerAemOsgiClient::OrgApacheHttpProxyconfiguratorProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **proxy_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **proxy_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **proxy_port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **proxy_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **proxy_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **proxy_exceptions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheHttpProxyconfiguratorProperties.new(
  proxy_enabled: null,
  proxy_host: null,
  proxy_port: null,
  proxy_user: null,
  proxy_password: null,
  proxy_exceptions: null
)
```

