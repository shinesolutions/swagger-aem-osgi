namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqImageInternalFontFontHelperProperties =

  //#region ComDayCqImageInternalFontFontHelperProperties

  [<CLIMutable>]
  type ComDayCqImageInternalFontFontHelperProperties = {
    [<JsonProperty(PropertyName = "fontpath")>]
    Fontpath : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "oversamplingFactor")>]
    OversamplingFactor : ConfigNodePropertyInteger;
  }

  //#endregion
