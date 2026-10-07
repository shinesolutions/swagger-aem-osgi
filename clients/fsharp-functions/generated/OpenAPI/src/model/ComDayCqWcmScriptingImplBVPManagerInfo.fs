namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmScriptingImplBVPManagerProperties

module ComDayCqWcmScriptingImplBVPManagerInfo =

  //#region ComDayCqWcmScriptingImplBVPManagerInfo

  [<CLIMutable>]
  type ComDayCqWcmScriptingImplBVPManagerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmScriptingImplBVPManagerProperties;
  }

  //#endregion
