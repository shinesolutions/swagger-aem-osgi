# ComDayCqDamCommonsUtilImplAssetCacheImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LargeFileMin** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheApply** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MimeTypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCommonsUtilImplAssetCacheImplProperties = Initialize-PSOpenAPIToolsComDayCqDamCommonsUtilImplAssetCacheImplProperties  -LargeFileMin null `
 -CacheApply null `
 -MimeTypes null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCommonsUtilImplAssetCacheImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

