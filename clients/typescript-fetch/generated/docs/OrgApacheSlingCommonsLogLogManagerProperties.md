
# OrgApacheSlingCommonsLogLogManagerProperties


## Properties

Name | Type
------------ | -------------
`orgApacheSlingCommonsLogLevel` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`orgApacheSlingCommonsLogFile` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`orgApacheSlingCommonsLogFileNumber` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`orgApacheSlingCommonsLogFileSize` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`orgApacheSlingCommonsLogPattern` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`orgApacheSlingCommonsLogConfigurationFile` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`orgApacheSlingCommonsLogPackagingDataEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`orgApacheSlingCommonsLogMaxCallerDataDepth` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`orgApacheSlingCommonsLogMaxOldFileCountInDump` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`orgApacheSlingCommonsLogNumOfLines` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { OrgApacheSlingCommonsLogLogManagerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "orgApacheSlingCommonsLogLevel": null,
  "orgApacheSlingCommonsLogFile": null,
  "orgApacheSlingCommonsLogFileNumber": null,
  "orgApacheSlingCommonsLogFileSize": null,
  "orgApacheSlingCommonsLogPattern": null,
  "orgApacheSlingCommonsLogConfigurationFile": null,
  "orgApacheSlingCommonsLogPackagingDataEnabled": null,
  "orgApacheSlingCommonsLogMaxCallerDataDepth": null,
  "orgApacheSlingCommonsLogMaxOldFileCountInDump": null,
  "orgApacheSlingCommonsLogNumOfLines": null,
} satisfies OrgApacheSlingCommonsLogLogManagerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingCommonsLogLogManagerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


