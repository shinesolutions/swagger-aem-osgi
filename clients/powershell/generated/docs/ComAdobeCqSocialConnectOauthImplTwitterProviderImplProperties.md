# ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthProviderId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthCloudConfigRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProviderConfigRoot** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ProviderConfigUserFolder** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ProviderConfigTwitterEnableParams** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ProviderConfigTwitterParams** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ProviderConfigRefreshUserdataEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties  -OauthProviderId null `
 -OauthCloudConfigRoot null `
 -ProviderConfigRoot null `
 -ProviderConfigUserFolder null `
 -ProviderConfigTwitterEnableParams null `
 -ProviderConfigTwitterParams null `
 -ProviderConfigRefreshUserdataEnabled null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

