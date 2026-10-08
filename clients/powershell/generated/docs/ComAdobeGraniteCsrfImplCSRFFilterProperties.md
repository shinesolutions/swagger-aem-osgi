# ComAdobeGraniteCsrfImplCSRFFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FilterMethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FilterEnableSafeUserAgents** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**FilterSafeUserAgents** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FilterExcludedPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteCsrfImplCSRFFilterProperties = Initialize-PSOpenAPIToolsComAdobeGraniteCsrfImplCSRFFilterProperties  -FilterMethods null `
 -FilterEnableSafeUserAgents null `
 -FilterSafeUserAgents null `
 -FilterExcludedPaths null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteCsrfImplCSRFFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

