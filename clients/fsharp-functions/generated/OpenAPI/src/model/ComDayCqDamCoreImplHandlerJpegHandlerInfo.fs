namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplHandlerJpegHandlerProperties

module ComDayCqDamCoreImplHandlerJpegHandlerInfo =

  //#region ComDayCqDamCoreImplHandlerJpegHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplHandlerJpegHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplHandlerJpegHandlerProperties;
  }

  //#endregion
