# OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JobConsumermanagerDisableDistribution** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**StartupDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CleanupPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties  -JobConsumermanagerDisableDistribution null `
 -StartupDelay null `
 -CleanupPeriod null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

