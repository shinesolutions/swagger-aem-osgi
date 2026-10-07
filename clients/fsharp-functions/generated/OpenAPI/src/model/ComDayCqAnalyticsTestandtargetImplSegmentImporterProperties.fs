namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties =

  //#region ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.segmentimporter.enabled")>]
    CqAnalyticsTestandtargetSegmentimporterEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
