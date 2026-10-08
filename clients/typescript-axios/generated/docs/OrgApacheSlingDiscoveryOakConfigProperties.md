# OrgApacheSlingDiscoveryOakConfigProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectorPingTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**connectorPingInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**discoveryLiteCheckInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**clusterSyncServiceTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**clusterSyncServiceInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**enableSyncToken** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**minEventDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**socketConnectTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**soTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**topologyConnectorUrls** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**topologyConnectorWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**autoStopLocalLoopEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**gzipConnectorRequestsEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**hmacEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**enableEncryption** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**sharedKey** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**hmacSharedKeyTTL** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**backoffStandbyFactor** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**backoffStableFactor** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheSlingDiscoveryOakConfigProperties } from './api';

const instance: OrgApacheSlingDiscoveryOakConfigProperties = {
    connectorPingTimeout,
    connectorPingInterval,
    discoveryLiteCheckInterval,
    clusterSyncServiceTimeout,
    clusterSyncServiceInterval,
    enableSyncToken,
    minEventDelay,
    socketConnectTimeout,
    soTimeout,
    topologyConnectorUrls,
    topologyConnectorWhitelist,
    autoStopLocalLoopEnabled,
    gzipConnectorRequestsEnabled,
    hmacEnabled,
    enableEncryption,
    sharedKey,
    hmacSharedKeyTTL,
    backoffStandbyFactor,
    backoffStableFactor,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
