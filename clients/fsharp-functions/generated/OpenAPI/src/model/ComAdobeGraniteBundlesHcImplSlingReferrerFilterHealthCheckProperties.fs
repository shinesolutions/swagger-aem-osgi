namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
