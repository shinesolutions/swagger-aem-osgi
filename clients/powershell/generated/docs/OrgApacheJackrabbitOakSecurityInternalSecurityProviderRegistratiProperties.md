# OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequiredServicePids** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthorizationCompositionType** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties  -RequiredServicePids null `
 -AuthorizationCompositionType null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

