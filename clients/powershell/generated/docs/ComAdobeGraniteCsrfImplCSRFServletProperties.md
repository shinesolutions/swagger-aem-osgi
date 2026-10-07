# ComAdobeGraniteCsrfImplCSRFServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CsrfTokenExpiresIn** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingAuthRequirements** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteCsrfImplCSRFServletProperties = Initialize-PSOpenAPIToolsComAdobeGraniteCsrfImplCSRFServletProperties  -CsrfTokenExpiresIn null `
 -SlingAuthRequirements null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteCsrfImplCSRFServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

