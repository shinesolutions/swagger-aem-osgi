# ComAdobeGraniteCorsImplCORSPolicyImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alloworigin** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Alloworiginregexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Allowedpaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Exposedheaders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Maxage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Supportedheaders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Supportedmethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Supportscredentials** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteCorsImplCORSPolicyImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteCorsImplCORSPolicyImplProperties  -Alloworigin null `
 -Alloworiginregexp null `
 -Allowedpaths null `
 -Exposedheaders null `
 -Maxage null `
 -Supportedheaders null `
 -Supportedmethods null `
 -Supportscredentials null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteCorsImplCORSPolicyImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

