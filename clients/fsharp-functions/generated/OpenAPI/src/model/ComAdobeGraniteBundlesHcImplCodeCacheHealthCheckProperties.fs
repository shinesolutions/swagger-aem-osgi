namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "minimum.code.cache.size")>]
    MinimumCodeCacheSize : ConfigNodePropertyInteger;
  }

  //#endregion
