# OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LocaleDefault** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PreloadBundles** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**InvalidationDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingI18nImplJcrResourceBundleProviderProperties = Initialize-PSOpenAPIToolsOrgApacheSlingI18nImplJcrResourceBundleProviderProperties  -LocaleDefault null `
 -PreloadBundles null `
 -InvalidationDelay null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingI18nImplJcrResourceBundleProviderProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

