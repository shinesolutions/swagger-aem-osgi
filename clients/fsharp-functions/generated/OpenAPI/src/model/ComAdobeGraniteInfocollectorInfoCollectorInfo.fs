namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteInfocollectorInfoCollectorProperties

module ComAdobeGraniteInfocollectorInfoCollectorInfo =

  //#region ComAdobeGraniteInfocollectorInfoCollectorInfo

  [<CLIMutable>]
  type ComAdobeGraniteInfocollectorInfoCollectorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteInfocollectorInfoCollectorProperties;
  }

  //#endregion
