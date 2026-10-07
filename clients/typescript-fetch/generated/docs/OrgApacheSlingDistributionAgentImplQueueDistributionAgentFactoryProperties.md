
# OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties


## Properties

Name | Type
------------ | -------------
`name` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`title` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`details` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`enabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`serviceName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`logLevel` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`allowedRoots` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`requestAuthorizationStrategyTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`queueProviderFactoryTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`packageBuilderTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`triggersTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`priorityQueues` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "title": null,
  "details": null,
  "enabled": null,
  "serviceName": null,
  "logLevel": null,
  "allowedRoots": null,
  "requestAuthorizationStrategyTarget": null,
  "queueProviderFactoryTarget": null,
  "packageBuilderTarget": null,
  "triggersTarget": null,
  "priorityQueues": null,
} satisfies OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


