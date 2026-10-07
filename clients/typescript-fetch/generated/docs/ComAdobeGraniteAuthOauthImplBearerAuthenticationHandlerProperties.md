
# ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties


## Properties

Name | Type
------------ | -------------
`path` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthClientIdsAllowed` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`authBearerSyncIms` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`authTokenRequestParameter` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthBearerConfigid` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`oauthJwtSupport` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "path": null,
  "oauthClientIdsAllowed": null,
  "authBearerSyncIms": null,
  "authTokenRequestParameter": null,
  "oauthBearerConfigid": null,
  "oauthJwtSupport": null,
} satisfies ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


