# GuideLocalizationServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SupportedLocales** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**LocalizableProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GuideLocalizationServiceProperties = Initialize-PSOpenAPIToolsGuideLocalizationServiceProperties  -SupportedLocales null `
 -LocalizableProperties null
```

- Convert the resource to JSON
```powershell
$GuideLocalizationServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

