namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationImplHTTPAuthHandlerProperties

module ComDayCqWcmFoundationImplHTTPAuthHandlerInfo =

  //#region ComDayCqWcmFoundationImplHTTPAuthHandlerInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplHTTPAuthHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationImplHTTPAuthHandlerProperties;
  }

  //#endregion
