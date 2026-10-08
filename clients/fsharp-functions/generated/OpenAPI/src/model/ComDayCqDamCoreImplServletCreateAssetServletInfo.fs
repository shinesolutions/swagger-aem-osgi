namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletCreateAssetServletProperties

module ComDayCqDamCoreImplServletCreateAssetServletInfo =

  //#region ComDayCqDamCoreImplServletCreateAssetServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCreateAssetServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletCreateAssetServletProperties;
  }

  //#endregion
