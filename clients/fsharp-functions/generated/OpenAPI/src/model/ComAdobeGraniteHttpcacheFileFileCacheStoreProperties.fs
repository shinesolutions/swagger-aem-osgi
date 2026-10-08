namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteHttpcacheFileFileCacheStoreProperties =

  //#region ComAdobeGraniteHttpcacheFileFileCacheStoreProperties

  [<CLIMutable>]
  type ComAdobeGraniteHttpcacheFileFileCacheStoreProperties = {
    [<JsonProperty(PropertyName = "com.adobe.granite.httpcache.file.documentRoot")>]
    ComAdobeGraniteHttpcacheFileDocumentRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.granite.httpcache.file.includeHost")>]
    ComAdobeGraniteHttpcacheFileIncludeHost : ConfigNodePropertyString;
  }

  //#endregion
