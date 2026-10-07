
# OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties


## Properties

Name | Type
------------ | -------------
`repositoryHome` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tarmkMode` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tarmkSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`segmentCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`stringCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`templateCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`stringDeduplicationCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`templateDeduplicationCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`nodeDeduplicationCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`pauseCompaction` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`compactionRetryCount` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`compactionForceTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`compactionSizeDeltaEstimation` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`compactionDisableEstimation` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`compactionRetainedGenerations` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`compactionMemoryThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`compactionProgressLog` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`standby` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`customBlobStore` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`customSegmentStore` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`splitPersistence` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`repositoryBackupDir` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`blobGcMaxAgeInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`blobTrackSnapshotIntervalInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "repositoryHome": null,
  "tarmkMode": null,
  "tarmkSize": null,
  "segmentCacheSize": null,
  "stringCacheSize": null,
  "templateCacheSize": null,
  "stringDeduplicationCacheSize": null,
  "templateDeduplicationCacheSize": null,
  "nodeDeduplicationCacheSize": null,
  "pauseCompaction": null,
  "compactionRetryCount": null,
  "compactionForceTimeout": null,
  "compactionSizeDeltaEstimation": null,
  "compactionDisableEstimation": null,
  "compactionRetainedGenerations": null,
  "compactionMemoryThreshold": null,
  "compactionProgressLog": null,
  "standby": null,
  "customBlobStore": null,
  "customSegmentStore": null,
  "splitPersistence": null,
  "repositoryBackupDir": null,
  "blobGcMaxAgeInSecs": null,
  "blobTrackSnapshotIntervalInSecs": null,
} satisfies OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


