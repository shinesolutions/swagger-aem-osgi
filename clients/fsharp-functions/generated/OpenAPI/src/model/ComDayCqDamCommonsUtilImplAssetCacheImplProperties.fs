namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCommonsUtilImplAssetCacheImplProperties =

  //#region ComDayCqDamCommonsUtilImplAssetCacheImplProperties

  [<CLIMutable>]
  type ComDayCqDamCommonsUtilImplAssetCacheImplProperties = {
    [<JsonProperty(PropertyName = "large.file.min")>]
    LargeFileMin : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cache.apply")>]
    CacheApply : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "mime.types")>]
    MimeTypes : ConfigNodePropertyArray;
  }

  //#endregion
