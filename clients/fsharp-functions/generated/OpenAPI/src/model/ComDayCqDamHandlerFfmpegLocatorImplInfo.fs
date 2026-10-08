namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamHandlerFfmpegLocatorImplProperties

module ComDayCqDamHandlerFfmpegLocatorImplInfo =

  //#region ComDayCqDamHandlerFfmpegLocatorImplInfo

  [<CLIMutable>]
  type ComDayCqDamHandlerFfmpegLocatorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamHandlerFfmpegLocatorImplProperties;
  }

  //#endregion
