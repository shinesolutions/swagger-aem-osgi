# ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TokenRequiredAttr** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**TokenAlternateUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TokenEncapsulated** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SkipTokenRefresh** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = Initialize-PSOpenAPIToolsComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties  -Path null `
 -TokenRequiredAttr null `
 -TokenAlternateUrl null `
 -TokenEncapsulated null `
 -SkipTokenRefresh null
```

- Convert the resource to JSON
```powershell
$ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

