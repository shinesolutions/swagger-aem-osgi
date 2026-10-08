# ComAdobeGraniteAuthOauthImplGraniteProviderProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthProviderId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGraniteAuthorizationUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGraniteTokenUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGraniteProfileUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthProviderGraniteExtendedDetailsUrls** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthOauthImplGraniteProviderProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthOauthImplGraniteProviderProperties  -OauthProviderId null `
 -OauthProviderGraniteAuthorizationUrl null `
 -OauthProviderGraniteTokenUrl null `
 -OauthProviderGraniteProfileUrl null `
 -OauthProviderGraniteExtendedDetailsUrls null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthOauthImplGraniteProviderProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

