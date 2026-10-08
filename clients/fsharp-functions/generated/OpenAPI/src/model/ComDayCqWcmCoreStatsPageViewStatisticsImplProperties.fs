namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreStatsPageViewStatisticsImplProperties =

  //#region ComDayCqWcmCoreStatsPageViewStatisticsImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreStatsPageViewStatisticsImplProperties = {
    [<JsonProperty(PropertyName = "pageviewstatistics.trackingurl")>]
    PageviewstatisticsTrackingurl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pageviewstatistics.trackingscript.enabled")>]
    PageviewstatisticsTrackingscriptEnabled : ConfigNodePropertyString;
  }

  //#endregion
