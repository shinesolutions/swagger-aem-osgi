
# OrgApacheSlingEventJobsQueueConfigurationProperties


## Properties

Name | Type
------------ | -------------
`queueName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`queueTopics` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`queueType` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`queuePriority` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`queueRetries` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`queueRetrydelay` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`queueMaxparallel` | [ConfigNodePropertyFloat](ConfigNodePropertyFloat.md)
`queueKeepJobs` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`queuePreferRunOnCreationInstance` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`queueThreadPoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`serviceRanking` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { OrgApacheSlingEventJobsQueueConfigurationProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "queueName": null,
  "queueTopics": null,
  "queueType": null,
  "queuePriority": null,
  "queueRetries": null,
  "queueRetrydelay": null,
  "queueMaxparallel": null,
  "queueKeepJobs": null,
  "queuePreferRunOnCreationInstance": null,
  "queueThreadPoolSize": null,
  "serviceRanking": null,
} satisfies OrgApacheSlingEventJobsQueueConfigurationProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingEventJobsQueueConfigurationProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


