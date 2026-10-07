namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties

module ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo =

  //#region ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo

  [<CLIMutable>]
  type ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties;
  }

  //#endregion
