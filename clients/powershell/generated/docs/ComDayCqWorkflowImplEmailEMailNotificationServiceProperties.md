# ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FromAddress** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HostPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**NotifyOnabort** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**NotifyOncomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**NotifyOncontainercomplete** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**NotifyUseronly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWorkflowImplEmailEMailNotificationServiceProperties = Initialize-PSOpenAPIToolsComDayCqWorkflowImplEmailEMailNotificationServiceProperties  -FromAddress null `
 -HostPrefix null `
 -NotifyOnabort null `
 -NotifyOncomplete null `
 -NotifyOncontainercomplete null `
 -NotifyUseronly null
```

- Convert the resource to JSON
```powershell
$ComDayCqWorkflowImplEmailEMailNotificationServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

