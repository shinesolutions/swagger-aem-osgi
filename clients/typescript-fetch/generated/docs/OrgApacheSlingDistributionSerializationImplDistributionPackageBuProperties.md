
# OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties


## Properties

Name | Type
------------ | -------------
`name` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`type` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`formatTarget` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tempFsFolder` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`fileThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`memoryUnit` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`useOffHeapMemory` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`digestAlgorithm` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`monitoringQueueSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cleanupDelay` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`packageFilters` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`propertyFilters` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "type": null,
  "formatTarget": null,
  "tempFsFolder": null,
  "fileThreshold": null,
  "memoryUnit": null,
  "useOffHeapMemory": null,
  "digestAlgorithm": null,
  "monitoringQueueSize": null,
  "cleanupDelay": null,
  "packageFilters": null,
  "propertyFilters": null,
} satisfies OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


