namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties

module OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo =

  //#region OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties;
  }

  //#endregion
