namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties

module ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties;
  }

  //#endregion
