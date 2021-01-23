# SwaggerAemOsgiClient::OrgApacheFelixScrScrServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ds_loglevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **ds_factory_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **ds_delayed_keep_instances** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **ds_lock_timeout_milliseconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **ds_stop_timeout_milliseconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **ds_global_extender** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheFelixScrScrServiceProperties.new(
  ds_loglevel: null,
  ds_factory_enabled: null,
  ds_delayed_keep_instances: null,
  ds_lock_timeout_milliseconds: null,
  ds_stop_timeout_milliseconds: null,
  ds_global_extender: null
)
```

