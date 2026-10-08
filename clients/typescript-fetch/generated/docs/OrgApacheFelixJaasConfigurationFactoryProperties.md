
# OrgApacheFelixJaasConfigurationFactoryProperties


## Properties

Name | Type
------------ | -------------
`jaasControlFlag` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`jaasRanking` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`jaasRealmName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jaasClassname` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jaasOptions` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheFelixJaasConfigurationFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "jaasControlFlag": null,
  "jaasRanking": null,
  "jaasRealmName": null,
  "jaasClassname": null,
  "jaasOptions": null,
} satisfies OrgApacheFelixJaasConfigurationFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheFelixJaasConfigurationFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


