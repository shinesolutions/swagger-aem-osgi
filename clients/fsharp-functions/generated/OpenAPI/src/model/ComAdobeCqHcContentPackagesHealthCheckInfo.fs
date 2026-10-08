namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqHcContentPackagesHealthCheckProperties

module ComAdobeCqHcContentPackagesHealthCheckInfo =

  //#region ComAdobeCqHcContentPackagesHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeCqHcContentPackagesHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqHcContentPackagesHealthCheckProperties;
  }

  //#endregion
