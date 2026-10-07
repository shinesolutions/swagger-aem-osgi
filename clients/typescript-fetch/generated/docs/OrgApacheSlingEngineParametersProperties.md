
# OrgApacheSlingEngineParametersProperties


## Properties

Name | Type
------------ | -------------
`slingDefaultParameterEncoding` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`slingDefaultMaxParameters` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`fileLocation` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`fileThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`fileMax` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`requestMax` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`slingDefaultParameterCheckForAdditionalContainerParameters` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheSlingEngineParametersProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "slingDefaultParameterEncoding": null,
  "slingDefaultMaxParameters": null,
  "fileLocation": null,
  "fileThreshold": null,
  "fileMax": null,
  "requestMax": null,
  "slingDefaultParameterCheckForAdditionalContainerParameters": null,
} satisfies OrgApacheSlingEngineParametersProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingEngineParametersProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


