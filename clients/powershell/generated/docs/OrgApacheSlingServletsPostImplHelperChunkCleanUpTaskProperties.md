# OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerExpression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SchedulerConcurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ChunkCleanupAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = Initialize-PSOpenAPIToolsOrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties  -SchedulerExpression null `
 -SchedulerConcurrent null `
 -ChunkCleanupAge null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

