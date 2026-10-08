namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties

module ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo =

  //#region ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties;
  }

  //#endregion
