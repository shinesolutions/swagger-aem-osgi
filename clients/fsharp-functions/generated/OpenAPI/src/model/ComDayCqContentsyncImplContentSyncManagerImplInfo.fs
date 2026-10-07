namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqContentsyncImplContentSyncManagerImplProperties

module ComDayCqContentsyncImplContentSyncManagerImplInfo =

  //#region ComDayCqContentsyncImplContentSyncManagerImplInfo

  [<CLIMutable>]
  type ComDayCqContentsyncImplContentSyncManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqContentsyncImplContentSyncManagerImplProperties;
  }

  //#endregion
