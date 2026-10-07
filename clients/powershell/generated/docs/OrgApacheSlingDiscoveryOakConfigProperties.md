# OrgApacheSlingDiscoveryOakConfigProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConnectorPingTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ConnectorPingInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DiscoveryLiteCheckInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterSyncServiceTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterSyncServiceInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableSyncToken** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MinEventDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SocketConnectTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SoTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TopologyConnectorUrls** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TopologyConnectorWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AutoStopLocalLoopEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GzipConnectorRequestsEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HmacEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EnableEncryption** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SharedKey** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HmacSharedKeyTTL** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BackoffStandbyFactor** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**BackoffStableFactor** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingDiscoveryOakConfigProperties = Initialize-PSOpenAPIToolsOrgApacheSlingDiscoveryOakConfigProperties  -ConnectorPingTimeout null `
 -ConnectorPingInterval null `
 -DiscoveryLiteCheckInterval null `
 -ClusterSyncServiceTimeout null `
 -ClusterSyncServiceInterval null `
 -EnableSyncToken null `
 -MinEventDelay null `
 -SocketConnectTimeout null `
 -SoTimeout null `
 -TopologyConnectorUrls null `
 -TopologyConnectorWhitelist null `
 -AutoStopLocalLoopEnabled null `
 -GzipConnectorRequestsEnabled null `
 -HmacEnabled null `
 -EnableEncryption null `
 -SharedKey null `
 -HmacSharedKeyTTL null `
 -BackoffStandbyFactor null `
 -BackoffStableFactor null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingDiscoveryOakConfigProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

