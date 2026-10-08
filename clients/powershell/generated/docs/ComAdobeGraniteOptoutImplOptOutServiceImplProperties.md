# ComAdobeGraniteOptoutImplOptOutServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OptoutCookies** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OptoutHeaders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OptoutWhitelistCookies** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteOptoutImplOptOutServiceImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteOptoutImplOptOutServiceImplProperties  -OptoutCookies null `
 -OptoutHeaders null `
 -OptoutWhitelistCookies null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteOptoutImplOptOutServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

