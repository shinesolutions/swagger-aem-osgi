# OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PullItems** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PackageBuilderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TransportSecretProviderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties  -Name null `
 -Endpoints null `
 -PullItems null `
 -PackageBuilderTarget null `
 -TransportSecretProviderTarget null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

