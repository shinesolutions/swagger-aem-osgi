namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

module OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo =

  //#region OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties;
  }

  //#endregion
