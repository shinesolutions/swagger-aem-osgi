# ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MailerEmailEmbed** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MailerEmailCharset** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MailerEmailRetrieverUserID** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MailerEmailRetrieverUserPWD** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties = Initialize-PSOpenAPIToolsComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties  -MailerEmailEmbed null `
 -MailerEmailCharset null `
 -MailerEmailRetrieverUserID null `
 -MailerEmailRetrieverUserPWD null
```

- Convert the resource to JSON
```powershell
$ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

