
# ComDayCqWcmCoreImplVersionPurgeTaskProperties


## Properties

Name | Type
------------ | -------------
`versionpurgePaths` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`versionpurgeRecursive` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`versionpurgeMaxVersions` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`versionpurgeMinVersions` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`versionpurgeMaxAgeDays` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComDayCqWcmCoreImplVersionPurgeTaskProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "versionpurgePaths": null,
  "versionpurgeRecursive": null,
  "versionpurgeMaxVersions": null,
  "versionpurgeMinVersions": null,
  "versionpurgeMaxAgeDays": null,
} satisfies ComDayCqWcmCoreImplVersionPurgeTaskProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqWcmCoreImplVersionPurgeTaskProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


