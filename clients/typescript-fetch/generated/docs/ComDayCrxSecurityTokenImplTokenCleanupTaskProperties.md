
# ComDayCrxSecurityTokenImplTokenCleanupTaskProperties


## Properties

Name | Type
------------ | -------------
`enableTokenCleanupTask` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`schedulerExpression` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`batchSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComDayCrxSecurityTokenImplTokenCleanupTaskProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "enableTokenCleanupTask": null,
  "schedulerExpression": null,
  "batchSize": null,
} satisfies ComDayCrxSecurityTokenImplTokenCleanupTaskProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


