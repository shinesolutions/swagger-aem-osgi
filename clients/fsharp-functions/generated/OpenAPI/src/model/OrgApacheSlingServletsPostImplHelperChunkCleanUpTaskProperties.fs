namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties =

  //#region OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties

  [<CLIMutable>]
  type OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scheduler.concurrent")>]
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "chunk.cleanup.age")>]
    ChunkCleanupAge : ConfigNodePropertyInteger;
  }

  //#endregion
