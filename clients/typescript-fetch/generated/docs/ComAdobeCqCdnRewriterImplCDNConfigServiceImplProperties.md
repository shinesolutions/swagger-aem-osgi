
# ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties


## Properties

Name | Type
------------ | -------------
`cdnConfigDistributionDomain` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`cdnConfigEnableRewriting` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`cdnConfigPathPrefixes` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`cdnConfigCdnttl` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cdnConfigApplicationProtocol` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "cdnConfigDistributionDomain": null,
  "cdnConfigEnableRewriting": null,
  "cdnConfigPathPrefixes": null,
  "cdnConfigCdnttl": null,
  "cdnConfigApplicationProtocol": null,
} satisfies ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


