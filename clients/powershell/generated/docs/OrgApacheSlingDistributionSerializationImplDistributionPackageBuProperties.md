# OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**FormatTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TempFsFolder** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FileThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MemoryUnit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**UseOffHeapMemory** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DigestAlgorithm** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**MonitoringQueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CleanupDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PackageFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PropertyFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties  -Name null `
 -Type null `
 -FormatTarget null `
 -TempFsFolder null `
 -FileThreshold null `
 -MemoryUnit null `
 -UseOffHeapMemory null `
 -DigestAlgorithm null `
 -MonitoringQueueSize null `
 -CleanupDelay null `
 -PackageFilters null `
 -PropertyFilters null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

