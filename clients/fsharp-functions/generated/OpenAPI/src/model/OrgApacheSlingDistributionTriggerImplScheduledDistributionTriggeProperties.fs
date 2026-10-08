namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties =

  //#region OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "seconds")>]
    Seconds : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
  }

  //#endregion
