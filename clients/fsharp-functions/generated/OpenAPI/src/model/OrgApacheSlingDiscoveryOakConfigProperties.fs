namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDiscoveryOakConfigProperties =

  //#region OrgApacheSlingDiscoveryOakConfigProperties

  [<CLIMutable>]
  type OrgApacheSlingDiscoveryOakConfigProperties = {
    [<JsonProperty(PropertyName = "connectorPingTimeout")>]
    ConnectorPingTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "connectorPingInterval")>]
    ConnectorPingInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "discoveryLiteCheckInterval")>]
    DiscoveryLiteCheckInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "clusterSyncServiceTimeout")>]
    ClusterSyncServiceTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "clusterSyncServiceInterval")>]
    ClusterSyncServiceInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enableSyncToken")>]
    EnableSyncToken : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "minEventDelay")>]
    MinEventDelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "socketConnectTimeout")>]
    SocketConnectTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "soTimeout")>]
    SoTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "topologyConnectorUrls")>]
    TopologyConnectorUrls : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "topologyConnectorWhitelist")>]
    TopologyConnectorWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "autoStopLocalLoopEnabled")>]
    AutoStopLocalLoopEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "gzipConnectorRequestsEnabled")>]
    GzipConnectorRequestsEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "hmacEnabled")>]
    HmacEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "enableEncryption")>]
    EnableEncryption : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "sharedKey")>]
    SharedKey : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hmacSharedKeyTTL")>]
    HmacSharedKeyTTL : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "backoffStandbyFactor")>]
    BackoffStandbyFactor : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "backoffStableFactor")>]
    BackoffStableFactor : ConfigNodePropertyString;
  }

  //#endregion
