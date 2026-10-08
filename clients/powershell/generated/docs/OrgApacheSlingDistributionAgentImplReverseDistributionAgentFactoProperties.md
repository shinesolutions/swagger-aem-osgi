# OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
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
**PackageExporterEndpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PullItems** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HttpConnTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestAuthorizationStrategyTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TransportSecretProviderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageBuilderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties  -Name null `
 -Title null `
 -Details null `
 -Enabled null `
 -ServiceName null `
 -LogLevel null `
 -QueueProcessingEnabled null `
 -PackageExporterEndpoints null `
 -PullItems null `
 -HttpConnTimeout null `
 -RequestAuthorizationStrategyTarget null `
 -TransportSecretProviderTarget null `
 -PackageBuilderTarget null `
 -TriggersTarget null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

