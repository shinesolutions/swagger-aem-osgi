namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties

module ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo =

  //#region ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties;
  }

  //#endregion
