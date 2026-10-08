namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties

module OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo =

  //#region OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties;
  }

  //#endregion
