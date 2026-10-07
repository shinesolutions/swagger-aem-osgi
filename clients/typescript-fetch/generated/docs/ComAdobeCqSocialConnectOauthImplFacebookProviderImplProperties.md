
# ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties


## Properties

Name | Type
------------ | -------------
`oauthProviderId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthCloudConfigRoot` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`providerConfigRoot` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`providerConfigCreateTagsEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`providerConfigUserFolder` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`providerConfigFacebookFetchFields` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`providerConfigFacebookFields` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`providerConfigRefreshUserdataEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "oauthProviderId": null,
  "oauthCloudConfigRoot": null,
  "providerConfigRoot": null,
  "providerConfigCreateTagsEnabled": null,
  "providerConfigUserFolder": null,
  "providerConfigFacebookFetchFields": null,
  "providerConfigFacebookFields": null,
  "providerConfigRefreshUserdataEnabled": null,
} satisfies ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


