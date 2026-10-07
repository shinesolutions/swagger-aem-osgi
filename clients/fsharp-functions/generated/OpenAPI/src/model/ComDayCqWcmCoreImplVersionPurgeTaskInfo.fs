namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplVersionPurgeTaskProperties

module ComDayCqWcmCoreImplVersionPurgeTaskInfo =

  //#region ComDayCqWcmCoreImplVersionPurgeTaskInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplVersionPurgeTaskInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplVersionPurgeTaskProperties;
  }

  //#endregion
