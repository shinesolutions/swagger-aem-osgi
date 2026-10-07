
# ComDayCqWcmCoreImplVersionManagerImplProperties


## Properties

Name | Type
------------ | -------------
`versionmanagerCreateVersionOnActivation` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`versionmanagerPurgingEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`versionmanagerPurgePaths` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`versionmanagerIvPaths` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`versionmanagerMaxAgeDays` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`versionmanagerMaxNumberVersions` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`versionmanagerMinNumberVersions` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComDayCqWcmCoreImplVersionManagerImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "versionmanagerCreateVersionOnActivation": null,
  "versionmanagerPurgingEnabled": null,
  "versionmanagerPurgePaths": null,
  "versionmanagerIvPaths": null,
  "versionmanagerMaxAgeDays": null,
  "versionmanagerMaxNumberVersions": null,
  "versionmanagerMinNumberVersions": null,
} satisfies ComDayCqWcmCoreImplVersionManagerImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqWcmCoreImplVersionManagerImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


