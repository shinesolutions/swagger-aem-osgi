# ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthHttpNologin** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AuthHttpRealm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthDefaultLoginpage** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthCredForm** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthCredUtf8** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmFoundationImplHTTPAuthHandlerProperties = Initialize-PSOpenAPIToolsComDayCqWcmFoundationImplHTTPAuthHandlerProperties  -Path null `
 -AuthHttpNologin null `
 -AuthHttpRealm null `
 -AuthDefaultLoginpage null `
 -AuthCredForm null `
 -AuthCredUtf8 null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmFoundationImplHTTPAuthHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

