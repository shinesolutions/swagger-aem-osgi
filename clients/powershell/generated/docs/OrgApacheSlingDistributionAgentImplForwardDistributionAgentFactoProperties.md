# OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Title** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Details** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LogLevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AllowedRoots** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**QueueProcessingEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PackageImporterEndpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PassiveQueues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PriorityQueues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RetryStrategy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**RetryAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestAuthorizationStrategyTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TransportSecretProviderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageBuilderTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**QueueProvider** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AsyncDelivery** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HttpConnTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties  -Name null `
 -Title null `
 -Details null `
 -Enabled null `
 -ServiceName null `
 -LogLevel null `
 -AllowedRoots null `
 -QueueProcessingEnabled null `
 -PackageImporterEndpoints null `
 -PassiveQueues null `
 -PriorityQueues null `
 -RetryStrategy null `
 -RetryAttempts null `
 -RequestAuthorizationStrategyTarget null `
 -TransportSecretProviderTarget null `
 -PackageBuilderTarget null `
 -TriggersTarget null `
 -QueueProvider null `
 -AsyncDelivery null `
 -HttpConnTimeout null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

