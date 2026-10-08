# OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PermissionsJr2** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ImportBehavior** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ReadPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AdministrativePrincipals** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ConfigurationRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties  -PermissionsJr2 null `
 -ImportBehavior null `
 -ReadPaths null `
 -AdministrativePrincipals null `
 -ConfigurationRanking null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

