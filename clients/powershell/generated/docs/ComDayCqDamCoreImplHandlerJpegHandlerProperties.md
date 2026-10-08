# ComDayCqDamCoreImplHandlerJpegHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamEnableExtMetaExtraction** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LargeFileThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LargeCommentThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplHandlerJpegHandlerProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplHandlerJpegHandlerProperties  -CqDamEnableExtMetaExtraction null `
 -LargeFileThreshold null `
 -LargeCommentThreshold null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplHandlerJpegHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

