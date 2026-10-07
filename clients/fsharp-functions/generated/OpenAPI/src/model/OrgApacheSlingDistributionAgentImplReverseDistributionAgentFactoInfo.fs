namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties

module OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo =

  //#region OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties;
  }

  //#endregion
