
# ComAdobeGraniteThreaddumpThreadDumpCollectorProperties


## Properties

Name | Type
------------ | -------------
`schedulerPeriod` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`schedulerRunOn` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`graniteThreaddumpEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteThreaddumpDumpsPerFile` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`graniteThreaddumpEnableGzipCompression` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteThreaddumpEnableDirectoriesCompression` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteThreaddumpEnableJStack` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteThreaddumpMaxBackupDays` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`graniteThreaddumpBackupCleanTrigger` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeGraniteThreaddumpThreadDumpCollectorProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "schedulerPeriod": null,
  "schedulerRunOn": null,
  "graniteThreaddumpEnabled": null,
  "graniteThreaddumpDumpsPerFile": null,
  "graniteThreaddumpEnableGzipCompression": null,
  "graniteThreaddumpEnableDirectoriesCompression": null,
  "graniteThreaddumpEnableJStack": null,
  "graniteThreaddumpMaxBackupDays": null,
  "graniteThreaddumpBackupCleanTrigger": null,
} satisfies ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


