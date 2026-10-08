
# ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties


## Properties

Name | Type
------------ | -------------
`path` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`serviceRanking` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`idpUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`idpCertAlias` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`idpHttpRedirect` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`serviceProviderEntityId` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`assertionConsumerServiceURL` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`spPrivateKeyAlias` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`keyStorePassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`defaultRedirectUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`userIDAttribute` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`useEncryption` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`createUser` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`userIntermediatePath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`addGroupMemberships` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`groupMembershipAttribute` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`defaultGroups` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`nameIdFormat` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`synchronizeAttributes` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`handleLogout` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`logoutUrl` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`clockTolerance` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`digestMethod` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`signatureMethod` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`identitySyncType` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`idpIdentifier` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "path": null,
  "serviceRanking": null,
  "idpUrl": null,
  "idpCertAlias": null,
  "idpHttpRedirect": null,
  "serviceProviderEntityId": null,
  "assertionConsumerServiceURL": null,
  "spPrivateKeyAlias": null,
  "keyStorePassword": null,
  "defaultRedirectUrl": null,
  "userIDAttribute": null,
  "useEncryption": null,
  "createUser": null,
  "userIntermediatePath": null,
  "addGroupMemberships": null,
  "groupMembershipAttribute": null,
  "defaultGroups": null,
  "nameIdFormat": null,
  "synchronizeAttributes": null,
  "handleLogout": null,
  "logoutUrl": null,
  "clockTolerance": null,
  "digestMethod": null,
  "signatureMethod": null,
  "identitySyncType": null,
  "idpIdentifier": null,
} satisfies ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


