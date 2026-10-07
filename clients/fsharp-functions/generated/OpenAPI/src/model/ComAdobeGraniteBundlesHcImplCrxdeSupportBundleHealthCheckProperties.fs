namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
