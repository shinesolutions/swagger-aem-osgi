# ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamImageCacheMaxMemory** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamImageCacheMaxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamImageCacheMaxDimension** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplCacheCQBufferedImageCacheProperties  -CqDamImageCacheMaxMemory null `
 -CqDamImageCacheMaxAge null `
 -CqDamImageCacheMaxDimension null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

