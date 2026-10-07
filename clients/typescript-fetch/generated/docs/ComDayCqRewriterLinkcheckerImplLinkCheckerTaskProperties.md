
# ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties


## Properties

Name | Type
------------ | -------------
`schedulerPeriod` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`schedulerConcurrent` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`goodLinkTestInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`badLinkTestInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`linkUnusedInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`connectionTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "schedulerPeriod": null,
  "schedulerConcurrent": null,
  "goodLinkTestInterval": null,
  "badLinkTestInterval": null,
  "linkUnusedInterval": null,
  "connectionTimeout": null,
} satisfies ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


