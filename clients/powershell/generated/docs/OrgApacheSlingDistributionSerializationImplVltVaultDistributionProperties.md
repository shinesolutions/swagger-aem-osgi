# OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ImportMode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AclHandling** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageRoots** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PropertyFilters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TempFsFolder** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UseBinaryReferences** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AutoSaveThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CleanupDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FileThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MEGABYTES** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**UseOffHeapMemory** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DigestAlgorithm** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**MonitoringQueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PathsMapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StrictImport** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties  -Name null `
 -Type null `
 -ImportMode null `
 -AclHandling null `
 -PackageRoots null `
 -PackageFilters null `
 -PropertyFilters null `
 -TempFsFolder null `
 -UseBinaryReferences null `
 -AutoSaveThreshold null `
 -CleanupDelay null `
 -FileThreshold null `
 -MEGABYTES null `
 -UseOffHeapMemory null `
 -DigestAlgorithm null `
 -MonitoringQueueSize null `
 -PathsMapping null `
 -StrictImport null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

