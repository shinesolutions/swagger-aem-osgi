# ComDayCqDamCoreImplLightboxLightboxServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingServletPaths** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SlingServletMethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqDamEnableAnonymous** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplLightboxLightboxServletProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplLightboxLightboxServletProperties  -SlingServletPaths null `
 -SlingServletMethods null `
 -CqDamEnableAnonymous null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplLightboxLightboxServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

