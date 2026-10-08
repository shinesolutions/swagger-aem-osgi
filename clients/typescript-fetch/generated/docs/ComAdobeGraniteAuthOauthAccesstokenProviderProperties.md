
# ComAdobeGraniteAuthOauthAccesstokenProviderProperties


## Properties

Name | Type
------------ | -------------
`name` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenProviderTitle` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenProviderDefaultClaims` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`authTokenProviderEndpoint` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authAccessTokenRequest` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenProviderKeypairAlias` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenProviderConnTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`authTokenProviderSoTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`authTokenProviderClientId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenProviderScope` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenProviderReuseAccessToken` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`authTokenProviderRelaxedSsl` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`tokenRequestCustomizerType` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authTokenValidatorType` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeGraniteAuthOauthAccesstokenProviderProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "authTokenProviderTitle": null,
  "authTokenProviderDefaultClaims": null,
  "authTokenProviderEndpoint": null,
  "authAccessTokenRequest": null,
  "authTokenProviderKeypairAlias": null,
  "authTokenProviderConnTimeout": null,
  "authTokenProviderSoTimeout": null,
  "authTokenProviderClientId": null,
  "authTokenProviderScope": null,
  "authTokenProviderReuseAccessToken": null,
  "authTokenProviderRelaxedSsl": null,
  "tokenRequestCustomizerType": null,
  "authTokenValidatorType": null,
} satisfies ComAdobeGraniteAuthOauthAccesstokenProviderProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteAuthOauthAccesstokenProviderProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


