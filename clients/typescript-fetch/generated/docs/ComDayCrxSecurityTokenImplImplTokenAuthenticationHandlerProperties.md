
# ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties


## Properties

Name | Type
------------ | -------------
`path` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tokenRequiredAttr` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`tokenAlternateUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tokenEncapsulated` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`skipTokenRefresh` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "path": null,
  "tokenRequiredAttr": null,
  "tokenAlternateUrl": null,
  "tokenEncapsulated": null,
  "skipTokenRefresh": null,
} satisfies ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


