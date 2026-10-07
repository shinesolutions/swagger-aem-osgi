namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteLoggingImplLogAnalyserImplProperties

module ComAdobeGraniteLoggingImplLogAnalyserImplInfo =

  //#region ComAdobeGraniteLoggingImplLogAnalyserImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteLoggingImplLogAnalyserImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteLoggingImplLogAnalyserImplProperties;
  }

  //#endregion
