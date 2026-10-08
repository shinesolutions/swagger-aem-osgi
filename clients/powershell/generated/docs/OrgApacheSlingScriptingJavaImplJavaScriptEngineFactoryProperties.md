# OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JavaClassdebuginfo** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**JavaJavaEncoding** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JavaCompilerSourceVM** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JavaCompilerTargetVM** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties  -JavaClassdebuginfo null `
 -JavaJavaEncoding null `
 -JavaCompilerSourceVM null `
 -JavaCompilerTargetVM null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

