
# ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties


## Properties

Name | Type
------------ | -------------
`comAdobeGraniteJettySslPort` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`comAdobeGraniteJettySslKeystoreUser` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`comAdobeGraniteJettySslKeystorePassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`comAdobeGraniteJettySslCiphersuitesExcluded` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`comAdobeGraniteJettySslCiphersuitesIncluded` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`comAdobeGraniteJettySslClientCertificate` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "comAdobeGraniteJettySslPort": null,
  "comAdobeGraniteJettySslKeystoreUser": null,
  "comAdobeGraniteJettySslKeystorePassword": null,
  "comAdobeGraniteJettySslCiphersuitesExcluded": null,
  "comAdobeGraniteJettySslCiphersuitesIncluded": null,
  "comAdobeGraniteJettySslClientCertificate": null,
} satisfies ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


