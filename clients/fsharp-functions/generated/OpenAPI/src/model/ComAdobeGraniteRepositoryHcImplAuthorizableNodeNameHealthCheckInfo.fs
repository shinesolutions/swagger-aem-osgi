namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties

module ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo =

  //#region ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties;
  }

  //#endregion
