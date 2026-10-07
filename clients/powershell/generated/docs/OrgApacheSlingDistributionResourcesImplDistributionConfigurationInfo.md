# OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties**](OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

