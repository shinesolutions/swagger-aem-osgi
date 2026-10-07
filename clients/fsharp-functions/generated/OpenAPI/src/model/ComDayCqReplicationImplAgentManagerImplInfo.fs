namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReplicationImplAgentManagerImplProperties

module ComDayCqReplicationImplAgentManagerImplInfo =

  //#region ComDayCqReplicationImplAgentManagerImplInfo

  [<CLIMutable>]
  type ComDayCqReplicationImplAgentManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReplicationImplAgentManagerImplProperties;
  }

  //#endregion
