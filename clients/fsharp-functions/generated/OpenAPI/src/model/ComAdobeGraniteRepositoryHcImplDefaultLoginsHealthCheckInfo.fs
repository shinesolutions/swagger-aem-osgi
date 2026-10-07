namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties

module ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo =

  //#region ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties;
  }

  //#endregion
