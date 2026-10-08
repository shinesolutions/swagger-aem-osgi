
# OrgApacheSlingServletsPostImplSlingPostServletProperties


## Properties

Name | Type
------------ | -------------
`servletPostDateFormats` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`servletPostNodeNameHints` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`servletPostNodeNameMaxLength` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`servletPostCheckinNewVersionableNodes` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`servletPostAutoCheckout` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`servletPostAutoCheckin` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`servletPostIgnorePattern` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { OrgApacheSlingServletsPostImplSlingPostServletProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "servletPostDateFormats": null,
  "servletPostNodeNameHints": null,
  "servletPostNodeNameMaxLength": null,
  "servletPostCheckinNewVersionableNodes": null,
  "servletPostAutoCheckout": null,
  "servletPostAutoCheckin": null,
  "servletPostIgnorePattern": null,
} satisfies OrgApacheSlingServletsPostImplSlingPostServletProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingServletsPostImplSlingPostServletProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


