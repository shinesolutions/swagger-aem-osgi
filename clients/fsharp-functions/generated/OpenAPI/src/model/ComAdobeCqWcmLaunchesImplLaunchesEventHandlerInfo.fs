namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties

module ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo =

  //#region ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo

  [<CLIMutable>]
  type ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties;
  }

  //#endregion
