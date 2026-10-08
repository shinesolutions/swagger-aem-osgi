
# ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties


## Properties

Name | Type
------------ | -------------
`path` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`serviceRanking` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`jaasControlFlag` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jaasRealmName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jaasRanking` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`headers` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`cookies` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`parameters` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`usermap` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`format` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`trustedCredentialsAttribute` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "path": null,
  "serviceRanking": null,
  "jaasControlFlag": null,
  "jaasRealmName": null,
  "jaasRanking": null,
  "headers": null,
  "cookies": null,
  "parameters": null,
  "usermap": null,
  "format": null,
  "trustedCredentialsAttribute": null,
} satisfies ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


