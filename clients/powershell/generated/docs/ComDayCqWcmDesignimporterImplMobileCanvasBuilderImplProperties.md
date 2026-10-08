# ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filepattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DeviceGroups** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**BuildPageNodes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**BuildClientLibs** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**BuildCanvasComponent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties = Initialize-PSOpenAPIToolsComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties  -Filepattern null `
 -DeviceGroups null `
 -BuildPageNodes null `
 -BuildClientLibs null `
 -BuildCanvasComponent null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

