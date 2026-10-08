namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties

module ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo =

  //#region ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties;
  }

  //#endregion
