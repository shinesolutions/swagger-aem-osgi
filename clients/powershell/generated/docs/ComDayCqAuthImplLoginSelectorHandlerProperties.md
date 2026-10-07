# ComDayCqAuthImplLoginSelectorHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AuthLoginselectorMappings** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthLoginselectorChangepwMappings** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthLoginselectorDefaultloginpage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthLoginselectorDefaultchangepwpage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthLoginselectorHandle** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthLoginselectorHandleAllExtensions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqAuthImplLoginSelectorHandlerProperties = Initialize-PSOpenAPIToolsComDayCqAuthImplLoginSelectorHandlerProperties  -Path null `
 -ServiceRanking null `
 -AuthLoginselectorMappings null `
 -AuthLoginselectorChangepwMappings null `
 -AuthLoginselectorDefaultloginpage null `
 -AuthLoginselectorDefaultchangepwpage null `
 -AuthLoginselectorHandle null `
 -AuthLoginselectorHandleAllExtensions null
```

- Convert the resource to JSON
```powershell
$ComDayCqAuthImplLoginSelectorHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

