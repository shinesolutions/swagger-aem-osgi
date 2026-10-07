
# OrgApacheFelixEventadminImplEventAdminProperties


## Properties

Name | Type
------------ | -------------
`orgApacheFelixEventadminThreadPoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`orgApacheFelixEventadminAsyncToSyncThreadRatio` | [ConfigNodePropertyFloat](ConfigNodePropertyFloat.md)
`orgApacheFelixEventadminTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`orgApacheFelixEventadminRequireTopic` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`orgApacheFelixEventadminIgnoreTimeout` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`orgApacheFelixEventadminIgnoreTopic` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheFelixEventadminImplEventAdminProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "orgApacheFelixEventadminThreadPoolSize": null,
  "orgApacheFelixEventadminAsyncToSyncThreadRatio": null,
  "orgApacheFelixEventadminTimeout": null,
  "orgApacheFelixEventadminRequireTopic": null,
  "orgApacheFelixEventadminIgnoreTimeout": null,
  "orgApacheFelixEventadminIgnoreTopic": null,
} satisfies OrgApacheFelixEventadminImplEventAdminProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheFelixEventadminImplEventAdminProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


