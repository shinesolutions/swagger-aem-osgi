# SwaggerAemOsgiClient::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default_transport_agent_to_worker_prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **default_transport_agent_to_master_prefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **default_transport_input_package** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **default_transport_output_package** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **default_transport_replication_synchronous** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **default_transport_contentpackage** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **offloading_transporter_default_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.new(
  default_transport_agent_to_worker_prefix: null,
  default_transport_agent_to_master_prefix: null,
  default_transport_input_package: null,
  default_transport_output_package: null,
  default_transport_replication_synchronous: null,
  default_transport_contentpackage: null,
  offloading_transporter_default_enabled: null
)
```

