
# OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties


## Properties

Name | Type
------------ | -------------
`providerName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`hostName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`hostPort` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`hostSsl` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`hostTls` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`hostNoCertCheck` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`bindDn` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`bindPassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`searchTimeout` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`adminPoolMaxActive` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`adminPoolLookupOnValidate` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`userPoolMaxActive` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`userPoolLookupOnValidate` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`userBaseDN` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`userObjectclass` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`userIdAttribute` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`userExtraFilter` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`userMakeDnPath` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`groupBaseDN` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`groupObjectclass` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`groupNameAttribute` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`groupExtraFilter` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`groupMakeDnPath` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`groupMemberAttribute` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`useUidForExtId` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`customattributes` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "providerName": null,
  "hostName": null,
  "hostPort": null,
  "hostSsl": null,
  "hostTls": null,
  "hostNoCertCheck": null,
  "bindDn": null,
  "bindPassword": null,
  "searchTimeout": null,
  "adminPoolMaxActive": null,
  "adminPoolLookupOnValidate": null,
  "userPoolMaxActive": null,
  "userPoolLookupOnValidate": null,
  "userBaseDN": null,
  "userObjectclass": null,
  "userIdAttribute": null,
  "userExtraFilter": null,
  "userMakeDnPath": null,
  "groupBaseDN": null,
  "groupObjectclass": null,
  "groupNameAttribute": null,
  "groupExtraFilter": null,
  "groupMakeDnPath": null,
  "groupMemberAttribute": null,
  "useUidForExtId": null,
  "customattributes": null,
} satisfies OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


