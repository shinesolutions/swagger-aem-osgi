namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqJcrclustersupportClusterStartLevelControllerProperties =

  //#region ComDayCqJcrclustersupportClusterStartLevelControllerProperties

  [<CLIMutable>]
  type ComDayCqJcrclustersupportClusterStartLevelControllerProperties = {
    [<JsonProperty(PropertyName = "cluster.level.enable")>]
    ClusterLevelEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cluster.master.level")>]
    ClusterMasterLevel : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.slave.level")>]
    ClusterSlaveLevel : ConfigNodePropertyInteger;
  }

  //#endregion
