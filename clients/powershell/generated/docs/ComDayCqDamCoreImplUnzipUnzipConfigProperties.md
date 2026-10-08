# ComDayCqDamCoreImplUnzipUnzipConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamConfigUnzipMaxuncompressedsize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamConfigUnzipEncoding** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplUnzipUnzipConfigProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplUnzipUnzipConfigProperties  -CqDamConfigUnzipMaxuncompressedsize null `
 -CqDamConfigUnzipEncoding null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplUnzipUnzipConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

