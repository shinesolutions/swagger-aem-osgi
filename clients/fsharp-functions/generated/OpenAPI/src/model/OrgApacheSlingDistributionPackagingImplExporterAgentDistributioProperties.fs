namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties =

  //#region OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "queue")>]
    Queue : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "drop.invalid.items")>]
    DropInvalidItems : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "agent.target")>]
    AgentTarget : ConfigNodePropertyString;
  }

  //#endregion
