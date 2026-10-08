
# ComAdobeGraniteAuthImsImplIMSProviderImplProperties


## Properties

Name | Type
------------ | -------------
`oauthProviderId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsAuthorizationUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsTokenUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsProfileUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsExtendedDetailsUrls` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`oauthProviderImsValidateTokenUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsSessionProperty` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsServiceTokenClientId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsServiceTokenClientSecret` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthProviderImsServiceToken` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`imsOrgRef` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`imsGroupMapping` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`oauthProviderImsOnlyLicenseGroup` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComAdobeGraniteAuthImsImplIMSProviderImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "oauthProviderId": null,
  "oauthProviderImsAuthorizationUrl": null,
  "oauthProviderImsTokenUrl": null,
  "oauthProviderImsProfileUrl": null,
  "oauthProviderImsExtendedDetailsUrls": null,
  "oauthProviderImsValidateTokenUrl": null,
  "oauthProviderImsSessionProperty": null,
  "oauthProviderImsServiceTokenClientId": null,
  "oauthProviderImsServiceTokenClientSecret": null,
  "oauthProviderImsServiceToken": null,
  "imsOrgRef": null,
  "imsGroupMapping": null,
  "oauthProviderImsOnlyLicenseGroup": null,
} satisfies ComAdobeGraniteAuthImsImplIMSProviderImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteAuthImsImplIMSProviderImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


