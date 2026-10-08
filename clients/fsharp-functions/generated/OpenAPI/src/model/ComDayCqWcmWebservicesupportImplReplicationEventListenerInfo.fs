namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties

module ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo =

  //#region ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo

  [<CLIMutable>]
  type ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties;
  }

  //#endregion
