
# ComDayCqWorkflowImplEmailEMailNotificationServiceProperties


## Properties

Name | Type
------------ | -------------
`fromAddress` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`hostPrefix` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`notifyOnabort` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`notifyOncomplete` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`notifyOncontainercomplete` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`notifyUseronly` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComDayCqWorkflowImplEmailEMailNotificationServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "fromAddress": null,
  "hostPrefix": null,
  "notifyOnabort": null,
  "notifyOncomplete": null,
  "notifyOncontainercomplete": null,
  "notifyUseronly": null,
} satisfies ComDayCqWorkflowImplEmailEMailNotificationServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


