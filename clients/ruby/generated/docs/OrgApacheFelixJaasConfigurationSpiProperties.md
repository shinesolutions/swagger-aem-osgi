# SwaggerAemOsgiClient::OrgApacheFelixJaasConfigurationSpiProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **jaas_default_realm_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jaas_config_provider_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **jaas_global_config_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheFelixJaasConfigurationSpiProperties.new(
  jaas_default_realm_name: null,
  jaas_config_provider_name: null,
  jaas_global_config_policy: null
)
```

