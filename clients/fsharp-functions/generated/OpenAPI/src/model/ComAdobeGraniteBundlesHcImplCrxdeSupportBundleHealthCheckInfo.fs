namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties

module ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties;
  }

  //#endregion
