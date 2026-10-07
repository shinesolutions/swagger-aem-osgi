# ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MaxQueuedJobs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties = Initialize-PSOpenAPIToolsComAdobeGraniteBundlesHcImplJobsHealthCheckProperties  -HcTags null `
 -MaxQueuedJobs null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

