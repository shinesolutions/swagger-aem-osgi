
# ComDayCqWcmUndoUndoConfigProperties


## Properties

Name | Type
------------ | -------------
`cqWcmUndoEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cqWcmUndoPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`cqWcmUndoValidity` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cqWcmUndoSteps` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cqWcmUndoPersistence` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`cqWcmUndoPersistenceMode` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cqWcmUndoMarkermode` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`cqWcmUndoWhitelist` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`cqWcmUndoBlacklist` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComDayCqWcmUndoUndoConfigProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "cqWcmUndoEnabled": null,
  "cqWcmUndoPath": null,
  "cqWcmUndoValidity": null,
  "cqWcmUndoSteps": null,
  "cqWcmUndoPersistence": null,
  "cqWcmUndoPersistenceMode": null,
  "cqWcmUndoMarkermode": null,
  "cqWcmUndoWhitelist": null,
  "cqWcmUndoBlacklist": null,
} satisfies ComDayCqWcmUndoUndoConfigProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqWcmUndoUndoConfigProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


