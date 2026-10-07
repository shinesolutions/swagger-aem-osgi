namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties =

  //#region ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties = {
    [<JsonProperty(PropertyName = "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled")>]
    CqDamS7damDynamicmediaconfigeventlistenerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
