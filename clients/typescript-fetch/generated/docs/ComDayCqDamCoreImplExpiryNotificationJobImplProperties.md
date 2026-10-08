
# ComDayCqDamCoreImplExpiryNotificationJobImplProperties


## Properties

Name | Type
------------ | -------------
`cqDamExpiryNotificationSchedulerIstimebased` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cqDamExpiryNotificationSchedulerTimebasedRule` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`cqDamExpiryNotificationSchedulerPeriodRule` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`sendEmail` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`assetExpiredLimit` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`priorNotificationSeconds` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cqDamExpiryNotificationUrlProtocol` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComDayCqDamCoreImplExpiryNotificationJobImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "cqDamExpiryNotificationSchedulerIstimebased": null,
  "cqDamExpiryNotificationSchedulerTimebasedRule": null,
  "cqDamExpiryNotificationSchedulerPeriodRule": null,
  "sendEmail": null,
  "assetExpiredLimit": null,
  "priorNotificationSeconds": null,
  "cqDamExpiryNotificationUrlProtocol": null,
} satisfies ComDayCqDamCoreImplExpiryNotificationJobImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqDamCoreImplExpiryNotificationJobImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


