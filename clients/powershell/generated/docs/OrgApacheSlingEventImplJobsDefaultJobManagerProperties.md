# OrgApacheSlingEventImplJobsDefaultJobManagerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QueuePriority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueueRetries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueRetrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueMaxparallel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEventImplJobsDefaultJobManagerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEventImplJobsDefaultJobManagerProperties  -QueuePriority null `
 -QueueRetries null `
 -QueueRetrydelay null `
 -QueueMaxparallel null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEventImplJobsDefaultJobManagerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

