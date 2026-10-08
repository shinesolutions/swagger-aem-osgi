# ComDayCqDamCoreImplDamEventPurgeServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxSavedActivities** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SaveInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableActivityPurge** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EventTypes** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplDamEventPurgeServiceProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplDamEventPurgeServiceProperties  -SchedulerExpression null `
 -MaxSavedActivities null `
 -SaveInterval null `
 -EnableActivityPurge null `
 -EventTypes null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplDamEventPurgeServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

