namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties

module ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties;
  }

  //#endregion
