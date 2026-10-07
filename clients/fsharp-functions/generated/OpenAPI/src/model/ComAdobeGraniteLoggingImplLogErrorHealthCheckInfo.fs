namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties

module ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo =

  //#region ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties;
  }

  //#endregion
