namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWcmCoreImplWCMDebugFilterProperties =

  //#region ComDayCqWcmCoreImplWCMDebugFilterProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplWCMDebugFilterProperties = {
    [<JsonProperty(PropertyName = "wcmdbgfilter.enabled")>]
    WcmdbgfilterEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "wcmdbgfilter.jspDebug")>]
    WcmdbgfilterJspDebug : ConfigNodePropertyBoolean;
  }

  //#endregion
