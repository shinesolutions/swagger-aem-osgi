# ComDayCqWcmCoreImplLanguageManagerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LangmgrListPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LangmgrCountryDefault** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmCoreImplLanguageManagerImplProperties = Initialize-PSOpenAPIToolsComDayCqWcmCoreImplLanguageManagerImplProperties  -LangmgrListPath null `
 -LangmgrCountryDefault null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmCoreImplLanguageManagerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

