namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties

module ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo =

  //#region ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties;
  }

  //#endregion
