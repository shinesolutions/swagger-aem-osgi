# ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JaasControlFlag** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasRealmName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JaasRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Headers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Cookies** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Parameters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Usermap** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Format** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TrustedCredentialsAttribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties  -Path null `
 -ServiceRanking null `
 -JaasControlFlag null `
 -JaasRealmName null `
 -JaasRanking null `
 -Headers null `
 -Cookies null `
 -Parameters null `
 -Usermap null `
 -Format null `
 -TrustedCredentialsAttribute null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

