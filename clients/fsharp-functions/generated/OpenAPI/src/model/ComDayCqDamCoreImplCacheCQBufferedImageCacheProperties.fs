namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties =

  //#region ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties = {
    [<JsonProperty(PropertyName = "cq.dam.image.cache.max.memory")>]
    CqDamImageCacheMaxMemory : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.image.cache.max.age")>]
    CqDamImageCacheMaxAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.image.cache.max.dimension")>]
    CqDamImageCacheMaxDimension : ConfigNodePropertyString;
  }

  //#endregion
