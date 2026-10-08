namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletAssetStatusServletProperties

module ComDayCqDamCoreImplServletAssetStatusServletInfo =

  //#region ComDayCqDamCoreImplServletAssetStatusServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletAssetStatusServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletAssetStatusServletProperties;
  }

  //#endregion
