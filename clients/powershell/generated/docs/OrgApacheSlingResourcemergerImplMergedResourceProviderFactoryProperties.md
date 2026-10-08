# OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MergeRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MergeReadOnly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties  -MergeRoot null `
 -MergeReadOnly null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

