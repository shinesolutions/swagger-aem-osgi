namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties

module ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo =

  //#region ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties;
  }

  //#endregion
