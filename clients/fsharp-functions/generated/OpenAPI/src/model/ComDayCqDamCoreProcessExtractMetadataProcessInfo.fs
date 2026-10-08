namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreProcessExtractMetadataProcessProperties

module ComDayCqDamCoreProcessExtractMetadataProcessInfo =

  //#region ComDayCqDamCoreProcessExtractMetadataProcessInfo

  [<CLIMutable>]
  type ComDayCqDamCoreProcessExtractMetadataProcessInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreProcessExtractMetadataProcessProperties;
  }

  //#endregion
