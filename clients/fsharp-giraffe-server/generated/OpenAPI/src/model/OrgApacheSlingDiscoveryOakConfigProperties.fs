namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDiscoveryOakConfigProperties =

  //#region OrgApacheSlingDiscoveryOakConfigProperties


  type orgApacheSlingDiscoveryOakConfigProperties = {
    ConnectorPingTimeout : ConfigNodePropertyInteger;
    ConnectorPingInterval : ConfigNodePropertyInteger;
    DiscoveryLiteCheckInterval : ConfigNodePropertyInteger;
    ClusterSyncServiceTimeout : ConfigNodePropertyInteger;
    ClusterSyncServiceInterval : ConfigNodePropertyInteger;
    EnableSyncToken : ConfigNodePropertyBoolean;
    MinEventDelay : ConfigNodePropertyInteger;
    SocketConnectTimeout : ConfigNodePropertyInteger;
    SoTimeout : ConfigNodePropertyInteger;
    TopologyConnectorUrls : ConfigNodePropertyArray;
    TopologyConnectorWhitelist : ConfigNodePropertyArray;
    AutoStopLocalLoopEnabled : ConfigNodePropertyBoolean;
    GzipConnectorRequestsEnabled : ConfigNodePropertyBoolean;
    HmacEnabled : ConfigNodePropertyBoolean;
    EnableEncryption : ConfigNodePropertyBoolean;
    SharedKey : ConfigNodePropertyString;
    HmacSharedKeyTTL : ConfigNodePropertyInteger;
    BackoffStandbyFactor : ConfigNodePropertyString;
    BackoffStableFactor : ConfigNodePropertyString;
  }
  //#endregion
