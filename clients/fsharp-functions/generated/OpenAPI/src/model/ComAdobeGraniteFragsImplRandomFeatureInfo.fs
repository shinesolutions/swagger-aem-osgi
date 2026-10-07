namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteFragsImplRandomFeatureProperties

module ComAdobeGraniteFragsImplRandomFeatureInfo =

  //#region ComAdobeGraniteFragsImplRandomFeatureInfo

  [<CLIMutable>]
  type ComAdobeGraniteFragsImplRandomFeatureInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteFragsImplRandomFeatureProperties;
  }

  //#endregion
