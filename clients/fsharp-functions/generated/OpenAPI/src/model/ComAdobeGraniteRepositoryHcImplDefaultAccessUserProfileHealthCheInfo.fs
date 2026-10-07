namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties

module ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo =

  //#region ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties;
  }

  //#endregion
