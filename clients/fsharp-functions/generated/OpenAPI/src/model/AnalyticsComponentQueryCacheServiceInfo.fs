namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnalyticsComponentQueryCacheServiceProperties

module AnalyticsComponentQueryCacheServiceInfo =

  //#region AnalyticsComponentQueryCacheServiceInfo

  [<CLIMutable>]
  type AnalyticsComponentQueryCacheServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : AnalyticsComponentQueryCacheServiceProperties;
  }

  //#endregion
