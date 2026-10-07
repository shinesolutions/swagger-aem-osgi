namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties

module ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo =

  //#region ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties;
  }

  //#endregion
