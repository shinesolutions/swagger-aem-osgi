namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties

module OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo =

  //#region OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties;
  }

  //#endregion
