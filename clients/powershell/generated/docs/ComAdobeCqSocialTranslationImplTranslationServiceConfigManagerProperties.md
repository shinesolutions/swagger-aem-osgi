# ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TranslateLanguage** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**TranslateDisplay** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**TranslateAttribution** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TranslateCaching** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**TranslateSmartRendering** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**TranslateCachingDuration** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TranslateSessionSaveInterval** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TranslateSessionSaveBatchLimit** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties  -TranslateLanguage null `
 -TranslateDisplay null `
 -TranslateAttribution null `
 -TranslateCaching null `
 -TranslateSmartRendering null `
 -TranslateCachingDuration null `
 -TranslateSessionSaveInterval null `
 -TranslateSessionSaveBatchLimit null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

