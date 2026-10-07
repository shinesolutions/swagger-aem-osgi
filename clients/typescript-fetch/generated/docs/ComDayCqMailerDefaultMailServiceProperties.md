
# ComDayCqMailerDefaultMailServiceProperties


## Properties

Name | Type
------------ | -------------
`smtpHost` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`smtpPort` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`smtpUser` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`smtpPassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`fromAddress` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`smtpSsl` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`smtpStarttls` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`debugEmail` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComDayCqMailerDefaultMailServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "smtpHost": null,
  "smtpPort": null,
  "smtpUser": null,
  "smtpPassword": null,
  "fromAddress": null,
  "smtpSsl": null,
  "smtpStarttls": null,
  "debugEmail": null,
} satisfies ComDayCqMailerDefaultMailServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqMailerDefaultMailServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


