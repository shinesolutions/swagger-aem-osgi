# ComDayCqCommonsImplExternalizerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalizerDomains** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ExternalizerHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ExternalizerContextpath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ExternalizerEncodedpath** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqCommonsImplExternalizerImplProperties = Initialize-PSOpenAPIToolsComDayCqCommonsImplExternalizerImplProperties  -ExternalizerDomains null `
 -ExternalizerHost null `
 -ExternalizerContextpath null `
 -ExternalizerEncodedpath null
```

- Convert the resource to JSON
```powershell
$ComDayCqCommonsImplExternalizerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

