# ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CheckInternval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ExcludeIds** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**EncryptPing** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteLicenseImplLicenseCheckFilterProperties = Initialize-PSOpenAPIToolsComAdobeGraniteLicenseImplLicenseCheckFilterProperties  -CheckInternval null `
 -ExcludeIds null `
 -EncryptPing null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteLicenseImplLicenseCheckFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

