namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplDamEventRecorderImplProperties

module ComDayCqDamCoreImplDamEventRecorderImplInfo =

  //#region ComDayCqDamCoreImplDamEventRecorderImplInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplDamEventRecorderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplDamEventRecorderImplProperties;
  }

  //#endregion
