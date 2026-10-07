namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties

module ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo =

  //#region ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties;
  }

  //#endregion
