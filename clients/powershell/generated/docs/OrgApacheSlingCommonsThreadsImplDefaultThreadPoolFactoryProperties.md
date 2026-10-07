# OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MinPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxThreadAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**KeepAliveTime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlockPolicy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ShutdownGraceful** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Daemon** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ShutdownWaitTime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties  -Name null `
 -MinPoolSize null `
 -MaxPoolSize null `
 -QueueSize null `
 -MaxThreadAge null `
 -KeepAliveTime null `
 -BlockPolicy null `
 -ShutdownGraceful null `
 -Daemon null `
 -ShutdownWaitTime null `
 -Priority null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

