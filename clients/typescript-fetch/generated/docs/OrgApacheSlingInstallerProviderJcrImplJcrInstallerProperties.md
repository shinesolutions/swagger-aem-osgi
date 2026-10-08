
# OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties


## Properties

Name | Type
------------ | -------------
`handlerSchemes` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`slingJcrinstallFolderNameRegexp` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`slingJcrinstallFolderMaxDepth` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`slingJcrinstallSearchPath` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`slingJcrinstallNewConfigPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`slingJcrinstallSignalPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`slingJcrinstallEnableWriteback` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "handlerSchemes": null,
  "slingJcrinstallFolderNameRegexp": null,
  "slingJcrinstallFolderMaxDepth": null,
  "slingJcrinstallSearchPath": null,
  "slingJcrinstallNewConfigPath": null,
  "slingJcrinstallSignalPath": null,
  "slingJcrinstallEnableWriteback": null,
} satisfies OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


