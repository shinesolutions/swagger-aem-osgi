namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletCompanionServletProperties

module ComDayCqDamCoreImplServletCompanionServletInfo =

  //#region ComDayCqDamCoreImplServletCompanionServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCompanionServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletCompanionServletProperties;
  }

  //#endregion
