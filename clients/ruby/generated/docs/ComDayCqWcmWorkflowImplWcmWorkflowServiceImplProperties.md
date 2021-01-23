# SwaggerAemOsgiClient::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **min_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_thread_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **cq_wcm_workflow_terminate_on_activate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **cq_wcm_worklfow_terminate_exclusion_list** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.new(
  event_filter: null,
  min_thread_pool_size: null,
  max_thread_pool_size: null,
  cq_wcm_workflow_terminate_on_activate: null,
  cq_wcm_worklfow_terminate_exclusion_list: null
)
```

