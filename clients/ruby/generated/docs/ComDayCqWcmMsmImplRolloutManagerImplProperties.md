# SwaggerAemOsgiClient::ComDayCqWcmMsmImplRolloutManagerImplProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **rolloutmgr_excludedprops_default** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **rolloutmgr_excludedparagraphprops_default** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **rolloutmgr_excludednodetypes_default** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **rolloutmgr_threadpool_maxsize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **rolloutmgr_threadpool_maxshutdowntime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **rolloutmgr_threadpool_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **rolloutmgr_commit_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **rolloutmgr_conflicthandling_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqWcmMsmImplRolloutManagerImplProperties.new(
  event_filter: null,
  rolloutmgr_excludedprops_default: null,
  rolloutmgr_excludedparagraphprops_default: null,
  rolloutmgr_excludednodetypes_default: null,
  rolloutmgr_threadpool_maxsize: null,
  rolloutmgr_threadpool_maxshutdowntime: null,
  rolloutmgr_threadpool_priority: null,
  rolloutmgr_commit_size: null,
  rolloutmgr_conflicthandling_enabled: null
)
```

