# ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthCookieLoginTimeout** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthCookieMaxAge** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties  -OauthCookieLoginTimeout null `
 -OauthCookieMaxAge null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

