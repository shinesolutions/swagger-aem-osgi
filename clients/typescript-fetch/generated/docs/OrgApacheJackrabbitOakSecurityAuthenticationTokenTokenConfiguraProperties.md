
# OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties


## Properties

Name | Type
------------ | -------------
`tokenExpiration` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tokenLength` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`tokenRefresh` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`tokenCleanupThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`passwordHashAlgorithm` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`passwordHashIterations` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`passwordSaltSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "tokenExpiration": null,
  "tokenLength": null,
  "tokenRefresh": null,
  "tokenCleanupThreshold": null,
  "passwordHashAlgorithm": null,
  "passwordHashIterations": null,
  "passwordSaltSize": null,
} satisfies OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


