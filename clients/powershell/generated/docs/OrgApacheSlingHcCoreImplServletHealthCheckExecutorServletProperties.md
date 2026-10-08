# OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServletPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Disabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CorsAccessControlAllowOrigin** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties = Initialize-PSOpenAPIToolsOrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties  -ServletPath null `
 -Disabled null `
 -CorsAccessControlAllowOrigin null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

