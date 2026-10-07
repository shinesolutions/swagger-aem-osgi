namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMailerDefaultMailServiceProperties

module ComDayCqMailerDefaultMailServiceInfo =

  //#region ComDayCqMailerDefaultMailServiceInfo

  [<CLIMutable>]
  type ComDayCqMailerDefaultMailServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMailerDefaultMailServiceProperties;
  }

  //#endregion
