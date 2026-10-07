# OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PoolName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AllowedPoolNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SchedulerUseleaderforsingle** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MetricsFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlowThresholdMillis** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties  -PoolName null `
 -AllowedPoolNames null `
 -SchedulerUseleaderforsingle null `
 -MetricsFilters null `
 -SlowThresholdMillis null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

