# OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TokenExpiration** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TokenLength** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TokenRefresh** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TokenCleanupThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PasswordHashAlgorithm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PasswordHashIterations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PasswordSaltSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties  -TokenExpiration null `
 -TokenLength null `
 -TokenRefresh null `
 -TokenCleanupThreshold null `
 -PasswordHashAlgorithm null `
 -PasswordHashIterations null `
 -PasswordSaltSize null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

