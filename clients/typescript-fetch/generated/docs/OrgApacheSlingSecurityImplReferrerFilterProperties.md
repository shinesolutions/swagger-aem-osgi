
# OrgApacheSlingSecurityImplReferrerFilterProperties


## Properties

Name | Type
------------ | -------------
`allowEmpty` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`allowHosts` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`allowHostsRegexp` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`filterMethods` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`excludeAgentsRegexp` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheSlingSecurityImplReferrerFilterProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "allowEmpty": null,
  "allowHosts": null,
  "allowHostsRegexp": null,
  "filterMethods": null,
  "excludeAgentsRegexp": null,
} satisfies OrgApacheSlingSecurityImplReferrerFilterProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingSecurityImplReferrerFilterProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


