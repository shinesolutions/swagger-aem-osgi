# ComDayCqSearchImplBuilderQueryBuilderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExcerptProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CacheMaxEntries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheEntryLifetime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**XpathUnion** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqSearchImplBuilderQueryBuilderImplProperties = Initialize-PSOpenAPIToolsComDayCqSearchImplBuilderQueryBuilderImplProperties  -ExcerptProperties null `
 -CacheMaxEntries null `
 -CacheEntryLifetime null `
 -XpathUnion null
```

- Convert the resource to JSON
```powershell
$ComDayCqSearchImplBuilderQueryBuilderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

