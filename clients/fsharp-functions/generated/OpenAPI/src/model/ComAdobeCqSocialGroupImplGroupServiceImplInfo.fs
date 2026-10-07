namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialGroupImplGroupServiceImplProperties

module ComAdobeCqSocialGroupImplGroupServiceImplInfo =

  //#region ComAdobeCqSocialGroupImplGroupServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialGroupImplGroupServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialGroupImplGroupServiceImplProperties;
  }

  //#endregion
