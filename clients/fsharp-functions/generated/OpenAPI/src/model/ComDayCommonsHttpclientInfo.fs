namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCommonsHttpclientProperties

module ComDayCommonsHttpclientInfo =

  //#region ComDayCommonsHttpclientInfo

  [<CLIMutable>]
  type ComDayCommonsHttpclientInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCommonsHttpclientProperties;
  }

  //#endregion
