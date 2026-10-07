# ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SyncTranslationStateSchedulingFormat** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SchedulingRepeatTranslationSchedulingFormat** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SyncTranslationStateLockTimeoutInMinutes** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ExportFormat** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties = Initialize-PSOpenAPIToolsComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties  -SyncTranslationStateSchedulingFormat null `
 -SchedulingRepeatTranslationSchedulingFormat null `
 -SyncTranslationStateLockTimeoutInMinutes null `
 -ExportFormat null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

