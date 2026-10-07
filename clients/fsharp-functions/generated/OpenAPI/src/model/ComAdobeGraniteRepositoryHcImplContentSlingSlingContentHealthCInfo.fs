namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties

module ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo =

  //#region ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties;
  }

  //#endregion
