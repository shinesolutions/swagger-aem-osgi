
# OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties


## Properties

Name | Type
------------ | -------------
`enabledActions` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`userPrivilegeNames` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`groupPrivilegeNames` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`constraint` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "enabledActions": null,
  "userPrivilegeNames": null,
  "groupPrivilegeNames": null,
  "constraint": null,
} satisfies OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


