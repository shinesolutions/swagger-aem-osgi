# ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthProviderId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthCloudConfigRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProviderConfigRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProviderConfigCreateTagsEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ProviderConfigUserFolder** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ProviderConfigFacebookFetchFields** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ProviderConfigFacebookFields** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ProviderConfigRefreshUserdataEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties  -OauthProviderId null `
 -OauthCloudConfigRoot null `
 -ProviderConfigRoot null `
 -ProviderConfigCreateTagsEnabled null `
 -ProviderConfigUserFolder null `
 -ProviderConfigFacebookFetchFields null `
 -ProviderConfigFacebookFields null `
 -ProviderConfigRefreshUserdataEnabled null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

