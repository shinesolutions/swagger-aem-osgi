namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties =

  //#region ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
