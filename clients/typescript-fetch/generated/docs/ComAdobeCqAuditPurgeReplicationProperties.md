
# ComAdobeCqAuditPurgeReplicationProperties


## Properties

Name | Type
------------ | -------------
`auditlogRuleName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`auditlogRuleContentpath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`auditlogRuleMinimumage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`auditlogRuleTypes` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { ComAdobeCqAuditPurgeReplicationProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "auditlogRuleName": null,
  "auditlogRuleContentpath": null,
  "auditlogRuleMinimumage": null,
  "auditlogRuleTypes": null,
} satisfies ComAdobeCqAuditPurgeReplicationProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeCqAuditPurgeReplicationProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


