# OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Details** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LogLevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueueProcessingEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PackageExporterTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageImporterTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RequestAuthorizationStrategyTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties  -Name null `
 -Title null `
 -Details null `
 -Enabled null `
 -ServiceName null `
 -LogLevel null `
 -QueueProcessingEnabled null `
 -PackageExporterTarget null `
 -PackageImporterTarget null `
 -RequestAuthorizationStrategyTarget null `
 -TriggersTarget null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

