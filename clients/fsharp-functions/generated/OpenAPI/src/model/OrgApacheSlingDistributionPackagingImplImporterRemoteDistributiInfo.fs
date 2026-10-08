namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties

module OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo =

  //#region OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties;
  }

  //#endregion
