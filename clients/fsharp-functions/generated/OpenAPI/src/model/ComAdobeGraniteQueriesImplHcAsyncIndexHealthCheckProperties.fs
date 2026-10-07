namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties =

  //#region ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = {
    [<JsonProperty(PropertyName = "indexing.critical.threshold")>]
    IndexingCriticalThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "indexing.warn.threshold")>]
    IndexingWarnThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
