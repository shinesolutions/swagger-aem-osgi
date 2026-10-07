
# ComDayCqDamIdsImplIDSJobProcessorProperties


## Properties

Name | Type
------------ | -------------
`enableMultisession` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`idsCcEnable` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`enableRetry` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`enableRetryScripterror` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`externalizerDomainCqhost` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`externalizerDomainHttp` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComDayCqDamIdsImplIDSJobProcessorProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "enableMultisession": null,
  "idsCcEnable": null,
  "enableRetry": null,
  "enableRetryScripterror": null,
  "externalizerDomainCqhost": null,
  "externalizerDomainHttp": null,
} satisfies ComDayCqDamIdsImplIDSJobProcessorProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqDamIdsImplIDSJobProcessorProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


