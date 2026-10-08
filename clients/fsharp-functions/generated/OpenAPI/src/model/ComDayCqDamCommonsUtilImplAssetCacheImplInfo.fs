namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCommonsUtilImplAssetCacheImplProperties

module ComDayCqDamCommonsUtilImplAssetCacheImplInfo =

  //#region ComDayCqDamCommonsUtilImplAssetCacheImplInfo

  [<CLIMutable>]
  type ComDayCqDamCommonsUtilImplAssetCacheImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCommonsUtilImplAssetCacheImplProperties;
  }

  //#endregion
