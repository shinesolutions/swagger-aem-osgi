
# OrgApacheSlingEngineImplLogRequestLoggerProperties


## Properties

Name | Type
------------ | -------------
`requestLogOutput` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`requestLogOutputtype` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`requestLogEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`accessLogOutput` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`accessLogOutputtype` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`accessLogEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheSlingEngineImplLogRequestLoggerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "requestLogOutput": null,
  "requestLogOutputtype": null,
  "requestLogEnabled": null,
  "accessLogOutput": null,
  "accessLogOutputtype": null,
  "accessLogEnabled": null,
} satisfies OrgApacheSlingEngineImplLogRequestLoggerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingEngineImplLogRequestLoggerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


