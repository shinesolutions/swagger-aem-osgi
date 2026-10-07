
# ComDayCommonsHttpclientProperties


## Properties

Name | Type
------------ | -------------
`proxyEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`proxyHost` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`proxyUser` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`proxyPassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`proxyNtlmHost` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`proxyNtlmDomain` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`proxyExceptions` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComDayCommonsHttpclientProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "proxyEnabled": null,
  "proxyHost": null,
  "proxyUser": null,
  "proxyPassword": null,
  "proxyNtlmHost": null,
  "proxyNtlmDomain": null,
  "proxyExceptions": null,
} satisfies ComDayCommonsHttpclientProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCommonsHttpclientProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


