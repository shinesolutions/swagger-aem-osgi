
# OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties


## Properties

Name | Type
------------ | -------------
`orgApacheSlingInstallerConfigurationPersist` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`mode` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`port` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`primaryHost` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`interval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`primaryAllowedClientIpRanges` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`secure` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`standbyReadtimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`standbyAutoclean` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "orgApacheSlingInstallerConfigurationPersist": null,
  "mode": null,
  "port": null,
  "primaryHost": null,
  "interval": null,
  "primaryAllowedClientIpRanges": null,
  "secure": null,
  "standbyReadtimeout": null,
  "standbyAutoclean": null,
} satisfies OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


