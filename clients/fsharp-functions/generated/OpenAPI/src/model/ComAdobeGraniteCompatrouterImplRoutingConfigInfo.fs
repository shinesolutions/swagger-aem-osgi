namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteCompatrouterImplRoutingConfigProperties

module ComAdobeGraniteCompatrouterImplRoutingConfigInfo =

  //#region ComAdobeGraniteCompatrouterImplRoutingConfigInfo

  [<CLIMutable>]
  type ComAdobeGraniteCompatrouterImplRoutingConfigInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteCompatrouterImplRoutingConfigProperties;
  }

  //#endregion
