namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamHandlerStandardPsPostScriptHandlerProperties =

  //#region ComDayCqDamHandlerStandardPsPostScriptHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamHandlerStandardPsPostScriptHandlerProperties = {
    [<JsonProperty(PropertyName = "raster.annotation")>]
    RasterAnnotation : ConfigNodePropertyBoolean;
  }

  //#endregion
