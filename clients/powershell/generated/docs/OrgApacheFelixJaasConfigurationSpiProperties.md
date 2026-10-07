# OrgApacheFelixJaasConfigurationSpiProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JaasDefaultRealmName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasConfigProviderName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasGlobalConfigPolicy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixJaasConfigurationSpiProperties = Initialize-PSOpenAPIToolsOrgApacheFelixJaasConfigurationSpiProperties  -JaasDefaultRealmName null `
 -JaasConfigProviderName null `
 -JaasGlobalConfigPolicy null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixJaasConfigurationSpiProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

