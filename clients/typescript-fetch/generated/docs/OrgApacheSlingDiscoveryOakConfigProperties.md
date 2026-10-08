
# OrgApacheSlingDiscoveryOakConfigProperties


## Properties

Name | Type
------------ | -------------
`connectorPingTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`connectorPingInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`discoveryLiteCheckInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`clusterSyncServiceTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`clusterSyncServiceInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`enableSyncToken` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`minEventDelay` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`socketConnectTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`soTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`topologyConnectorUrls` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`topologyConnectorWhitelist` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`autoStopLocalLoopEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`gzipConnectorRequestsEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`hmacEnabled` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`enableEncryption` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`sharedKey` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`hmacSharedKeyTTL` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`backoffStandbyFactor` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`backoffStableFactor` | [ConfigNodePropertyString](ConfigNodePropertyString.md)

## Example

```typescript
import type { OrgApacheSlingDiscoveryOakConfigProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "connectorPingTimeout": null,
  "connectorPingInterval": null,
  "discoveryLiteCheckInterval": null,
  "clusterSyncServiceTimeout": null,
  "clusterSyncServiceInterval": null,
  "enableSyncToken": null,
  "minEventDelay": null,
  "socketConnectTimeout": null,
  "soTimeout": null,
  "topologyConnectorUrls": null,
  "topologyConnectorWhitelist": null,
  "autoStopLocalLoopEnabled": null,
  "gzipConnectorRequestsEnabled": null,
  "hmacEnabled": null,
  "enableEncryption": null,
  "sharedKey": null,
  "hmacSharedKeyTTL": null,
  "backoffStandbyFactor": null,
  "backoffStableFactor": null,
} satisfies OrgApacheSlingDiscoveryOakConfigProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDiscoveryOakConfigProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


