namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteMonitoringImplScriptConfigImplProperties

module ComAdobeGraniteMonitoringImplScriptConfigImplInfo =

  //#region ComAdobeGraniteMonitoringImplScriptConfigImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteMonitoringImplScriptConfigImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteMonitoringImplScriptConfigImplProperties;
  }

  //#endregion
