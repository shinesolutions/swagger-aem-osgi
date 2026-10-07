# ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JobTopics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AllowSelfProcessTermination** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCoreJobJobHandlerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCoreJobJobHandlerProperties  -JobTopics null `
 -AllowSelfProcessTermination null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCoreJobJobHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

