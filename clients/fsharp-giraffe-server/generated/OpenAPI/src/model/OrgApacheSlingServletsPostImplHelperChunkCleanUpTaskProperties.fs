namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties =

  //#region OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties


  type orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = {
    SchedulerExpression : ConfigNodePropertyString;
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    ChunkCleanupAge : ConfigNodePropertyInteger;
  }
  //#endregion
