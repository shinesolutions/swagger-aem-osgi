# OrgApacheSlingHapiImplHApiUtilImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheSlingHapiToolsResourcetype** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingHapiToolsCollectionresourcetype** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingHapiToolsSearchpaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OrgApacheSlingHapiToolsExternalurl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingHapiToolsEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHapiImplHApiUtilImplProperties = Initialize-PSOpenAPIToolsOrgApacheSlingHapiImplHApiUtilImplProperties  -OrgApacheSlingHapiToolsResourcetype null `
 -OrgApacheSlingHapiToolsCollectionresourcetype null `
 -OrgApacheSlingHapiToolsSearchpaths null `
 -OrgApacheSlingHapiToolsExternalurl null `
 -OrgApacheSlingHapiToolsEnabled null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHapiImplHApiUtilImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

