# ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GetSystemWorkflowModels** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GetPackageRootPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCorePayloadMapCacheProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCorePayloadMapCacheProperties  -GetSystemWorkflowModels null `
 -GetPackageRootPath null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCorePayloadMapCacheProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

