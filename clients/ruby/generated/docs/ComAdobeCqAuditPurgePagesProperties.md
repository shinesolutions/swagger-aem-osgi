# SwaggerAemOsgiClient::ComAdobeCqAuditPurgePagesProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auditlog_rule_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auditlog_rule_contentpath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **auditlog_rule_minimumage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **auditlog_rule_types** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeCqAuditPurgePagesProperties.new(
  auditlog_rule_name: null,
  auditlog_rule_contentpath: null,
  auditlog_rule_minimumage: null,
  auditlog_rule_types: null
)
```

