namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties =

  //#region OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
  }

  //#endregion
