# OrgApacheSlingTenantInternalTenantProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TenantRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TenantPathMatcher** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingTenantInternalTenantProviderImplProperties = Initialize-PSOpenAPIToolsOrgApacheSlingTenantInternalTenantProviderImplProperties  -TenantRoot null `
 -TenantPathMatcher null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingTenantInternalTenantProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

