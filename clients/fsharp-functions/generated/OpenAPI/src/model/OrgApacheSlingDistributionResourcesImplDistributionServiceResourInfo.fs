namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties

module OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo =

  //#region OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties;
  }

  //#endregion
