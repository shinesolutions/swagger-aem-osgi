# ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthProviderId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGithubAuthorizationUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGithubTokenUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGithubProfileUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthOauthImplGithubProviderImplProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthOauthImplGithubProviderImplProperties  -OauthProviderId null `
 -OauthProviderGithubAuthorizationUrl null `
 -OauthProviderGithubTokenUrl null `
 -OauthProviderGithubProfileUrl null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthOauthImplGithubProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

