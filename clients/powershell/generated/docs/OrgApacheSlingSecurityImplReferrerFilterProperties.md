# OrgApacheSlingSecurityImplReferrerFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AllowEmpty** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AllowHosts** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AllowHostsRegexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FilterMethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ExcludeAgentsRegexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingSecurityImplReferrerFilterProperties = Initialize-PSOpenAPIToolsOrgApacheSlingSecurityImplReferrerFilterProperties  -AllowEmpty null `
 -AllowHosts null `
 -AllowHostsRegexp null `
 -FilterMethods null `
 -ExcludeAgentsRegexp null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingSecurityImplReferrerFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

