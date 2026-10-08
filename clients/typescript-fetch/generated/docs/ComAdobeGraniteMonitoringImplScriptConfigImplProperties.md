
# ComAdobeGraniteMonitoringImplScriptConfigImplProperties


## Properties

Name | Type
------------ | -------------
`scriptFilename` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`scriptDisplay` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`scriptPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`scriptPlatform` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`interval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`jmxdomain` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeGraniteMonitoringImplScriptConfigImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "scriptFilename": null,
  "scriptDisplay": null,
  "scriptPath": null,
  "scriptPlatform": null,
  "interval": null,
  "jmxdomain": null,
} satisfies ComAdobeGraniteMonitoringImplScriptConfigImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteMonitoringImplScriptConfigImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


