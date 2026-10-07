namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationAuditReplicationEventListenerProperties =

  //#region ComDayCqReplicationAuditReplicationEventListenerProperties

  [<CLIMutable>]
  type ComDayCqReplicationAuditReplicationEventListenerProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
