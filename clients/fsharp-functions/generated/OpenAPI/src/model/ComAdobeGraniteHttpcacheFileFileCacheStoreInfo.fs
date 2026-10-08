namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteHttpcacheFileFileCacheStoreProperties

module ComAdobeGraniteHttpcacheFileFileCacheStoreInfo =

  //#region ComAdobeGraniteHttpcacheFileFileCacheStoreInfo

  [<CLIMutable>]
  type ComAdobeGraniteHttpcacheFileFileCacheStoreInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteHttpcacheFileFileCacheStoreProperties;
  }

  //#endregion
