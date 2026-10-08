# ComDayCqAuthImplCugCugSupportImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CugExemptedPrincipals** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CugEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CugPrincipalsRegex** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CugPrincipalsReplacement** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqAuthImplCugCugSupportImplProperties = Initialize-PSOpenAPIToolsComDayCqAuthImplCugCugSupportImplProperties  -CugExemptedPrincipals null `
 -CugEnabled null `
 -CugPrincipalsRegex null `
 -CugPrincipalsReplacement null
```

- Convert the resource to JSON
```powershell
$ComDayCqAuthImplCugCugSupportImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

