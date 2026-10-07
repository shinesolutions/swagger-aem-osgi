# OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ConfigRefResourceNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ConfigRefPropertyNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties  -Enabled null `
 -ConfigRefResourceNames null `
 -ConfigRefPropertyNames null `
 -ServiceRanking null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

