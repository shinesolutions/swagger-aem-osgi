namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties

module ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo =

  //#region ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties;
  }

  //#endregion
