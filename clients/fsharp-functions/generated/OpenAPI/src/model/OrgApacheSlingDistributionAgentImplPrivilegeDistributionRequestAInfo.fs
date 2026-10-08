namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties

module OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo =

  //#region OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties;
  }

  //#endregion
