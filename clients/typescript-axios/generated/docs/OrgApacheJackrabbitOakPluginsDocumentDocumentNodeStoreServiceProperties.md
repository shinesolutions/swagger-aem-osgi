# OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mongouri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**db** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**socketKeepAlive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**cache** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**nodeCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**prevDocCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**childrenCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**diffCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**cacheSegmentCount** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**cacheStackMoveDistance** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**blobCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**persistentCache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**journalCache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**customBlobStore** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**journalGCInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**journalGCMaxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**prefetchExternalChanges** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**role** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**versionGcMaxAgeInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**versionGCExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**versionGCTimeLimitInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**blobGcMaxAgeInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**blobTrackSnapshotIntervalInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**repository_home** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**maxReplicationLagInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**documentStoreType** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**bundlingDisabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**updateLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**persistentCacheIncludes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**leaseCheckMode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties } from './api';

const instance: OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties = {
    mongouri,
    db,
    socketKeepAlive,
    cache,
    nodeCachePercentage,
    prevDocCachePercentage,
    childrenCachePercentage,
    diffCachePercentage,
    cacheSegmentCount,
    cacheStackMoveDistance,
    blobCacheSize,
    persistentCache,
    journalCache,
    customBlobStore,
    journalGCInterval,
    journalGCMaxAge,
    prefetchExternalChanges,
    role,
    versionGcMaxAgeInSecs,
    versionGCExpression,
    versionGCTimeLimitInSecs,
    blobGcMaxAgeInSecs,
    blobTrackSnapshotIntervalInSecs,
    repository_home,
    maxReplicationLagInSecs,
    documentStoreType,
    bundlingDisabled,
    updateLimit,
    persistentCacheIncludes,
    leaseCheckMode,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
