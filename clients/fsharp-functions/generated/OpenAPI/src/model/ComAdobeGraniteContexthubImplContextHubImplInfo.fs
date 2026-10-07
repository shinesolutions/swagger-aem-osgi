namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteContexthubImplContextHubImplProperties

module ComAdobeGraniteContexthubImplContextHubImplInfo =

  //#region ComAdobeGraniteContexthubImplContextHubImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteContexthubImplContextHubImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteContexthubImplContextHubImplProperties;
  }

  //#endregion
