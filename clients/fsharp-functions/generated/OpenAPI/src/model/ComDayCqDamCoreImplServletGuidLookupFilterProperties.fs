namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplServletGuidLookupFilterProperties =

  //#region ComDayCqDamCoreImplServletGuidLookupFilterProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletGuidLookupFilterProperties = {
    [<JsonProperty(PropertyName = "cq.dam.core.guidlookupfilter.enabled")>]
    CqDamCoreGuidlookupfilterEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
