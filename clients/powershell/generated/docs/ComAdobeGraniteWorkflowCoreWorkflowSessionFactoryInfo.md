# ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties**](ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

