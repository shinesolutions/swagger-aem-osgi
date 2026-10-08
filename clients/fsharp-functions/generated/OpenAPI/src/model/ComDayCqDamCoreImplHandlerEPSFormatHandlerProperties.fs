namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties =

  //#region ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties = {
    [<JsonProperty(PropertyName = "mimetype")>]
    Mimetype : ConfigNodePropertyString;
  }

  //#endregion
