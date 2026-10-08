# SwaggerAemOsgiClient::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **enabled_actions** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |
| **user_privilege_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **group_privilege_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **constraint** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.new(
  enabled_actions: null,
  user_privilege_names: null,
  group_privilege_names: null,
  constraint: null
)
```

