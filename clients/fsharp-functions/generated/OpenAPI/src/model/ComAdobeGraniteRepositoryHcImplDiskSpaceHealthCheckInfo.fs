namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties

module ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo =

  //#region ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties;
  }

  //#endregion
