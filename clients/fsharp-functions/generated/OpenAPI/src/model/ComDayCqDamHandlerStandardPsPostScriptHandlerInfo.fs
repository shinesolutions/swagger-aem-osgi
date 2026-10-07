namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamHandlerStandardPsPostScriptHandlerProperties

module ComDayCqDamHandlerStandardPsPostScriptHandlerInfo =

  //#region ComDayCqDamHandlerStandardPsPostScriptHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamHandlerStandardPsPostScriptHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamHandlerStandardPsPostScriptHandlerProperties;
  }

  //#endregion
