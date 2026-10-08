namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletHealthCheckServletProperties

module ComDayCqDamCoreImplServletHealthCheckServletInfo =

  //#region ComDayCqDamCoreImplServletHealthCheckServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletHealthCheckServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletHealthCheckServletProperties;
  }

  //#endregion
