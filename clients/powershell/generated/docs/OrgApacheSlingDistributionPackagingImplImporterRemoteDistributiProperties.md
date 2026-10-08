# OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TransportSecretProviderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties  -Name null `
 -Endpoints null `
 -TransportSecretProviderTarget null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

