namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplWarpTimeWarpFilterProperties =

  //#region ComDayCqWcmCoreImplWarpTimeWarpFilterProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplWarpTimeWarpFilterProperties = {
    [<JsonProperty(PropertyName = "filter.order")>]
    FilterOrder : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "filter.scope")>]
    FilterScope : ConfigNodePropertyString;
  }

  //#endregion
