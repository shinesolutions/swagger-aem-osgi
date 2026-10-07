
# ComAdobeGraniteAuthOauthProviderProperties


## Properties

Name | Type
------------ | -------------
`oauthConfigId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthClientId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthClientSecret` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthScope` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`oauthConfigProviderId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthCreateUsers` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthUseridProperty` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`forceStrictUsernameMatching` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthEncodeUserids` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthHashUserids` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthCallBackUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthAccessTokenPersist` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthAccessTokenPersistCookie` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthCsrfStateProtection` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthRedirectRequestParams` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`oauthConfigSiblingsAllow` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComAdobeGraniteAuthOauthProviderProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "oauthConfigId": null,
  "oauthClientId": null,
  "oauthClientSecret": null,
  "oauthScope": null,
  "oauthConfigProviderId": null,
  "oauthCreateUsers": null,
  "oauthUseridProperty": null,
  "forceStrictUsernameMatching": null,
  "oauthEncodeUserids": null,
  "oauthHashUserids": null,
  "oauthCallBackUrl": null,
  "oauthAccessTokenPersist": null,
  "oauthAccessTokenPersistCookie": null,
  "oauthCsrfStateProtection": null,
  "oauthRedirectRequestParams": null,
  "oauthConfigSiblingsAllow": null,
} satisfies ComAdobeGraniteAuthOauthProviderProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteAuthOauthProviderProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


