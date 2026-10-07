
# ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties


## Properties

Name | Type
------------ | -------------
`eventFilter` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`minThreadPoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxThreadPoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cqWcmWorkflowTerminateOnActivate` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cqWcmWorklfowTerminateExclusionList` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "eventFilter": null,
  "minThreadPoolSize": null,
  "maxThreadPoolSize": null,
  "cqWcmWorkflowTerminateOnActivate": null,
  "cqWcmWorklfowTerminateExclusionList": null,
} satisfies ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


