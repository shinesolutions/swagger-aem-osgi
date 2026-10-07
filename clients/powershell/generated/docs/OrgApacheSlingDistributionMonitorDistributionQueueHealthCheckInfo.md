# OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties**](OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

