
# OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties


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
`queueProcessingEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`packageImporterEndpoints` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`passiveQueues` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`priorityQueues` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`retryStrategy` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`retryAttempts` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`requestAuthorizationStrategyTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`transportSecretProviderTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`packageBuilderTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`triggersTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`queueProvider` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`asyncDelivery` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`httpConnTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "title": null,
  "details": null,
  "enabled": null,
  "serviceName": null,
  "logLevel": null,
  "allowedRoots": null,
  "queueProcessingEnabled": null,
  "packageImporterEndpoints": null,
  "passiveQueues": null,
  "priorityQueues": null,
  "retryStrategy": null,
  "retryAttempts": null,
  "requestAuthorizationStrategyTarget": null,
  "transportSecretProviderTarget": null,
  "packageBuilderTarget": null,
  "triggersTarget": null,
  "queueProvider": null,
  "asyncDelivery": null,
  "httpConnTimeout": null,
} satisfies OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


