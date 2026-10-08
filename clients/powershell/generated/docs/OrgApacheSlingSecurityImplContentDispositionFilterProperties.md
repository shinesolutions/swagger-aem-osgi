# OrgApacheSlingSecurityImplContentDispositionFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SlingContentDispositionPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingContentDispositionExcludedPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**SlingContentDispositionAllPaths** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingSecurityImplContentDispositionFilterProperties = Initialize-PSOpenAPIToolsOrgApacheSlingSecurityImplContentDispositionFilterProperties  -SlingContentDispositionPaths null `
 -SlingContentDispositionExcludedPaths null `
 -SlingContentDispositionAllPaths null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingSecurityImplContentDispositionFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

