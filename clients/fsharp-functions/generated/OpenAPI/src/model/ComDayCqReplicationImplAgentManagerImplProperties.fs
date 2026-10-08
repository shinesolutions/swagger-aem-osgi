namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqReplicationImplAgentManagerImplProperties =

  //#region ComDayCqReplicationImplAgentManagerImplProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplAgentManagerImplProperties = {
    [<JsonProperty(PropertyName = "job.topics")>]
    JobTopics : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceUser.target")>]
    ServiceUserTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "agentProvider.target")>]
    AgentProviderTarget : ConfigNodePropertyString;
  }

  //#endregion
