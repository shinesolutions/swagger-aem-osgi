
# ComAdobeGraniteRepositoryImplCommitStatsConfigProperties


## Properties

Name | Type
------------ | -------------
`enabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`intervalSeconds` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`commitsPerIntervalThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxLocationLength` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxDetailsShown` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`minDetailsPercentage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`threadMatchers` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`maxGreedyDepth` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`greedyStackMatchers` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`stackFilters` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`stackMatchers` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`stackCategorizers` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`stackShorteners` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComAdobeGraniteRepositoryImplCommitStatsConfigProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "enabled": null,
  "intervalSeconds": null,
  "commitsPerIntervalThreshold": null,
  "maxLocationLength": null,
  "maxDetailsShown": null,
  "minDetailsPercentage": null,
  "threadMatchers": null,
  "maxGreedyDepth": null,
  "greedyStackMatchers": null,
  "stackFilters": null,
  "stackMatchers": null,
  "stackCategorizers": null,
  "stackShorteners": null,
} satisfies ComAdobeGraniteRepositoryImplCommitStatsConfigProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


