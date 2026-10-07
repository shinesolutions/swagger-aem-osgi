# OrgApacheSlingEventJobsQueueConfigurationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QueueName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**QueueTopics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**QueueType** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueuePriority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueueRetries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueRetrydelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueMaxparallel** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**QueueKeepJobs** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**QueuePreferRunOnCreationInstance** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**QueueThreadPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingEventJobsQueueConfigurationProperties = Initialize-PSOpenAPIToolsOrgApacheSlingEventJobsQueueConfigurationProperties  -QueueName null `
 -QueueTopics null `
 -QueueType null `
 -QueuePriority null `
 -QueueRetries null `
 -QueueRetrydelay null `
 -QueueMaxparallel null `
 -QueueKeepJobs null `
 -QueuePreferRunOnCreationInstance null `
 -QueueThreadPoolSize null `
 -ServiceRanking null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingEventJobsQueueConfigurationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

