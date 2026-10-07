# ComAdobeGraniteAuthImsImplIMSProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthProviderId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsAuthorizationUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsTokenUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsProfileUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsExtendedDetailsUrls** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OauthProviderImsValidateTokenUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsSessionProperty** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsServiceTokenClientId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsServiceTokenClientSecret** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderImsServiceToken** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ImsOrgRef** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ImsGroupMapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OauthProviderImsOnlyLicenseGroup** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthImsImplIMSProviderImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthImsImplIMSProviderImplProperties  -OauthProviderId null `
 -OauthProviderImsAuthorizationUrl null `
 -OauthProviderImsTokenUrl null `
 -OauthProviderImsProfileUrl null `
 -OauthProviderImsExtendedDetailsUrls null `
 -OauthProviderImsValidateTokenUrl null `
 -OauthProviderImsSessionProperty null `
 -OauthProviderImsServiceTokenClientId null `
 -OauthProviderImsServiceTokenClientSecret null `
 -OauthProviderImsServiceToken null `
 -ImsOrgRef null `
 -ImsGroupMapping null `
 -OauthProviderImsOnlyLicenseGroup null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthImsImplIMSProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

