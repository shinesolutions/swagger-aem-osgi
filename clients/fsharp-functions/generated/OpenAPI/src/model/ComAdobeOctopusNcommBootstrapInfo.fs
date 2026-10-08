namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeOctopusNcommBootstrapProperties

module ComAdobeOctopusNcommBootstrapInfo =

  //#region ComAdobeOctopusNcommBootstrapInfo

  [<CLIMutable>]
  type ComAdobeOctopusNcommBootstrapInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeOctopusNcommBootstrapProperties;
  }

  //#endregion
