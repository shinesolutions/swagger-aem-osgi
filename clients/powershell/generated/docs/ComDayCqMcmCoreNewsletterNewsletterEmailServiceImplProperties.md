# ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FromAddress** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SenderHost** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxBounceCount** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties = Initialize-PSOpenAPIToolsComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties  -FromAddress null `
 -SenderHost null `
 -MaxBounceCount null
```

- Convert the resource to JSON
```powershell
$ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

