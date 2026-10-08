# OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheJackrabbitOakAuthenticationAppName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheJackrabbitOakAuthenticationConfigSpiName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties  -OrgApacheJackrabbitOakAuthenticationAppName null `
 -OrgApacheJackrabbitOakAuthenticationConfigSpiName null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

