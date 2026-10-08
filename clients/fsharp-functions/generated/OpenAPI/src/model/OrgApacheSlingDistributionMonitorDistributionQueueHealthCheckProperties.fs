namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties =

  //#region OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "numberOfRetriesAllowed")>]
    NumberOfRetriesAllowed : ConfigNodePropertyInteger;
  }

  //#endregion
