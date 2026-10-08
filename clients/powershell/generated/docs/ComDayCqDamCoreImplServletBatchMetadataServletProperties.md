# ComDayCqDamCoreImplServletBatchMetadataServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamBatchMetadataAssetDefault** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqDamBatchMetadataCollectionDefault** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqDamBatchMetadataMaxresources** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplServletBatchMetadataServletProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplServletBatchMetadataServletProperties  -CqDamBatchMetadataAssetDefault null `
 -CqDamBatchMetadataCollectionDefault null `
 -CqDamBatchMetadataMaxresources null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplServletBatchMetadataServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

