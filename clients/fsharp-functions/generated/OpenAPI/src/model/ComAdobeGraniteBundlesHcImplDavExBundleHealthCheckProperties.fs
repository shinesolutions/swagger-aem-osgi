namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
