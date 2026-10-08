namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties

module ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo =

  //#region ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo

  [<CLIMutable>]
  type ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties;
  }

  //#endregion
