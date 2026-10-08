namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
