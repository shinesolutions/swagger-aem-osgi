namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplDamChangeEventListenerProperties

module ComDayCqDamCoreImplDamChangeEventListenerInfo =

  //#region ComDayCqDamCoreImplDamChangeEventListenerInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplDamChangeEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplDamChangeEventListenerProperties;
  }

  //#endregion
