# OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TargetStartLevel** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TargetStartLevelPropName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties = Initialize-PSOpenAPIToolsOrgApacheFelixSystemreadyImplFrameworkStartCheckProperties  -Timeout null `
 -TargetStartLevel null `
 -TargetStartLevelPropName null `
 -Type null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

