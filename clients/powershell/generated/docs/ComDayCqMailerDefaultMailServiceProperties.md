# ComDayCqMailerDefaultMailServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SmtpHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SmtpPort** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SmtpUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SmtpPassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FromAddress** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SmtpSsl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SmtpStarttls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DebugEmail** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqMailerDefaultMailServiceProperties = Initialize-PSOpenAPIToolsComDayCqMailerDefaultMailServiceProperties  -SmtpHost null `
 -SmtpPort null `
 -SmtpUser null `
 -SmtpPassword null `
 -FromAddress null `
 -SmtpSsl null `
 -SmtpStarttls null `
 -DebugEmail null
```

- Convert the resource to JSON
```powershell
$ComDayCqMailerDefaultMailServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

