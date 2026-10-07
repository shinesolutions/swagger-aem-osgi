namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties

module ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties;
  }

  //#endregion
