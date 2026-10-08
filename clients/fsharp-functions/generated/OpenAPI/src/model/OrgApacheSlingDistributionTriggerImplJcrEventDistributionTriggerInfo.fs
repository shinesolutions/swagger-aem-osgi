namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties

module OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo =

  //#region OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties;
  }

  //#endregion
