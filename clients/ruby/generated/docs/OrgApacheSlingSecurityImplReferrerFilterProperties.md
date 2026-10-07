# SwaggerAemOsgiClient::OrgApacheSlingSecurityImplReferrerFilterProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **allow_empty** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **allow_hosts** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **allow_hosts_regexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **filter_methods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **exclude_agents_regexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheSlingSecurityImplReferrerFilterProperties.new(
  allow_empty: null,
  allow_hosts: null,
  allow_hosts_regexp: null,
  filter_methods: null,
  exclude_agents_regexp: null
)
```

