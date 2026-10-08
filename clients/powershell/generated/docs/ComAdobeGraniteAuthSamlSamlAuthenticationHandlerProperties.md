# ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**IdpUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdpCertAlias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdpHttpRedirect** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceProviderEntityId** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AssertionConsumerServiceURL** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SpPrivateKeyAlias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**KeyStorePassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultRedirectUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserIDAttribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UseEncryption** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CreateUser** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UserIntermediatePath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AddGroupMemberships** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GroupMembershipAttribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultGroups** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**NameIdFormat** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SynchronizeAttributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HandleLogout** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LogoutUrl** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ClockTolerance** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DigestMethod** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SignatureMethod** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdentitySyncType** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**IdpIdentifier** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties = Initialize-PSOpenAPIToolsComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties  -Path null `
 -ServiceRanking null `
 -IdpUrl null `
 -IdpCertAlias null `
 -IdpHttpRedirect null `
 -ServiceProviderEntityId null `
 -AssertionConsumerServiceURL null `
 -SpPrivateKeyAlias null `
 -KeyStorePassword null `
 -DefaultRedirectUrl null `
 -UserIDAttribute null `
 -UseEncryption null `
 -CreateUser null `
 -UserIntermediatePath null `
 -AddGroupMemberships null `
 -GroupMembershipAttribute null `
 -DefaultGroups null `
 -NameIdFormat null `
 -SynchronizeAttributes null `
 -HandleLogout null `
 -LogoutUrl null `
 -ClockTolerance null `
 -DigestMethod null `
 -SignatureMethod null `
 -IdentitySyncType null `
 -IdpIdentifier null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

