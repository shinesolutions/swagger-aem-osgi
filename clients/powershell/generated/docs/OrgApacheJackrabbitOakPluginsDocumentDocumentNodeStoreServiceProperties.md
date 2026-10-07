# OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mongouri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Db** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SocketKeepAlive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Cache** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**NodeCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PrevDocCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ChildrenCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DiffCachePercentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheSegmentCount** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheStackMoveDistance** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PersistentCache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JournalCache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CustomBlobStore** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**JournalGCInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JournalGCMaxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PrefetchExternalChanges** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Role** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**VersionGcMaxAgeInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**VersionGCExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**VersionGCTimeLimitInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobGcMaxAgeInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobTrackSnapshotIntervalInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RepositoryHome** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxReplicationLagInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DocumentStoreType** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**BundlingDisabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UpdateLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PersistentCacheIncludes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**LeaseCheckMode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties  -Mongouri null `
 -Db null `
 -SocketKeepAlive null `
 -Cache null `
 -NodeCachePercentage null `
 -PrevDocCachePercentage null `
 -ChildrenCachePercentage null `
 -DiffCachePercentage null `
 -CacheSegmentCount null `
 -CacheStackMoveDistance null `
 -BlobCacheSize null `
 -PersistentCache null `
 -JournalCache null `
 -CustomBlobStore null `
 -JournalGCInterval null `
 -JournalGCMaxAge null `
 -PrefetchExternalChanges null `
 -Role null `
 -VersionGcMaxAgeInSecs null `
 -VersionGCExpression null `
 -VersionGCTimeLimitInSecs null `
 -BlobGcMaxAgeInSecs null `
 -BlobTrackSnapshotIntervalInSecs null `
 -RepositoryHome null `
 -MaxReplicationLagInSecs null `
 -DocumentStoreType null `
 -BundlingDisabled null `
 -UpdateLimit null `
 -PersistentCacheIncludes null `
 -LeaseCheckMode null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

