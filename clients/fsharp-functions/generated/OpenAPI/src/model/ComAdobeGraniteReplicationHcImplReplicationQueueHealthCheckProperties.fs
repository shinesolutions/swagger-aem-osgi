namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties =

  //#region ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties = {
    [<JsonProperty(PropertyName = "number.of.retries.allowed")>]
    NumberOfRetriesAllowed : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
