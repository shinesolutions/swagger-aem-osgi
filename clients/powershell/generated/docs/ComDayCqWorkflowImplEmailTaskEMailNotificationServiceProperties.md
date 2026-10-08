# ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotifyOnupdate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**NotifyOncomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties = Initialize-PSOpenAPIToolsComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties  -NotifyOnupdate null `
 -NotifyOncomplete null
```

- Convert the resource to JSON
```powershell
$ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

