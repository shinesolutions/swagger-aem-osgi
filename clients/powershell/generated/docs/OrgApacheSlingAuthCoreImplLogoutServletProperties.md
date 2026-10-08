# OrgApacheSlingAuthCoreImplLogoutServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingServletMethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingServletPaths** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingAuthCoreImplLogoutServletProperties = Initialize-PSOpenAPIToolsOrgApacheSlingAuthCoreImplLogoutServletProperties  -SlingServletMethods null `
 -SlingServletPaths null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingAuthCoreImplLogoutServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

