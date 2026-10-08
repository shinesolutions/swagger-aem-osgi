namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties

module ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo =

  //#region ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties;
  }

  //#endregion
