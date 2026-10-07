namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamHandlerStandardPdfPdfHandlerProperties =

  //#region ComDayCqDamHandlerStandardPdfPdfHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamHandlerStandardPdfPdfHandlerProperties = {
    [<JsonProperty(PropertyName = "raster.annotation")>]
    RasterAnnotation : ConfigNodePropertyBoolean;
  }

  //#endregion
