# SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **permissions_jr2** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **import_behavior** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **read_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **administrative_principals** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **configuration_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.new(
  permissions_jr2: null,
  import_behavior: null,
  read_paths: null,
  administrative_principals: null,
  configuration_ranking: null
)
```

