# OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Disabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Debug** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LocalIndexDir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EnableOpenIndexAsync** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ThreadPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PrefetchIndexFiles** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ExtractedTextCacheSizeInMB** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ExtractedTextCacheExpiryInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AlwaysUsePreExtractedCache** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**BooleanClauseLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableHybridIndexing** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HybridQueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DisableStoredIndexDefinition** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DeletedBlobsCollectionEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PropIndexCleanerIntervalInSecs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableSingleBlobIndexFiles** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties  -Disabled null `
 -Debug null `
 -LocalIndexDir null `
 -EnableOpenIndexAsync null `
 -ThreadPoolSize null `
 -PrefetchIndexFiles null `
 -ExtractedTextCacheSizeInMB null `
 -ExtractedTextCacheExpiryInSecs null `
 -AlwaysUsePreExtractedCache null `
 -BooleanClauseLimit null `
 -EnableHybridIndexing null `
 -HybridQueueSize null `
 -DisableStoredIndexDefinition null `
 -DeletedBlobsCollectionEnabled null `
 -PropIndexCleanerIntervalInSecs null `
 -EnableSingleBlobIndexFiles null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

