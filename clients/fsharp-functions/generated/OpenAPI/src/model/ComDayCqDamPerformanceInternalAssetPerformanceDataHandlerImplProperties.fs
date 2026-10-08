namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties =

  //#region ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties

  [<CLIMutable>]
  type ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties = {
    [<JsonProperty(PropertyName = "batch.commit.size")>]
    BatchCommitSize : ConfigNodePropertyInteger;
  }

  //#endregion
