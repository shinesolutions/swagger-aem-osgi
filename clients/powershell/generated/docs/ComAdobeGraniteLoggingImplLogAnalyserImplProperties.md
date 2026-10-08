# ComAdobeGraniteLoggingImplLogAnalyserImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessagesQueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LoggerConfig** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MessagesSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteLoggingImplLogAnalyserImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteLoggingImplLogAnalyserImplProperties  -MessagesQueueSize null `
 -LoggerConfig null `
 -MessagesSize null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteLoggingImplLogAnalyserImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

