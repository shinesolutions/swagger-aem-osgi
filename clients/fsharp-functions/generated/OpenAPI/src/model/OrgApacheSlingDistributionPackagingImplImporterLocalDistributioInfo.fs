namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties

module OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo =

  //#region OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties;
  }

  //#endregion
