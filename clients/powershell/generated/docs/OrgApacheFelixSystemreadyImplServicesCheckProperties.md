# OrgApacheFelixSystemreadyImplServicesCheckProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServicesList** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixSystemreadyImplServicesCheckProperties = Initialize-PSOpenAPIToolsOrgApacheFelixSystemreadyImplServicesCheckProperties  -ServicesList null `
 -Type null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixSystemreadyImplServicesCheckProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

