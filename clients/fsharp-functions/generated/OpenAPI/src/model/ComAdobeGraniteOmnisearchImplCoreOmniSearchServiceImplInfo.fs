namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties

module ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo =

  //#region ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties;
  }

  //#endregion
