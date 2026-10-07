namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCrxSecurityTokenImplTokenCleanupTaskProperties =

  //#region ComDayCrxSecurityTokenImplTokenCleanupTaskProperties

  [<CLIMutable>]
  type ComDayCrxSecurityTokenImplTokenCleanupTaskProperties = {
    [<JsonProperty(PropertyName = "enable.token.cleanup.task")>]
    EnableTokenCleanupTask : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "batch.size")>]
    BatchSize : ConfigNodePropertyInteger;
  }

  //#endregion
