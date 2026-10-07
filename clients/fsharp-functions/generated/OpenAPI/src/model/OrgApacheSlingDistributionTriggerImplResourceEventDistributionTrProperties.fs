namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties =

  //#region OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
  }

  //#endregion
