# OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HcName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HcTags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HcMbeanName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LanguageExtension** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingHcCoreImplScriptableHealthCheckProperties = Initialize-PSOpenAPIToolsOrgApacheSlingHcCoreImplScriptableHealthCheckProperties  -HcName null `
 -HcTags null `
 -HcMbeanName null `
 -Expression null `
 -LanguageExtension null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingHcCoreImplScriptableHealthCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

