# ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthClientIdsAllowed** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthBearerSyncIms** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AuthTokenRequestParameter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthBearerConfigid** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthJwtSupport** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties  -Path null `
 -OauthClientIdsAllowed null `
 -AuthBearerSyncIms null `
 -AuthTokenRequestParameter null `
 -OauthBearerConfigid null `
 -OauthJwtSupport null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

