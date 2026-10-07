namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties =

  //#region ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties = {
    [<JsonProperty(PropertyName = "large.index.critical.threshold")>]
    LargeIndexCriticalThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "large.index.warn.threshold")>]
    LargeIndexWarnThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
