namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties

module ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo =

  //#region ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo

  [<CLIMutable>]
  type ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties;
  }

  //#endregion
