
# ComAdobeCqProjectsPurgeSchedulerProperties


## Properties

Name | Type
------------ | -------------
`scheduledpurgeName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`scheduledpurgePurgeActive` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`scheduledpurgeTemplates` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`scheduledpurgePurgeGroups` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`scheduledpurgePurgeAssets` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`scheduledpurgeTerminateRunningWorkflows` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`scheduledpurgeDaysold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`scheduledpurgeSaveThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComAdobeCqProjectsPurgeSchedulerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "scheduledpurgeName": null,
  "scheduledpurgePurgeActive": null,
  "scheduledpurgeTemplates": null,
  "scheduledpurgePurgeGroups": null,
  "scheduledpurgePurgeAssets": null,
  "scheduledpurgeTerminateRunningWorkflows": null,
  "scheduledpurgeDaysold": null,
  "scheduledpurgeSaveThreshold": null,
} satisfies ComAdobeCqProjectsPurgeSchedulerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeCqProjectsPurgeSchedulerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


