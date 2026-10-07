
# OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties


## Properties

Name | Type
------------ | -------------
`permissionsJr2` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`importBehavior` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`readPaths` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`administrativePrincipals` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`configurationRanking` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "permissionsJr2": null,
  "importBehavior": null,
  "readPaths": null,
  "administrativePrincipals": null,
  "configurationRanking": null,
} satisfies OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


