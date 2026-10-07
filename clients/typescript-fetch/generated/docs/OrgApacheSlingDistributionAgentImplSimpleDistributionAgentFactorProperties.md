
# OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties


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
`packageExporterTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`packageImporterTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`requestAuthorizationStrategyTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`triggersTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "title": null,
  "details": null,
  "enabled": null,
  "serviceName": null,
  "logLevel": null,
  "queueProcessingEnabled": null,
  "packageExporterTarget": null,
  "packageImporterTarget": null,
  "requestAuthorizationStrategyTarget": null,
  "triggersTarget": null,
} satisfies OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


