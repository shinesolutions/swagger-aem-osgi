namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreProcessMetadataProcessorProcessProperties

module ComDayCqDamCoreProcessMetadataProcessorProcessInfo =

  //#region ComDayCqDamCoreProcessMetadataProcessorProcessInfo

  [<CLIMutable>]
  type ComDayCqDamCoreProcessMetadataProcessorProcessInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreProcessMetadataProcessorProcessProperties;
  }

  //#endregion
