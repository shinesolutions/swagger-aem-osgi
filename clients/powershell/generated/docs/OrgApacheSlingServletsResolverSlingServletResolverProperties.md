# OrgApacheSlingServletsResolverSlingServletResolverProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServletresolverServletRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ServletresolverCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServletresolverPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServletresolverDefaultExtensions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingServletsResolverSlingServletResolverProperties = Initialize-PSOpenAPIToolsOrgApacheSlingServletsResolverSlingServletResolverProperties  -ServletresolverServletRoot null `
 -ServletresolverCacheSize null `
 -ServletresolverPaths null `
 -ServletresolverDefaultExtensions null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingServletsResolverSlingServletResolverProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

