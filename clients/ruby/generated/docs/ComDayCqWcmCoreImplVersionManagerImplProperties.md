# SwaggerAemOsgiClient::ComDayCqWcmCoreImplVersionManagerImplProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **versionmanager_create_version_on_activation** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **versionmanager_purging_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **versionmanager_purge_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **versionmanager_iv_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **versionmanager_max_age_days** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **versionmanager_max_number_versions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **versionmanager_min_number_versions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComDayCqWcmCoreImplVersionManagerImplProperties.new(
  versionmanager_create_version_on_activation: null,
  versionmanager_purging_enabled: null,
  versionmanager_purge_paths: null,
  versionmanager_iv_paths: null,
  versionmanager_max_age_days: null,
  versionmanager_max_number_versions: null,
  versionmanager_min_number_versions: null
)
```

