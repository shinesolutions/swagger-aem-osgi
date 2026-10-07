# ComDayCqDamCoreImplRenditionMakerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**XmpPropagate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**XmpExcludes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplRenditionMakerImplProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplRenditionMakerImplProperties  -XmpPropagate null `
 -XmpExcludes null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplRenditionMakerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

