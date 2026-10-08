namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamHandlerStandardPsdPsdHandlerProperties

module ComDayCqDamHandlerStandardPsdPsdHandlerInfo =

  //#region ComDayCqDamHandlerStandardPsdPsdHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamHandlerStandardPsdPsdHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamHandlerStandardPsdPsdHandlerProperties;
  }

  //#endregion
