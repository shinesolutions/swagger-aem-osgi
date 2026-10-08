namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties

module OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo =

  //#region OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties;
  }

  //#endregion
