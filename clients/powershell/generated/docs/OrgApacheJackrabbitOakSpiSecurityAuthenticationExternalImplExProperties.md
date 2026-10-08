# OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JaasRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JaasControlFlag** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasRealmName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdpName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SyncHandlerName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties = Initialize-PSOpenAPIToolsOrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties  -JaasRanking null `
 -JaasControlFlag null `
 -JaasRealmName null `
 -IdpName null `
 -SyncHandlerName null
```

- Convert the resource to JSON
```powershell
$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

