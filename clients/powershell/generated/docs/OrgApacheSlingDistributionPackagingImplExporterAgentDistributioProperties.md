# OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Queue** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DropInvalidItems** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AgentTarget** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties  -Name null `
 -Queue null `
 -DropInvalidItems null `
 -AgentTarget null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

