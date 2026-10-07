# OrgApacheFelixJaasConfigurationFactoryInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Properties** | [**OrgApacheFelixJaasConfigurationFactoryProperties**](OrgApacheFelixJaasConfigurationFactoryProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixJaasConfigurationFactoryInfo = Initialize-PSOpenAPIToolsOrgApacheFelixJaasConfigurationFactoryInfo  -VarPid null `
 -Title null `
 -Description null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixJaasConfigurationFactoryInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

