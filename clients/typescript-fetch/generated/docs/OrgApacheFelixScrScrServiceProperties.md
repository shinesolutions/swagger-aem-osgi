
# OrgApacheFelixScrScrServiceProperties


## Properties

Name | Type
------------ | -------------
`dsLoglevel` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`dsFactoryEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`dsDelayedKeepInstances` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`dsLockTimeoutMilliseconds` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`dsStopTimeoutMilliseconds` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`dsGlobalExtender` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheFelixScrScrServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "dsLoglevel": null,
  "dsFactoryEnabled": null,
  "dsDelayedKeepInstances": null,
  "dsLockTimeoutMilliseconds": null,
  "dsStopTimeoutMilliseconds": null,
  "dsGlobalExtender": null,
} satisfies OrgApacheFelixScrScrServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheFelixScrScrServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


