namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReplicationImplReplicationReceiverImplProperties

module ComDayCqReplicationImplReplicationReceiverImplInfo =

  //#region ComDayCqReplicationImplReplicationReceiverImplInfo

  [<CLIMutable>]
  type ComDayCqReplicationImplReplicationReceiverImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReplicationImplReplicationReceiverImplProperties;
  }

  //#endregion
