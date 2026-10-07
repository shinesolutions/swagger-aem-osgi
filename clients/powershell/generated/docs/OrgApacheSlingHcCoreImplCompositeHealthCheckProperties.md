# OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HcMbeanName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FilterTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**FilterCombineTagsWithOr** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHcCoreImplCompositeHealthCheckProperties = Initialize-PSOpenAPIToolsOrgApacheSlingHcCoreImplCompositeHealthCheckProperties  -HcName null `
 -HcTags null `
 -HcMbeanName null `
 -FilterTags null `
 -FilterCombineTagsWithOr null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHcCoreImplCompositeHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

