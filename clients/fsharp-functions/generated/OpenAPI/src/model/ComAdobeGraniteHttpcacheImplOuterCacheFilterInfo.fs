namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties

module ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo =

  //#region ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo

  [<CLIMutable>]
  type ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties;
  }

  //#endregion
