
# ComDayCqDamCoreImplDamEventPurgeServiceProperties


## Properties

Name | Type
------------ | -------------
`schedulerExpression` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`maxSavedActivities` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`saveInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`enableActivityPurge` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`eventTypes` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { ComDayCqDamCoreImplDamEventPurgeServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "schedulerExpression": null,
  "maxSavedActivities": null,
  "saveInterval": null,
  "enableActivityPurge": null,
  "eventTypes": null,
} satisfies ComDayCqDamCoreImplDamEventPurgeServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqDamCoreImplDamEventPurgeServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


