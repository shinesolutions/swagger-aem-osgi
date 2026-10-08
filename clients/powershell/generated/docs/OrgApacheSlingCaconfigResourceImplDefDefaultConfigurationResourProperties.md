# OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ConfigPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FallbackPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ConfigCollectionInheritancePropertyNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties  -Enabled null `
 -ConfigPath null `
 -FallbackPaths null `
 -ConfigCollectionInheritancePropertyNames null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

