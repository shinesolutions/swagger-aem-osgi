namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties

module ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo =

  //#region ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo

  [<CLIMutable>]
  type ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties;
  }

  //#endregion
