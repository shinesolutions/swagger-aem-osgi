namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
