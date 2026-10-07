# ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DefaultPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties  -DefaultTimeout null `
 -MaxTimeout null `
 -DefaultPeriod null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

