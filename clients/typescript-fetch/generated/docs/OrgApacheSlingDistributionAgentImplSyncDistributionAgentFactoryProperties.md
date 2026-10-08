
# OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties


## Properties

Name | Type
------------ | -------------
`name` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`title` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`details` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`enabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`serviceName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`logLevel` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`queueProcessingEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`passiveQueues` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`packageExporterEndpoints` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`packageImporterEndpoints` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`retryStrategy` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`retryAttempts` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`pullItems` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`httpConnTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`requestAuthorizationStrategyTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`transportSecretProviderTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`packageBuilderTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`triggersTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "title": null,
  "details": null,
  "enabled": null,
  "serviceName": null,
  "logLevel": null,
  "queueProcessingEnabled": null,
  "passiveQueues": null,
  "packageExporterEndpoints": null,
  "packageImporterEndpoints": null,
  "retryStrategy": null,
  "retryAttempts": null,
  "pullItems": null,
  "httpConnTimeout": null,
  "requestAuthorizationStrategyTarget": null,
  "transportSecretProviderTarget": null,
  "packageBuilderTarget": null,
  "triggersTarget": null,
} satisfies OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


