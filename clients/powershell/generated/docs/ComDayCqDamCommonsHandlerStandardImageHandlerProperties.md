# ComDayCqDamCommonsHandlerStandardImageHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LargeFileThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LargeCommentThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamEnableExtMetaExtraction** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCommonsHandlerStandardImageHandlerProperties = Initialize-PSOpenAPIToolsComDayCqDamCommonsHandlerStandardImageHandlerProperties  -LargeFileThreshold null `
 -LargeCommentThreshold null `
 -CqDamEnableExtMetaExtraction null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCommonsHandlerStandardImageHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

