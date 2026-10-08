
# OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties


## Properties

Name | Type
------------ | -------------
`osgiHttpWhiteboardContextSelect` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`osgiHttpWhiteboardListener` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authSudoCookie` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authSudoParameter` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authAnnonymous` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`slingAuthRequirements` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`slingAuthAnonymousUser` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`slingAuthAnonymousPassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authHttp` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`authHttpRealm` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`authUriSuffix` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "osgiHttpWhiteboardContextSelect": null,
  "osgiHttpWhiteboardListener": null,
  "authSudoCookie": null,
  "authSudoParameter": null,
  "authAnnonymous": null,
  "slingAuthRequirements": null,
  "slingAuthAnonymousUser": null,
  "slingAuthAnonymousPassword": null,
  "authHttp": null,
  "authHttpRealm": null,
  "authUriSuffix": null,
} satisfies OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


