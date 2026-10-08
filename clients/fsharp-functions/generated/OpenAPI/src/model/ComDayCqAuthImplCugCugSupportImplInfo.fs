namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAuthImplCugCugSupportImplProperties

module ComDayCqAuthImplCugCugSupportImplInfo =

  //#region ComDayCqAuthImplCugCugSupportImplInfo

  [<CLIMutable>]
  type ComDayCqAuthImplCugCugSupportImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAuthImplCugCugSupportImplProperties;
  }

  //#endregion
