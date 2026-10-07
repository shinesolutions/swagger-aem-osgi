namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAcpPlatformPlatformServletProperties

module ComAdobeGraniteAcpPlatformPlatformServletInfo =

  //#region ComAdobeGraniteAcpPlatformPlatformServletInfo

  [<CLIMutable>]
  type ComAdobeGraniteAcpPlatformPlatformServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAcpPlatformPlatformServletProperties;
  }

  //#endregion
