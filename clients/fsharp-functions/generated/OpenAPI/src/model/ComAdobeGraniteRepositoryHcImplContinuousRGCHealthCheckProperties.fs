namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties =

  //#region ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
