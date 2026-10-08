
# ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties


## Properties

Name | Type
------------ | -------------
`schedulerExpression` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jobPurgeThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`jobPurgeMaxJobs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "schedulerExpression": null,
  "jobPurgeThreshold": null,
  "jobPurgeMaxJobs": null,
} satisfies ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


