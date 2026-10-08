namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties =

  //#region ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled")>]
    CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
