namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplCommandsWCMCommandServletProperties

module ComDayCqWcmCoreImplCommandsWCMCommandServletInfo =

  //#region ComDayCqWcmCoreImplCommandsWCMCommandServletInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplCommandsWCMCommandServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplCommandsWCMCommandServletProperties;
  }

  //#endregion
