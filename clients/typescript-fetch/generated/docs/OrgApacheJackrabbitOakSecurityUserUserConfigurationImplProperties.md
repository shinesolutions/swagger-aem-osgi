
# OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties


## Properties

Name | Type
------------ | -------------
`usersPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`groupsPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`systemRelativePath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`defaultDepth` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`importBehavior` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`passwordHashAlgorithm` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`passwordHashIterations` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`passwordSaltSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`omitAdminPw` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`supportAutoSave` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`passwordMaxAge` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`initialPasswordChange` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`passwordHistorySize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`passwordExpiryForAdmin` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cacheExpiration` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`enableRFC7613UsercaseMappedProfile` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "usersPath": null,
  "groupsPath": null,
  "systemRelativePath": null,
  "defaultDepth": null,
  "importBehavior": null,
  "passwordHashAlgorithm": null,
  "passwordHashIterations": null,
  "passwordSaltSize": null,
  "omitAdminPw": null,
  "supportAutoSave": null,
  "passwordMaxAge": null,
  "initialPasswordChange": null,
  "passwordHistorySize": null,
  "passwordExpiryForAdmin": null,
  "cacheExpiration": null,
  "enableRFC7613UsercaseMappedProfile": null,
} satisfies OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


