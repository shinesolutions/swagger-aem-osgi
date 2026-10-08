# ComDayCqDamCoreImplReportsReportPurgeServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxSavedReports** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TimeDuration** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableReportPurge** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqDamCoreImplReportsReportPurgeServiceProperties = Initialize-PSOpenAPIToolsComDayCqDamCoreImplReportsReportPurgeServiceProperties  -SchedulerExpression null `
 -MaxSavedReports null `
 -TimeDuration null `
 -EnableReportPurge null
```

- Convert the resource to JSON
```powershell
$ComDayCqDamCoreImplReportsReportPurgeServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

