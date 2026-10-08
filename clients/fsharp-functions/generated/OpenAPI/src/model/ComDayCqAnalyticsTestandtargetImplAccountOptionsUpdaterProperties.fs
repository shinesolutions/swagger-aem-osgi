namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties =

  //#region ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.accountoptionsupdater.enabled")>]
    CqAnalyticsTestandtargetAccountoptionsupdaterEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
