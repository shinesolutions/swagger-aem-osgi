# ComAdobeGraniteWorkflowPurgeSchedulerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ScheduledpurgeName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ScheduledpurgeWorkflowStatus** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ScheduledpurgeModelIds** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ScheduledpurgeDaysold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowPurgeSchedulerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowPurgeSchedulerProperties  -ScheduledpurgeName null `
 -ScheduledpurgeWorkflowStatus null `
 -ScheduledpurgeModelIds null `
 -ScheduledpurgeDaysold null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowPurgeSchedulerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

