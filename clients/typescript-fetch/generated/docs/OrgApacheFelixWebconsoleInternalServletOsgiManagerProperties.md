
# OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties


## Properties

Name | Type
------------ | -------------
`managerRoot` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`httpServiceFilter` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`defaultRender` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`realm` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`username` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`password` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`category` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`locale` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`loglevel` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`plugins` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)

## Example

```typescript
import type { OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "managerRoot": null,
  "httpServiceFilter": null,
  "defaultRender": null,
  "realm": null,
  "username": null,
  "password": null,
  "category": null,
  "locale": null,
  "loglevel": null,
  "plugins": null,
} satisfies OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


