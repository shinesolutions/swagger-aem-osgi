# ConfigNodePropertyDropDown
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | property name | [optional] 
**Optional** | **Boolean** | True if optional | [optional] 
**IsSet** | **Boolean** | True if property is set | [optional] 
**Type** | [**ConfigNodePropertyDropDownType**](ConfigNodePropertyDropDownType.md) |  | [optional] 
**Value** | [**AnyType**](.md) | Property value | [optional] 
**Description** | **String** | Property description | [optional] 

## Examples

- Prepare the resource
```powershell
$ConfigNodePropertyDropDown = Initialize-PSOpenAPIToolsConfigNodePropertyDropDown  -Name null `
 -Optional null `
 -IsSet null `
 -Type null `
 -Value null `
 -Description null
```

- Convert the resource to JSON
```powershell
$ConfigNodePropertyDropDown | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

