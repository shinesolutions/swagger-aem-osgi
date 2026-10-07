namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletAssetXMPSearchServletProperties

module ComDayCqDamCoreImplServletAssetXMPSearchServletInfo =

  //#region ComDayCqDamCoreImplServletAssetXMPSearchServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletAssetXMPSearchServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletAssetXMPSearchServletProperties;
  }

  //#endregion
