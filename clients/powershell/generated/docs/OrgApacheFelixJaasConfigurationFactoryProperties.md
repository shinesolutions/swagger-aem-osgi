# OrgApacheFelixJaasConfigurationFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JaasControlFlag** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**JaasRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JaasRealmName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasClassname** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasOptions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixJaasConfigurationFactoryProperties = Initialize-PSOpenAPIToolsOrgApacheFelixJaasConfigurationFactoryProperties  -JaasControlFlag null `
 -JaasRanking null `
 -JaasRealmName null `
 -JaasClassname null `
 -JaasOptions null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixJaasConfigurationFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

