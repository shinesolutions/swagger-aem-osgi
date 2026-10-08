namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletResourceCollectionServletProperties

module ComDayCqDamCoreImplServletResourceCollectionServletInfo =

  //#region ComDayCqDamCoreImplServletResourceCollectionServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletResourceCollectionServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletResourceCollectionServletProperties;
  }

  //#endregion
