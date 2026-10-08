namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module AnalyticsComponentQueryCacheServiceProperties =

  //#region AnalyticsComponentQueryCacheServiceProperties

  [<CLIMutable>]
  type AnalyticsComponentQueryCacheServiceProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.component.query.cache.size")>]
    CqAnalyticsComponentQueryCacheSize : ConfigNodePropertyInteger;
  }

  //#endregion
