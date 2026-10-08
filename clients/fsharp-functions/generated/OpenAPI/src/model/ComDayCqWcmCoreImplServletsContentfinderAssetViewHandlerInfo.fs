namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties

module ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo =

  //#region ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties;
  }

  //#endregion
