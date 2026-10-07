namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown

module ComDayCqWcmCoreWCMRequestFilterProperties =

  //#region ComDayCqWcmCoreWCMRequestFilterProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreWCMRequestFilterProperties = {
    [<JsonProperty(PropertyName = "wcmfilter.mode")>]
    WcmfilterMode : ConfigNodePropertyDropDown;
  }

  //#endregion
