# OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RepositoryHome** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TarmkMode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TarmkSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SegmentCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**StringCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TemplateCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**StringDeduplicationCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TemplateDeduplicationCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**NodeDeduplicationCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PauseCompaction** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CompactionRetryCount** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionForceTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionSizeDeltaEstimation** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionDisableEstimation** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CompactionRetainedGenerations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionMemoryThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionProgressLog** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Standby** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CustomBlobStore** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CustomSegmentStore** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SplitPersistence** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RepositoryBackupDir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**BlobGcMaxAgeInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobTrackSnapshotIntervalInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Role** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RegisterDescriptors** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DispatchChanges** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties  -RepositoryHome null `
 -TarmkMode null `
 -TarmkSize null `
 -SegmentCacheSize null `
 -StringCacheSize null `
 -TemplateCacheSize null `
 -StringDeduplicationCacheSize null `
 -TemplateDeduplicationCacheSize null `
 -NodeDeduplicationCacheSize null `
 -PauseCompaction null `
 -CompactionRetryCount null `
 -CompactionForceTimeout null `
 -CompactionSizeDeltaEstimation null `
 -CompactionDisableEstimation null `
 -CompactionRetainedGenerations null `
 -CompactionMemoryThreshold null `
 -CompactionProgressLog null `
 -Standby null `
 -CustomBlobStore null `
 -CustomSegmentStore null `
 -SplitPersistence null `
 -RepositoryBackupDir null `
 -BlobGcMaxAgeInSecs null `
 -BlobTrackSnapshotIntervalInSecs null `
 -Role null `
 -RegisterDescriptors null `
 -DispatchChanges null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

