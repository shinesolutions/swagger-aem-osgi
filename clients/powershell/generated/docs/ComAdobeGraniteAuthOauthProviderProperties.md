# ComAdobeGraniteAuthOauthProviderProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthConfigId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthClientId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthClientSecret** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthScope** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OauthConfigProviderId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthCreateUsers** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthUseridProperty** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ForceStrictUsernameMatching** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthEncodeUserids** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthHashUserids** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthCallBackUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthAccessTokenPersist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthAccessTokenPersistCookie** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthCsrfStateProtection** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthRedirectRequestParams** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthConfigSiblingsAllow** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthOauthProviderProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthOauthProviderProperties  -OauthConfigId null `
 -OauthClientId null `
 -OauthClientSecret null `
 -OauthScope null `
 -OauthConfigProviderId null `
 -OauthCreateUsers null `
 -OauthUseridProperty null `
 -ForceStrictUsernameMatching null `
 -OauthEncodeUserids null `
 -OauthHashUserids null `
 -OauthCallBackUrl null `
 -OauthAccessTokenPersist null `
 -OauthAccessTokenPersistCookie null `
 -OauthCsrfStateProtection null `
 -OauthRedirectRequestParams null `
 -OauthConfigSiblingsAllow null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthOauthProviderProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

