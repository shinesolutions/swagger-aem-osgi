# ComAdobeCqProjectsPurgeSchedulerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ScheduledpurgeName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ScheduledpurgePurgeActive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ScheduledpurgeTemplates** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ScheduledpurgePurgeGroups** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ScheduledpurgePurgeAssets** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ScheduledpurgeTerminateRunningWorkflows** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ScheduledpurgeDaysold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ScheduledpurgeSaveThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqProjectsPurgeSchedulerProperties = Initialize-PSOpenAPIToolsComAdobeCqProjectsPurgeSchedulerProperties  -ScheduledpurgeName null `
 -ScheduledpurgePurgeActive null `
 -ScheduledpurgeTemplates null `
 -ScheduledpurgePurgeGroups null `
 -ScheduledpurgePurgeAssets null `
 -ScheduledpurgeTerminateRunningWorkflows null `
 -ScheduledpurgeDaysold null `
 -ScheduledpurgeSaveThreshold null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqProjectsPurgeSchedulerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

