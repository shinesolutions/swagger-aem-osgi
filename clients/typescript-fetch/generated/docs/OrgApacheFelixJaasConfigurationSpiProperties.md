
# OrgApacheFelixJaasConfigurationSpiProperties


## Properties

Name | Type
------------ | -------------
`jaasDefaultRealmName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jaasConfigProviderName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jaasGlobalConfigPolicy` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { OrgApacheFelixJaasConfigurationSpiProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "jaasDefaultRealmName": null,
  "jaasConfigProviderName": null,
  "jaasGlobalConfigPolicy": null,
} satisfies OrgApacheFelixJaasConfigurationSpiProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheFelixJaasConfigurationSpiProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


