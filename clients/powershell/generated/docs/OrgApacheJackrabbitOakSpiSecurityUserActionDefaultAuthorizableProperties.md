# OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnabledActions** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**UserPrivilegeNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GroupPrivilegeNames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Constraint** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties  -EnabledActions null `
 -UserPrivilegeNames null `
 -GroupPrivilegeNames null `
 -Constraint null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

