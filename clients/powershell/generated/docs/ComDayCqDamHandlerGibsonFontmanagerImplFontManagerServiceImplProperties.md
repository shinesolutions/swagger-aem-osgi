# ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FontmgrSystemFontDir** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FontmgrAdobeFontDir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FontmgrCustomerFontDir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties = Initialize-PSOpenAPIToolsComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties  -EventFilter null `
 -FontmgrSystemFontDir null `
 -FontmgrAdobeFontDir null `
 -FontmgrCustomerFontDir null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

