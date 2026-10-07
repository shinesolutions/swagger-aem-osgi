
# OrgApacheSlingTracerInternalLogTracerProperties


## Properties

Name | Type
------------ | -------------
`tracerSets` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`enabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`servletEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`recordingCacheSizeInMB` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`recordingCacheDurationInSecs` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`recordingCompressionEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`gzipResponse` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheSlingTracerInternalLogTracerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "tracerSets": null,
  "enabled": null,
  "servletEnabled": null,
  "recordingCacheSizeInMB": null,
  "recordingCacheDurationInSecs": null,
  "recordingCompressionEnabled": null,
  "gzipResponse": null,
} satisfies OrgApacheSlingTracerInternalLogTracerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingTracerInternalLogTracerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


