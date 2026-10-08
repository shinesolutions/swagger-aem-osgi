namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties

module ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo =

  //#region ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo

  [<CLIMutable>]
  type ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties;
  }

  //#endregion
