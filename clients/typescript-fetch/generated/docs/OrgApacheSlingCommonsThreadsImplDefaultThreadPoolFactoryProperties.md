
# OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties


## Properties

Name | Type
------------ | -------------
`name` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`minPoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxPoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`queueSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxThreadAge` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`keepAliveTime` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`blockPolicy` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`shutdownGraceful` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`daemon` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`shutdownWaitTime` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`priority` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "minPoolSize": null,
  "maxPoolSize": null,
  "queueSize": null,
  "maxThreadAge": null,
  "keepAliveTime": null,
  "blockPolicy": null,
  "shutdownGraceful": null,
  "daemon": null,
  "shutdownWaitTime": null,
  "priority": null,
} satisfies OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


