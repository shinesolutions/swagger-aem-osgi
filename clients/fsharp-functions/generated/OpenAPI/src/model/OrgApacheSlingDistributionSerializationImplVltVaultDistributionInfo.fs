namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

module OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo =

  //#region OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties;
  }

  //#endregion
