# ComDayCqDamCoreImplServletHealthCheckServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamSyncWorkflowId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqDamSyncFolderTypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplServletHealthCheckServletProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplServletHealthCheckServletProperties  -CqDamSyncWorkflowId null `
 -CqDamSyncFolderTypes null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplServletHealthCheckServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

