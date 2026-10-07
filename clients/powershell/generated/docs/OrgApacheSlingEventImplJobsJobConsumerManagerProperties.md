# OrgApacheSlingEventImplJobsJobConsumerManagerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheSlingInstallerConfigurationPersist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**JobConsumermanagerWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**JobConsumermanagerBlacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEventImplJobsJobConsumerManagerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEventImplJobsJobConsumerManagerProperties  -OrgApacheSlingInstallerConfigurationPersist null `
 -JobConsumermanagerWhitelist null `
 -JobConsumermanagerBlacklist null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEventImplJobsJobConsumerManagerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

