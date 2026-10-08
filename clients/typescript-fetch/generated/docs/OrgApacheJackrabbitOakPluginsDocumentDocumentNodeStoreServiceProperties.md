
# OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties


## Properties

Name | Type
------------ | -------------
`mongouri` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`db` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`socketKeepAlive` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cache` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`nodeCachePercentage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`prevDocCachePercentage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`childrenCachePercentage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`diffCachePercentage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cacheSegmentCount` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cacheStackMoveDistance` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`blobCacheSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`persistentCache` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`journalCache` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`customBlobStore` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`journalGCInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`journalGCMaxAge` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`prefetchExternalChanges` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`role` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`versionGcMaxAgeInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`versionGCExpression` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`versionGCTimeLimitInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`blobGcMaxAgeInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`blobTrackSnapshotIntervalInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`repositoryHome` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`maxReplicationLagInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`documentStoreType` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`bundlingDisabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`updateLimit` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`persistentCacheIncludes` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`leaseCheckMode` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "mongouri": null,
  "db": null,
  "socketKeepAlive": null,
  "cache": null,
  "nodeCachePercentage": null,
  "prevDocCachePercentage": null,
  "childrenCachePercentage": null,
  "diffCachePercentage": null,
  "cacheSegmentCount": null,
  "cacheStackMoveDistance": null,
  "blobCacheSize": null,
  "persistentCache": null,
  "journalCache": null,
  "customBlobStore": null,
  "journalGCInterval": null,
  "journalGCMaxAge": null,
  "prefetchExternalChanges": null,
  "role": null,
  "versionGcMaxAgeInSecs": null,
  "versionGCExpression": null,
  "versionGCTimeLimitInSecs": null,
  "blobGcMaxAgeInSecs": null,
  "blobTrackSnapshotIntervalInSecs": null,
  "repositoryHome": null,
  "maxReplicationLagInSecs": null,
  "documentStoreType": null,
  "bundlingDisabled": null,
  "updateLimit": null,
  "persistentCacheIncludes": null,
  "leaseCheckMode": null,
} satisfies OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


