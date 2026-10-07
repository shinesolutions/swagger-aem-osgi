# ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqWorkflowConfigWorkflowPackagesRootPath** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CqWorkflowConfigWorkflowProcessLegacyMode** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqWorkflowConfigAllowLocking** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCoreWorkflowConfigProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCoreWorkflowConfigProperties  -CqWorkflowConfigWorkflowPackagesRootPath null `
 -CqWorkflowConfigWorkflowProcessLegacyMode null `
 -CqWorkflowConfigAllowLocking null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCoreWorkflowConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

