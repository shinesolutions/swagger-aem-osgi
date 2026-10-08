namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationImplReverseReplicatorProperties =

  //#region ComDayCqReplicationImplReverseReplicatorProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplReverseReplicatorProperties = {
    [<JsonProperty(PropertyName = "scheduler.period")>]
    SchedulerPeriod : ConfigNodePropertyInteger;
  }

  //#endregion
