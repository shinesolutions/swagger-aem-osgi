# OrgApacheSlingI18nImplI18NFilterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SlingFilterScope** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingI18nImplI18NFilterProperties = Initialize-PSOpenAPIToolsOrgApacheSlingI18nImplI18NFilterProperties  -ServiceRanking null `
 -SlingFilterScope null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingI18nImplI18NFilterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

