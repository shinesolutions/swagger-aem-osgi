namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties =

  //#region ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
