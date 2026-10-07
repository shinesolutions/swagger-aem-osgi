# ComDayCqDamCoreImplEventDamEventAuditListenerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplEventDamEventAuditListenerProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplEventDamEventAuditListenerProperties  -EventFilter null `
 -Enabled null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplEventDamEventAuditListenerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

