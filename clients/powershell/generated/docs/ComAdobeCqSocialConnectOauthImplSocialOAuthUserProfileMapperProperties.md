# ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Facebook** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Twitter** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ProviderConfigUserFolder** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties  -Facebook null `
 -Twitter null `
 -ProviderConfigUserFolder null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

