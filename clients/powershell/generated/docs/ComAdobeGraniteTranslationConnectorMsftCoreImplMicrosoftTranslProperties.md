# ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TranslationFactory** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultConnectorLabel** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultConnectorAttribution** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultConnectorWorkspaceId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultConnectorSubscriptionKey** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LanguageMapLocation** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CategoryMapLocation** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RetryAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TimeoutCount** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties = Initialize-PSOpenAPIToolsComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties  -TranslationFactory null `
 -DefaultConnectorLabel null `
 -DefaultConnectorAttribution null `
 -DefaultConnectorWorkspaceId null `
 -DefaultConnectorSubscriptionKey null `
 -LanguageMapLocation null `
 -CategoryMapLocation null `
 -RetryAttempts null `
 -TimeoutCount null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

