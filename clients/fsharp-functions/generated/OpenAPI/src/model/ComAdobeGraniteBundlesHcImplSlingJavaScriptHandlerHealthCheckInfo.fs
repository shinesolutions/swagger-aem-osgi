namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties

module ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties;
  }

  //#endregion
