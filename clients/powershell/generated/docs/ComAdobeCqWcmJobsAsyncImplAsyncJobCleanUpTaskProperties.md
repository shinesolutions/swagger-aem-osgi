# ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JobPurgeThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JobPurgeMaxJobs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties = Initialize-PSOpenAPIToolsComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties  -SchedulerExpression null `
 -JobPurgeThreshold null `
 -JobPurgeMaxJobs null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

