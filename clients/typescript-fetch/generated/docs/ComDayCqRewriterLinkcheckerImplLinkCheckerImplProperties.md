
# ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties


## Properties

Name | Type
------------ | -------------
`schedulerPeriod` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`schedulerConcurrent` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`serviceBadLinkToleranceInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`serviceCheckOverridePatterns` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`serviceCacheBrokenInternalLinks` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`serviceSpecialLinkPrefix` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`serviceSpecialLinkPatterns` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "schedulerPeriod": null,
  "schedulerConcurrent": null,
  "serviceBadLinkToleranceInterval": null,
  "serviceCheckOverridePatterns": null,
  "serviceCacheBrokenInternalLinks": null,
  "serviceSpecialLinkPrefix": null,
  "serviceSpecialLinkPatterns": null,
} satisfies ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


