namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties

module OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo =

  //#region OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties;
  }

  //#endregion
