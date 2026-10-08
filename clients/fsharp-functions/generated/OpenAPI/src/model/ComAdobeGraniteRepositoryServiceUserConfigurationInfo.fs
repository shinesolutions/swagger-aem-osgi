namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryServiceUserConfigurationProperties

module ComAdobeGraniteRepositoryServiceUserConfigurationInfo =

  //#region ComAdobeGraniteRepositoryServiceUserConfigurationInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryServiceUserConfigurationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryServiceUserConfigurationProperties;
  }

  //#endregion
