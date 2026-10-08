namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties

module ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo =

  //#region ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo

  [<CLIMutable>]
  type ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties;
  }

  //#endregion
