# ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventTopics** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EventFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TranslateListenerType** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TranslatePropertyList** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**KeepAliveTime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties  -EventTopics null `
 -EventFilter null `
 -TranslateListenerType null `
 -TranslatePropertyList null `
 -PoolSize null `
 -MaxPoolSize null `
 -QueueSize null `
 -KeepAliveTime null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

