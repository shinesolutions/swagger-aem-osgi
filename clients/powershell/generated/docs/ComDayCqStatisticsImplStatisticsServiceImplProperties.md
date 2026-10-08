# ComDayCqStatisticsImplStatisticsServiceImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SchedulerConcurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Workspace** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**KeywordsPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AsyncEntries** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqStatisticsImplStatisticsServiceImplProperties = Initialize-PSOpenAPIToolsComDayCqStatisticsImplStatisticsServiceImplProperties  -SchedulerPeriod null `
 -SchedulerConcurrent null `
 -Path null `
 -Workspace null `
 -KeywordsPath null `
 -AsyncEntries null
```

- Convert the resource to JSON
```powershell
$ComDayCqStatisticsImplStatisticsServiceImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

