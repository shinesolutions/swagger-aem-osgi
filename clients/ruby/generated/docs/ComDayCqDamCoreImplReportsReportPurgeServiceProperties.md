# SwaggerAemOsgiClient::ComDayCqDamCoreImplReportsReportPurgeServiceProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **max_saved_reports** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **time_duration** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **enable_report_purge** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqDamCoreImplReportsReportPurgeServiceProperties.new(
  scheduler_expression: null,
  max_saved_reports: null,
  time_duration: null,
  enable_report_purge: null
)
```

