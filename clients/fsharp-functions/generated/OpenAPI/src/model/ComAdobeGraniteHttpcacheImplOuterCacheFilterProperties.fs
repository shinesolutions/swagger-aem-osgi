namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties =

  //#region ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties

  [<CLIMutable>]
  type ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties = {
    [<JsonProperty(PropertyName = "com.adobe.granite.httpcache.url.paths")>]
    ComAdobeGraniteHttpcacheUrlPaths : ConfigNodePropertyArray;
  }

  //#endregion
