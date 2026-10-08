namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqDamHandlerFfmpegLocatorImplProperties =

  //#region ComDayCqDamHandlerFfmpegLocatorImplProperties

  [<CLIMutable>]
  type ComDayCqDamHandlerFfmpegLocatorImplProperties = {
    [<JsonProperty(PropertyName = "executable.searchpath")>]
    ExecutableSearchpath : ConfigNodePropertyArray;
  }

  //#endregion
