
# ComAdobeGraniteCorsImplCORSPolicyImplProperties


## Properties

Name | Type
------------ | -------------
`alloworigin` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`alloworiginregexp` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`allowedpaths` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`exposedheaders` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`maxage` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`supportedheaders` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`supportedmethods` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`supportscredentials` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComAdobeGraniteCorsImplCORSPolicyImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "alloworigin": null,
  "alloworiginregexp": null,
  "allowedpaths": null,
  "exposedheaders": null,
  "maxage": null,
  "supportedheaders": null,
  "supportedmethods": null,
  "supportscredentials": null,
} satisfies ComAdobeGraniteCorsImplCORSPolicyImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteCorsImplCORSPolicyImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


