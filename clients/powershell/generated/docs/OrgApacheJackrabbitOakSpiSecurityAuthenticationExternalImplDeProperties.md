# OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HandlerName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserExpirationTime** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserAutoMembership** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**UserPropertyMapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**UserPathPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserMembershipExpTime** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserMembershipNestingDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**UserDynamicMembership** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UserDisableMissing** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GroupExpirationTime** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**GroupAutoMembership** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GroupPropertyMapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GroupPathPrefix** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EnableRFC7613UsercaseMappedProfile** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties  -HandlerName null `
 -UserExpirationTime null `
 -UserAutoMembership null `
 -UserPropertyMapping null `
 -UserPathPrefix null `
 -UserMembershipExpTime null `
 -UserMembershipNestingDepth null `
 -UserDynamicMembership null `
 -UserDisableMissing null `
 -GroupExpirationTime null `
 -GroupAutoMembership null `
 -GroupPropertyMapping null `
 -GroupPathPrefix null `
 -EnableRFC7613UsercaseMappedProfile null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

