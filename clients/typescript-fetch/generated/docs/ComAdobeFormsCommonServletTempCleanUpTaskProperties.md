
# ComAdobeFormsCommonServletTempCleanUpTaskProperties


## Properties

Name | Type
------------ | -------------
`schedulerExpression` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`durationForTemporaryStorage` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`durationForAnonymousStorage` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeFormsCommonServletTempCleanUpTaskProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "schedulerExpression": null,
  "durationForTemporaryStorage": null,
  "durationForAnonymousStorage": null,
} satisfies ComAdobeFormsCommonServletTempCleanUpTaskProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeFormsCommonServletTempCleanUpTaskProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


