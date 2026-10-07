# OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TimeoutInMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LongRunningFutureThresholdForCriticalMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ResultCacheTtlInMs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties = Initialize-PSOpenAPIToolsOrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties  -TimeoutInMs null `
 -LongRunningFutureThresholdForCriticalMs null `
 -ResultCacheTtlInMs null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

