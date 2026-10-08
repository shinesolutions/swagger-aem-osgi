namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties

module ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo =

  //#region ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties;
  }

  //#endregion
