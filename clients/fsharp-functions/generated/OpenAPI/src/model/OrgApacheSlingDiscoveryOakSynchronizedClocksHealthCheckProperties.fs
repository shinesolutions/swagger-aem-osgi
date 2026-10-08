namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties =

  //#region OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties

  [<CLIMutable>]
  type OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.name")>]
    HcName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "hc.mbean.name")>]
    HcMbeanName : ConfigNodePropertyString;
  }

  //#endregion
