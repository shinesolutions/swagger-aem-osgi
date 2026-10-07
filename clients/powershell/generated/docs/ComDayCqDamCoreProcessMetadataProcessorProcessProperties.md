# ComDayCqDamCoreProcessMetadataProcessorProcessProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProcessLabel** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqDamEnableSha1** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqDamMetadataXssprotectedProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreProcessMetadataProcessorProcessProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreProcessMetadataProcessorProcessProperties  -ProcessLabel null `
 -CqDamEnableSha1 null `
 -CqDamMetadataXssprotectedProperties null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreProcessMetadataProcessorProcessProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

