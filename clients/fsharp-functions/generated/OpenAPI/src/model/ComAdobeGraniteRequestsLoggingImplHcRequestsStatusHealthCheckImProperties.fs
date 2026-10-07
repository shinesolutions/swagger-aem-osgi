namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties =

  //#region ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties

  [<CLIMutable>]
  type ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
