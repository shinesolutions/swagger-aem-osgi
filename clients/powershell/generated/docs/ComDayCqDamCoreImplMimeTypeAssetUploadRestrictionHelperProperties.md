# ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamAllowAllMime** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqDamAllowedAssetMimes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties  -CqDamAllowAllMime null `
 -CqDamAllowedAssetMimes null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

