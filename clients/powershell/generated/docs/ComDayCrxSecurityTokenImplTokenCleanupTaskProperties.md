# ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnableTokenCleanupTask** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**BatchSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCrxSecurityTokenImplTokenCleanupTaskProperties = Initialize-PSOpenAPIToolsComDayCrxSecurityTokenImplTokenCleanupTaskProperties  -EnableTokenCleanupTask null `
 -SchedulerExpression null `
 -BatchSize null
```

- Convert the resource to JSON
```powershell
$ComDayCrxSecurityTokenImplTokenCleanupTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

