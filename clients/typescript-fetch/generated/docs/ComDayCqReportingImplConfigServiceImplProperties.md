
# ComDayCqReportingImplConfigServiceImplProperties


## Properties

Name | Type
------------ | -------------
`repconfTimezone` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`repconfLocale` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`repconfSnapshots` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`repconfRepdir` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`repconfHourofday` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`repconfMinofhour` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`repconfMaxrows` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`repconfFakedata` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`repconfSnapshotuser` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`repconfEnforcesnapshotuser` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { ComDayCqReportingImplConfigServiceImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "repconfTimezone": null,
  "repconfLocale": null,
  "repconfSnapshots": null,
  "repconfRepdir": null,
  "repconfHourofday": null,
  "repconfMinofhour": null,
  "repconfMaxrows": null,
  "repconfFakedata": null,
  "repconfSnapshotuser": null,
  "repconfEnforcesnapshotuser": null,
} satisfies ComDayCqReportingImplConfigServiceImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCqReportingImplConfigServiceImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


