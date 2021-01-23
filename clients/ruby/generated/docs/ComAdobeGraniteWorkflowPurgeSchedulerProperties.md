# SwaggerAemOsgiClient::ComAdobeGraniteWorkflowPurgeSchedulerProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **scheduledpurge_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **scheduledpurge_workflow_status** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **scheduledpurge_model_ids** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **scheduledpurge_daysold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeGraniteWorkflowPurgeSchedulerProperties.new(
  scheduledpurge_name: null,
  scheduledpurge_workflow_status: null,
  scheduledpurge_model_ids: null,
  scheduledpurge_daysold: null
)
```

