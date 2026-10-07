namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties =

  //#region ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties = {
    [<JsonProperty(PropertyName = "wcmdevmodefilter.enabled")>]
    WcmdevmodefilterEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
