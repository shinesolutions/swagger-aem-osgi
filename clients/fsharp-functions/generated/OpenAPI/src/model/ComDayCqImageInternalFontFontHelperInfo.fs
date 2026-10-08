namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqImageInternalFontFontHelperProperties

module ComDayCqImageInternalFontFontHelperInfo =

  //#region ComDayCqImageInternalFontFontHelperInfo

  [<CLIMutable>]
  type ComDayCqImageInternalFontFontHelperInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqImageInternalFontFontHelperProperties;
  }

  //#endregion
