# ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NuiEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**NuiServiceUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**NuiApiKey** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties = Initialize-PSOpenAPIToolsComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties  -NuiEnabled null `
 -NuiServiceUrl null `
 -NuiApiKey null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

