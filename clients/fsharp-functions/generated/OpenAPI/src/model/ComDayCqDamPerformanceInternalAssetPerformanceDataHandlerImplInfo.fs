namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties

module ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo =

  //#region ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo

  [<CLIMutable>]
  type ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties;
  }

  //#endregion
