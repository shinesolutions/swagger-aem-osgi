namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqReplicationImplReplicatorImplProperties =

  //#region ComDayCqReplicationImplReplicatorImplProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplReplicatorImplProperties = {
    [<JsonProperty(PropertyName = "distribute_events")>]
    DistributeEvents : ConfigNodePropertyBoolean;
  }

  //#endregion
