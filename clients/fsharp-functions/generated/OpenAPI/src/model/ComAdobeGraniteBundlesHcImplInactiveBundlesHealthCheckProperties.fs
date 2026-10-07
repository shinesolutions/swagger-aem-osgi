namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "ignored.bundles")>]
    IgnoredBundles : ConfigNodePropertyArray;
  }

  //#endregion
