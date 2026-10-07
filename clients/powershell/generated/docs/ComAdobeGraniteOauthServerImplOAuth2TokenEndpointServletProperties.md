# ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthIssuer** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthAccessTokenExpiresIn** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OsgiHttpWhiteboardServletPattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OsgiHttpWhiteboardContextSelect** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties = Initialize-PSOpenAPIToolsComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties  -OauthIssuer null `
 -OauthAccessTokenExpiresIn null `
 -OsgiHttpWhiteboardServletPattern null `
 -OsgiHttpWhiteboardContextSelect null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

