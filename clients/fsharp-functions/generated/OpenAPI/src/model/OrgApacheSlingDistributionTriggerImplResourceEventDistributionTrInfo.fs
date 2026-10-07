namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties

module OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo =

  //#region OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties;
  }

  //#endregion
