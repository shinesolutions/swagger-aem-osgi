namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReportingImplCacheCacheImplProperties =

  //#region ComDayCqReportingImplCacheCacheImplProperties

  [<CLIMutable>]
  type ComDayCqReportingImplCacheCacheImplProperties = {
    [<JsonProperty(PropertyName = "repcache.enable")>]
    RepcacheEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "repcache.ttl")>]
    RepcacheTtl : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "repcache.max")>]
    RepcacheMax : ConfigNodePropertyInteger;
  }

  //#endregion
