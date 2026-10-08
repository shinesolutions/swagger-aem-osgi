namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletCollectionServletProperties

module ComDayCqDamCoreImplServletCollectionServletInfo =

  //#region ComDayCqDamCoreImplServletCollectionServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCollectionServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletCollectionServletProperties;
  }

  //#endregion
