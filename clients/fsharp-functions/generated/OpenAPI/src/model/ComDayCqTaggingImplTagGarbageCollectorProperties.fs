namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqTaggingImplTagGarbageCollectorProperties =

  //#region ComDayCqTaggingImplTagGarbageCollectorProperties

  [<CLIMutable>]
  type ComDayCqTaggingImplTagGarbageCollectorProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
  }

  //#endregion
