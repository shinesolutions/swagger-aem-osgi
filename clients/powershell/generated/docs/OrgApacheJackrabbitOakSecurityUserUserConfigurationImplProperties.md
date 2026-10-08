# OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UsersPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**GroupsPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SystemRelativePath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ImportBehavior** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**PasswordHashAlgorithm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PasswordHashIterations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PasswordSaltSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OmitAdminPw** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SupportAutoSave** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PasswordMaxAge** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**InitialPasswordChange** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PasswordHistorySize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PasswordExpiryForAdmin** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CacheExpiration** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableRFC7613UsercaseMappedProfile** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties  -UsersPath null `
 -GroupsPath null `
 -SystemRelativePath null `
 -DefaultDepth null `
 -ImportBehavior null `
 -PasswordHashAlgorithm null `
 -PasswordHashIterations null `
 -PasswordSaltSize null `
 -OmitAdminPw null `
 -SupportAutoSave null `
 -PasswordMaxAge null `
 -InitialPasswordChange null `
 -PasswordHistorySize null `
 -PasswordExpiryForAdmin null `
 -CacheExpiration null `
 -EnableRFC7613UsercaseMappedProfile null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

