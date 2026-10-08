# ComDayCqDamCoreImplServletBinaryProviderServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingServletResourceTypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingServletMethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqDamDrmEnable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplServletBinaryProviderServletProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplServletBinaryProviderServletProperties  -SlingServletResourceTypes null `
 -SlingServletMethods null `
 -CqDamDrmEnable null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplServletBinaryProviderServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

